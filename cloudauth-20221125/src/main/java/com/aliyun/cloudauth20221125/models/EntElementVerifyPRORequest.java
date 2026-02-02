// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntElementVerifyPRORequest extends TeaModel {
    @NameInMap("EntName")
    public String entName;

    /**
     * <strong>example:</strong>
     * <p>ENT_4META</p>
     */
    @NameInMap("InfoVerifyType")
    public String infoVerifyType;

    /**
     * <strong>example:</strong>
     * <p>370105*****3892</p>
     */
    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    @NameInMap("LegalPersonName")
    public String legalPersonName;

    /**
     * <strong>example:</strong>
     * <p>91330106673959****</p>
     */
    @NameInMap("LicenseNo")
    public String licenseNo;

    /**
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>mch7x9a2b4c8d3e5f6g1h2i3j4k5****</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserAuthorization")
    public String userAuthorization;

    public static EntElementVerifyPRORequest build(java.util.Map<String, ?> map) throws Exception {
        EntElementVerifyPRORequest self = new EntElementVerifyPRORequest();
        return TeaModel.build(map, self);
    }

    public EntElementVerifyPRORequest setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public EntElementVerifyPRORequest setInfoVerifyType(String infoVerifyType) {
        this.infoVerifyType = infoVerifyType;
        return this;
    }
    public String getInfoVerifyType() {
        return this.infoVerifyType;
    }

    public EntElementVerifyPRORequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public EntElementVerifyPRORequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public EntElementVerifyPRORequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public EntElementVerifyPRORequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EntElementVerifyPRORequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EntElementVerifyPRORequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public EntElementVerifyPRORequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

}
