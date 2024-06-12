// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <br>
     * <p>>  On the [My Applications](https://dytns.console.aliyun.com/analysis/apply) page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/overview?spm=a2c4g.608385.0.0.79847f8b3awqUC), you can obtain the authorization code (also known as authorization ID).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The enterprise name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EpCertName")
    public String epCertName;

    /**
     * <p>The business license number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EpCertNo")
    public String epCertNo;

    /**
     * <p>The name of the legal representative.</p>
     * <br>
     * <p>>  If an enterprise has multiple legal representatives, separate them with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LegalPersonCertName")
    public String legalPersonCertName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CompanyThreeElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyThreeElementsVerificationRequest self = new CompanyThreeElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CompanyThreeElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CompanyThreeElementsVerificationRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CompanyThreeElementsVerificationRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CompanyThreeElementsVerificationRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CompanyThreeElementsVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CompanyThreeElementsVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CompanyThreeElementsVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
