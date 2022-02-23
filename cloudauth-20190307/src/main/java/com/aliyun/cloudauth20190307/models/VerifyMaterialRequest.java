// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    @NameInMap("FaceImageUrl")
    @Validation(required = true)
    public String faceImageUrl;

    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    @NameInMap("IdCardNumber")
    @Validation(required = true)
    public String idCardNumber;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("UserId")
    public String userId;

    public static VerifyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialRequest self = new VerifyMaterialRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public VerifyMaterialRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public VerifyMaterialRequest setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
        return this;
    }
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    public VerifyMaterialRequest setIdCardBackImageUrl(String idCardBackImageUrl) {
        this.idCardBackImageUrl = idCardBackImageUrl;
        return this;
    }
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    public VerifyMaterialRequest setIdCardFrontImageUrl(String idCardFrontImageUrl) {
        this.idCardFrontImageUrl = idCardFrontImageUrl;
        return this;
    }
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    public VerifyMaterialRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public VerifyMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VerifyMaterialRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
