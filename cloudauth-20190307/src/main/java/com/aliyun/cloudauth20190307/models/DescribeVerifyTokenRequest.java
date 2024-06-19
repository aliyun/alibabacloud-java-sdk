// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125be683</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPBasicTest</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallbackSeed")
    public String callbackSeed;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("FaceRetainedImageUrl")
    public String faceRetainedImageUrl;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FailedRedirectUrl")
    public String failedRedirectUrl;

    /**
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    /**
     * <strong>example:</strong>
     * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
     */
    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    /**
     * <strong>example:</strong>
     * <p>330100xxxxxxxxxxxx</p>
     */
    @NameInMap("IdCardNumber")
    public String idCardNumber;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PassedRedirectUrl")
    public String passedRedirectUrl;

    /**
     * <strong>example:</strong>
     * <p>user111</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>192.168.<em><strong>.</strong></em></p>
     */
    @NameInMap("UserIp")
    public String userIp;

    /**
     * <strong>example:</strong>
     * <p>187********</p>
     */
    @NameInMap("UserPhoneNumber")
    public String userPhoneNumber;

    /**
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
