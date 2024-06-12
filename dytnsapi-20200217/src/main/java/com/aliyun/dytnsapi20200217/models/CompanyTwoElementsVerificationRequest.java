// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyTwoElementsVerificationRequest extends TeaModel {
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

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CompanyTwoElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyTwoElementsVerificationRequest self = new CompanyTwoElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public CompanyTwoElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public CompanyTwoElementsVerificationRequest setEpCertName(String epCertName) {
        this.epCertName = epCertName;
        return this;
    }
    public String getEpCertName() {
        return this.epCertName;
    }

    public CompanyTwoElementsVerificationRequest setEpCertNo(String epCertNo) {
        this.epCertNo = epCertNo;
        return this;
    }
    public String getEpCertNo() {
        return this.epCertNo;
    }

    public CompanyTwoElementsVerificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CompanyTwoElementsVerificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CompanyTwoElementsVerificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
