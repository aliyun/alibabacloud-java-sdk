// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyFourElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p> On the <a href="https://dytns.console.aliyun.com/analysis/apply">My Applications</a> page in the <a href="https://dytns.console.aliyun.com/overview?spm=a2c4g.608385.0.0.79847f8b3awqUC">Cell Phone Number Service console</a>, you can obtain the authorization code (also known as authorization ID).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dd1r***4id</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The enterprise name.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("EpCertName")
    public String epCertName;

    /**
     * <p>The business license number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9242032*******J627</p>
     */
    @NameInMap("EpCertNo")
    public String epCertNo;

    /**
     * <p>The name of the legal representative.</p>
     * <blockquote>
     * <p> If an enterprise has multiple legal representatives, separate them with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("LegalPersonCertName")
    public String legalPersonCertName;

    /**
     * <p>The ID card number of the legal representative.</p>
     * <blockquote>
     * <p> If an enterprise has multiple legal representatives, separate the ID card numbers with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>331021********0011</p>
     */
    @NameInMap("LegalPersonCertNo")
    public String legalPersonCertNo;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CompanyFourElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyFourElementsVerificationRequest self = new CompanyFourElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CompanyFourElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CompanyFourElementsVerificationRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CompanyFourElementsVerificationRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CompanyFourElementsVerificationRequest setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public CompanyFourElementsVerificationRequest setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public CompanyFourElementsVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CompanyFourElementsVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CompanyFourElementsVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
