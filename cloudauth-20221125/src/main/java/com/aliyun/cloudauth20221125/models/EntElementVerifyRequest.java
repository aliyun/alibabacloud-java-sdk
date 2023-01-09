// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyRequest extends TeaModel {
    @NameInMap("EntName")
    public String entName;

    @NameInMap("InfoVerifyType")
    public String infoVerifyType;

    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    @NameInMap("LegalPersonName")
    public String legalPersonName;

    @NameInMap("LicenseNo")
    public String licenseNo;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("MerchantUserId")
    public String merchantUserId;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("UserAuthorization")
    public String userAuthorization;

    public static EntElementVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyRequest self = new EntElementVerifyRequest();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyRequest setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public EntElementVerifyRequest setInfoVerifyType(String infoVerifyType) {
        this.infoVerifyType = infoVerifyType;
        return this;
    }
    public String getInfoVerifyType() {
        return this.infoVerifyType;
    }

    public EntElementVerifyRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public EntElementVerifyRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public EntElementVerifyRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public EntElementVerifyRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EntElementVerifyRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EntElementVerifyRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public EntElementVerifyRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

}
