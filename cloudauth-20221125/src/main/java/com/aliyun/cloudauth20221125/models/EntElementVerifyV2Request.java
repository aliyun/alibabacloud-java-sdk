// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyV2Request extends TeaModel {
    /**
     * <p>Enterprise Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****有限公司</p>
     */
    @NameInMap("EntName")
    public String entName;

    /**
     * <p>Type of enterprise element verification.</p>
     * <ul>
     * <li>ENT_2META: Two-element verification (enterprise name + unified social credit code)</li>
     * <li>ENT_3META: Three-element verification (enterprise name + unified social credit code + legal person\&quot;s name or organization head)</li>
     * <li>ENT_4META: Four-element verification (enterprise name + unified social credit code + legal person\&quot;s name or organization head + legal person\&quot;s ID number)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ENT_2META</p>
     */
    @NameInMap("InfoVerifyType")
    public String infoVerifyType;

    /**
     * <p>Legal Person\&quot;s ID Number. Required for four-element scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>1******************9</p>
     */
    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    /**
     * <p>Legal Person\&quot;s Name. Required for three-element and four-element scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>张**</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <p>Unified Social Credit Code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>91330106673959****</p>
     */
    @NameInMap("LicenseNo")
    public String licenseNo;

    /**
     * <p>A unique business identifier defined by the merchant side, used for subsequent problem localization and troubleshooting. Supports a combination of letters and numbers, with a maximum length of 32 characters. Please ensure uniqueness.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Merchant-side user ID. Supports a combination of letters and numbers, with a maximum length of 32 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mch7x9a2b4c8d3e5f6g1h2i3j4k5****</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Custom scene code, defined by the user to distinguish between different business scenarios. Supports a combination of letters, numbers, and underscores, with a maximum length of 32 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Whether user authorization has been obtained.</p>
     * <ul>
     * <li>1: Authorization obtained</li>
     * <li>0: No authorization obtained</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserAuthorization")
    public String userAuthorization;

    public static EntElementVerifyV2Request build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyV2Request self = new EntElementVerifyV2Request();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyV2Request setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public EntElementVerifyV2Request setInfoVerifyType(String infoVerifyType) {
        this.infoVerifyType = infoVerifyType;
        return this;
    }
    public String getInfoVerifyType() {
        return this.infoVerifyType;
    }

    public EntElementVerifyV2Request setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public EntElementVerifyV2Request setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public EntElementVerifyV2Request setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public EntElementVerifyV2Request setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EntElementVerifyV2Request setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EntElementVerifyV2Request setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public EntElementVerifyV2Request setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

}
