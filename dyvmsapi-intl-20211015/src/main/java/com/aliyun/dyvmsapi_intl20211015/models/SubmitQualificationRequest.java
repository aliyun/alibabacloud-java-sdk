// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitQualificationRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("BusinessLicenseFileKey")
    public String businessLicenseFileKey;

    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("ContactEmail")
    public String contactEmail;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactPhone")
    public String contactPhone;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("LegalId")
    public String legalId;

    @NameInMap("LegalLicenseFileKey")
    public String legalLicenseFileKey;

    @NameInMap("LegalName")
    public String legalName;

    @NameInMap("NetworkAccessFileKey")
    public String networkAccessFileKey;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UnifiedCode")
    public String unifiedCode;

    public static SubmitQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualificationRequest self = new SubmitQualificationRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualificationRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public SubmitQualificationRequest setBusinessLicenseFileKey(String businessLicenseFileKey) {
        this.businessLicenseFileKey = businessLicenseFileKey;
        return this;
    }
    public String getBusinessLicenseFileKey() {
        return this.businessLicenseFileKey;
    }

    public SubmitQualificationRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SubmitQualificationRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public SubmitQualificationRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SubmitQualificationRequest setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public SubmitQualificationRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitQualificationRequest setLegalId(String legalId) {
        this.legalId = legalId;
        return this;
    }
    public String getLegalId() {
        return this.legalId;
    }

    public SubmitQualificationRequest setLegalLicenseFileKey(String legalLicenseFileKey) {
        this.legalLicenseFileKey = legalLicenseFileKey;
        return this;
    }
    public String getLegalLicenseFileKey() {
        return this.legalLicenseFileKey;
    }

    public SubmitQualificationRequest setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public SubmitQualificationRequest setNetworkAccessFileKey(String networkAccessFileKey) {
        this.networkAccessFileKey = networkAccessFileKey;
        return this;
    }
    public String getNetworkAccessFileKey() {
        return this.networkAccessFileKey;
    }

    public SubmitQualificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitQualificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitQualificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitQualificationRequest setUnifiedCode(String unifiedCode) {
        this.unifiedCode = unifiedCode;
        return this;
    }
    public String getUnifiedCode() {
        return this.unifiedCode;
    }

}
