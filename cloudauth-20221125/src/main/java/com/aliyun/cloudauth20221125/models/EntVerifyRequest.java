// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntVerifyRequest extends TeaModel {
    /**
     * <p>Receiving account, to assist in improving the risk assessment effect.</p>
     * 
     * <strong>example:</strong>
     * <p>321324***38293</p>
     */
    @NameInMap("AccountNo")
    public String accountNo;

    /**
     * <p>Enterprise name.</p>
     * 
     * <strong>example:</strong>
     * <p>***有限公司</p>
     */
    @NameInMap("EntName")
    public String entName;

    /**
     * <p>Enterprise element verification type, currently not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("InfoVerifyType")
    public String infoVerifyType;

    /**
     * <p>Legal person\&quot;s ID number.</p>
     * 
     * <strong>example:</strong>
     * <p>370105*****3892</p>
     */
    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    /**
     * <p>Legal person\&quot;s mobile phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>1300***53</p>
     */
    @NameInMap("LegalPersonMobile")
    public String legalPersonMobile;

    /**
     * <p>Legal person\&quot;s name.</p>
     * 
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>Business license number.</p>
     * 
     * <strong>example:</strong>
     * <p>32132***328932</p>
     */
    @NameInMap("LicenseNo")
    public String licenseNo;

    /**
     * <p>A unique business identifier defined by the merchant, used for subsequent problem localization and troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure its uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>32198****193000</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Merchant-side user ID. It supports a combination of letters and numbers, with a maximum length of 32 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>432***421</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Enterprise risk verification model version, required when RiskVerifyType is not empty. Currently supported:</p>
     * <ul>
     * <li>BASIC: Basic version</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("RiskModelVersion")
    public String riskModelVersion;

    /**
     * <p>Enterprise risk verification type, at least one of InfoVerifyType or this must be selected. Currently supported:</p>
     * <ul>
     * <li>BUSINESS_ANTIFRAUD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS_ANTIFRAUD</p>
     */
    @NameInMap("RiskVerifyType")
    public String riskVerifyType;

    /**
     * <p>Scene code.</p>
     * 
     * <strong>example:</strong>
     * <p>withdraw</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Whether the user authorization is obtained.</p>
     * <ul>
     * <li><p>1: Authorized</p>
     * </li>
     * <li><p>0: Not authorized</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
