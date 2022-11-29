// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntVerifyRequest extends TeaModel {
    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("EntName")
    public String entName;

    @NameInMap("InfoVerifyType")
    public String infoVerifyType;

    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    @NameInMap("LegalPersonMobile")
    public String legalPersonMobile;

    @NameInMap("LegalPersonName")
    public String legalPersonName;

    @NameInMap("LicenseNo")
    public String licenseNo;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("MerchantUserId")
    public String merchantUserId;

    @NameInMap("RiskModelVersion")
    public String riskModelVersion;

    @NameInMap("RiskVerifyType")
    public String riskVerifyType;

    @NameInMap("SceneCode")
    public String sceneCode;

    @NameInMap("UserAuthorization")
    public String userAuthorization;

    public static EntVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        EntVerifyRequest self = new EntVerifyRequest();
        return TeaModel.build(map, self);
    }

    public EntVerifyRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public EntVerifyRequest setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public EntVerifyRequest setInfoVerifyType(String infoVerifyType) {
        this.infoVerifyType = infoVerifyType;
        return this;
    }
    public String getInfoVerifyType() {
        return this.infoVerifyType;
    }

    public EntVerifyRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public EntVerifyRequest setLegalPersonMobile(String legalPersonMobile) {
        this.legalPersonMobile = legalPersonMobile;
        return this;
    }
    public String getLegalPersonMobile() {
        return this.legalPersonMobile;
    }

    public EntVerifyRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public EntVerifyRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public EntVerifyRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EntVerifyRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EntVerifyRequest setRiskModelVersion(String riskModelVersion) {
        this.riskModelVersion = riskModelVersion;
        return this;
    }
    public String getRiskModelVersion() {
        return this.riskModelVersion;
    }

    public EntVerifyRequest setRiskVerifyType(String riskVerifyType) {
        this.riskVerifyType = riskVerifyType;
        return this;
    }
    public String getRiskVerifyType() {
        return this.riskVerifyType;
    }

    public EntVerifyRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public EntVerifyRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

}
