// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSignRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppUrl")
    public String appUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessLicenseCert")
    public String businessLicenseCert;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertType")
    public String certType;

    @NameInMap("ExtendMessage")
    public String extendMessage;

    @NameInMap("OldSmsSignName")
    public String oldSmsSignName;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrganizationCodeCert")
    public String organizationCodeCert;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsSignName")
    public String smsSignName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsSignRemark")
    public String smsSignRemark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SmsSignSource")
    public String smsSignSource;

    @NameInMap("TaxRegistrationCert")
    public String taxRegistrationCert;

    public static CreateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignRequest self = new CreateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignRequest setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }
    public String getAppUrl() {
        return this.appUrl;
    }

    public CreateSmsSignRequest setBusinessLicenseCert(String businessLicenseCert) {
        this.businessLicenseCert = businessLicenseCert;
        return this;
    }
    public String getBusinessLicenseCert() {
        return this.businessLicenseCert;
    }

    public CreateSmsSignRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateSmsSignRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public CreateSmsSignRequest setOldSmsSignName(String oldSmsSignName) {
        this.oldSmsSignName = oldSmsSignName;
        return this;
    }
    public String getOldSmsSignName() {
        return this.oldSmsSignName;
    }

    public CreateSmsSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsSignRequest setOrganizationCodeCert(String organizationCodeCert) {
        this.organizationCodeCert = organizationCodeCert;
        return this;
    }
    public String getOrganizationCodeCert() {
        return this.organizationCodeCert;
    }

    public CreateSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSignRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSignRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public CreateSmsSignRequest setSmsSignRemark(String smsSignRemark) {
        this.smsSignRemark = smsSignRemark;
        return this;
    }
    public String getSmsSignRemark() {
        return this.smsSignRemark;
    }

    public CreateSmsSignRequest setSmsSignSource(String smsSignSource) {
        this.smsSignSource = smsSignSource;
        return this;
    }
    public String getSmsSignSource() {
        return this.smsSignSource;
    }

    public CreateSmsSignRequest setTaxRegistrationCert(String taxRegistrationCert) {
        this.taxRegistrationCert = taxRegistrationCert;
        return this;
    }
    public String getTaxRegistrationCert() {
        return this.taxRegistrationCert;
    }

}
