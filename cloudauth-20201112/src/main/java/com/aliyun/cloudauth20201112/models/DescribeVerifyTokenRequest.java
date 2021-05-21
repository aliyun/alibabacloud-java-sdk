// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DescribeVerifyTokenRequest extends TeaModel {
    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("FaceRetainedImageUrl")
    public String faceRetainedImageUrl;

    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Name")
    public String name;

    @NameInMap("IdCardNumber")
    public String idCardNumber;

    @NameInMap("UserIp")
    public String userIp;

    @NameInMap("UserPhoneNumber")
    public String userPhoneNumber;

    @NameInMap("UserRegistTime")
    public Long userRegistTime;

    public static DescribeVerifyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyTokenRequest self = new DescribeVerifyTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyTokenRequest setIdCardBackImageUrl(String idCardBackImageUrl) {
        this.idCardBackImageUrl = idCardBackImageUrl;
        return this;
    }
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    public DescribeVerifyTokenRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeVerifyTokenRequest setFaceRetainedImageUrl(String faceRetainedImageUrl) {
        this.faceRetainedImageUrl = faceRetainedImageUrl;
        return this;
    }
    public String getFaceRetainedImageUrl() {
        return this.faceRetainedImageUrl;
    }

    public DescribeVerifyTokenRequest setIdCardFrontImageUrl(String idCardFrontImageUrl) {
        this.idCardFrontImageUrl = idCardFrontImageUrl;
        return this;
    }
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    public DescribeVerifyTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeVerifyTokenRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeVerifyTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVerifyTokenRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
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
