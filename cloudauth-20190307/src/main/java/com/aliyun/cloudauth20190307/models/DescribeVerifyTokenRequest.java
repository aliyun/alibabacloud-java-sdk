// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenRequest extends TeaModel {
    /**
     * <p>The authentication ID. A unique ID that identifies an authentication task. The value can be up to 64 characters in length. For a single authentication task, the system supports unlimited submissions until the authentication is passed and the task is completed.</p>
     * <blockquote>
     * <p>Use a different BizId for each different authentication task.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125be683</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The business scenario identifier for using the ID Verification service. Create one in the console first. For more information, see <a href="https://help.aliyun.com/document_detail/127885.html">Business settings</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPBasicTest</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The callback seed.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallbackSeed")
    public String callbackSeed;

    /**
     * <p>The callback URL.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The HTTP or HTTPS URL of the retained face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("FaceRetainedImageUrl")
    public String faceRetainedImageUrl;

    /**
     * <p>The redirect URL upon verification failure.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FailedRedirectUrl")
    public String failedRedirectUrl;

    /**
     * <p>The HTTP or HTTPS URL of the national emblem side of the ID card image.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    /**
     * <p>The HTTP or HTTPS URL of the portrait side of the ID card image.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    /**
     * <p>The ID card number.</p>
     * 
     * <strong>example:</strong>
     * <p>330100xxxxxxxxxxxx</p>
     */
    @NameInMap("IdCardNumber")
    public String idCardNumber;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The redirect URL upon successful verification.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PassedRedirectUrl")
    public String passedRedirectUrl;

    /**
     * <p>The ID of the end user, such as the account ID of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>user111</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The IP address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.<em><strong>.</strong></em></p>
     */
    @NameInMap("UserIp")
    public String userIp;

    /**
     * <p>The phone number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>187********</p>
     */
    @NameInMap("UserPhoneNumber")
    public String userPhoneNumber;

    /**
     * <p>The registration time of the user. Specify the value in UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("UserRegistTime")
    public Long userRegistTime;

    public static DescribeVerifyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenRequest self = new DescribeVerifyTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeVerifyTokenRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeVerifyTokenRequest setCallbackSeed(String callbackSeed) {
        this.callbackSeed = callbackSeed;
        return this;
    }
    public String getCallbackSeed() {
        return this.callbackSeed;
    }

    public DescribeVerifyTokenRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public DescribeVerifyTokenRequest setFaceRetainedImageUrl(String faceRetainedImageUrl) {
        this.faceRetainedImageUrl = faceRetainedImageUrl;
        return this;
    }
    public String getFaceRetainedImageUrl() {
        return this.faceRetainedImageUrl;
    }

    public DescribeVerifyTokenRequest setFailedRedirectUrl(String failedRedirectUrl) {
        this.failedRedirectUrl = failedRedirectUrl;
        return this;
    }
    public String getFailedRedirectUrl() {
        return this.failedRedirectUrl;
    }

    public DescribeVerifyTokenRequest setIdCardBackImageUrl(String idCardBackImageUrl) {
        this.idCardBackImageUrl = idCardBackImageUrl;
        return this;
    }
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    public DescribeVerifyTokenRequest setIdCardFrontImageUrl(String idCardFrontImageUrl) {
        this.idCardFrontImageUrl = idCardFrontImageUrl;
        return this;
    }
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    public DescribeVerifyTokenRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public DescribeVerifyTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVerifyTokenRequest setPassedRedirectUrl(String passedRedirectUrl) {
        this.passedRedirectUrl = passedRedirectUrl;
        return this;
    }
    public String getPassedRedirectUrl() {
        return this.passedRedirectUrl;
    }

    public DescribeVerifyTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeVerifyTokenRequest setUserIp(String userIp) {
        this.userIp = userIp;
        return this;
    }
    public String getUserIp() {
        return this.userIp;
    }

    public DescribeVerifyTokenRequest setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public DescribeVerifyTokenRequest setUserRegistTime(Long userRegistTime) {
        this.userRegistTime = userRegistTime;
        return this;
    }
    public Long getUserRegistTime() {
        return this.userRegistTime;
    }

}
