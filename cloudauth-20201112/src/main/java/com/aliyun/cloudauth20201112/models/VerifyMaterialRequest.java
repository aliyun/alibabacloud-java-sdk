// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class VerifyMaterialRequest extends TeaModel {
    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    @NameInMap("FaceImageUrl")
    public String faceImageUrl;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Name")
    public String name;

    @NameInMap("IdCardNumber")
    public String idCardNumber;

    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    @NameInMap("UserId")
    public String userId;

    public static VerifyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialRequest self = new VerifyMaterialRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialRequest setIdCardBackImageUrl(String idCardBackImageUrl) {
        this.idCardBackImageUrl = idCardBackImageUrl;
        return this;
    }
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    public VerifyMaterialRequest setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
        return this;
    }
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    public VerifyMaterialRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public VerifyMaterialRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public VerifyMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VerifyMaterialRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public VerifyMaterialRequest setIdCardFrontImageUrl(String idCardFrontImageUrl) {
        this.idCardFrontImageUrl = idCardFrontImageUrl;
        return this;
    }
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    public VerifyMaterialRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
