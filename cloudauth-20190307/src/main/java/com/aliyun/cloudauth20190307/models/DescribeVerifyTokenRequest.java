// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenRequest extends TeaModel {
    /**
     * <p>Verification ID. A unique ID that identifies a verification task, not exceeding 64 characters. For a single verification task, the system supports unlimited submissions until the final verification is passed and the task is completed.</p>
     * <blockquote>
     * <p>Different BizIds are required for different verification tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125be683</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Identifier for the business scenario using the real person authentication service. Please refer to <a href="https://help.aliyun.com/document_detail/127885.html">Business Settings</a> and complete the creation in the console first.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPBasicTest</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Callback seed.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallbackSeed")
    public String callbackSeed;

    /**
     * <p>Callback URL.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>HTTP or HTTPS link to the retained portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("FaceRetainedImageUrl")
    public String faceRetainedImageUrl;

    /**
     * <p>Redirect URL for failed verification.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FailedRedirectUrl")
    public String failedRedirectUrl;

    /**
     * <p>HTTP or HTTPS link to the national emblem side of the ID card image.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    /**
     * <p>HTTP or HTTPS link to the portrait side of the ID card image.</p>
     * 
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    /**
     * <p>ID card number.</p>
     * 
     * <strong>example:</strong>
     * <p>330100xxxxxxxxxxxx</p>
     */
    @NameInMap("IdCardNumber")
    public String idCardNumber;

    /**
     * <p>Name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Redirect URL upon successful verification.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PassedRedirectUrl")
    public String passedRedirectUrl;

    /**
     * <p>ID of the end user, such as the account ID of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>user111</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>User IP.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.<em><strong>.</strong></em></p>
     */
    @NameInMap("UserIp")
    public String userIp;

    /**
     * <p>User phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>187********</p>
     */
    @NameInMap("UserPhoneNumber")
    public String userPhoneNumber;

    /**
     * <p>User registration time. Expressed in timestamp format, unit: milliseconds.</p>
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
