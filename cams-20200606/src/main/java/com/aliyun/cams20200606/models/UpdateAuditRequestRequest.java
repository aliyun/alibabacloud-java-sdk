// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAuditRequestRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuditRecord")
    public UpdateAuditRequestRequestAuditRecord auditRecord;

    /**
     * <strong>example:</strong>
     * <p>unAudit</p>
     */
    @NameInMap("AuditResult")
    public String auditResult;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8pi**urn5s</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>114624518**5956096</p>
     */
    @NameInMap("RequestNo")
    public String requestNo;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateAuditRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRequestRequest self = new UpdateAuditRequestRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRequestRequest setAuditRecord(UpdateAuditRequestRequestAuditRecord auditRecord) {
        this.auditRecord = auditRecord;
        return this;
    }
    public UpdateAuditRequestRequestAuditRecord getAuditRecord() {
        return this.auditRecord;
    }

    public UpdateAuditRequestRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public UpdateAuditRequestRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateAuditRequestRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAuditRequestRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public UpdateAuditRequestRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAuditRequestRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class UpdateAuditRequestRequestAuditRecordCompanyAddress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123 Sunshine Street, City, Country</p>
         */
        @NameInMap("CompanyAddress")
        public String companyAddress;

        /**
         * <strong>example:</strong>
         * <p>xxx company</p>
         */
        @NameInMap("CompanyAddressTitle")
        public String companyAddressTitle;

        public static UpdateAuditRequestRequestAuditRecordCompanyAddress build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuditRequestRequestAuditRecordCompanyAddress self = new UpdateAuditRequestRequestAuditRecordCompanyAddress();
            return TeaModel.build(map, self);
        }

        public UpdateAuditRequestRequestAuditRecordCompanyAddress setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        public UpdateAuditRequestRequestAuditRecordCompanyAddress setCompanyAddressTitle(String companyAddressTitle) {
            this.companyAddressTitle = companyAddressTitle;
            return this;
        }
        public String getCompanyAddressTitle() {
            return this.companyAddressTitle;
        }

    }

    public static class UpdateAuditRequestRequestAuditRecordCompanyTel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>07364245xxxx</p>
         */
        @NameInMap("CompanyTelNumber")
        public String companyTelNumber;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CompanyTelTitle")
        public String companyTelTitle;

        public static UpdateAuditRequestRequestAuditRecordCompanyTel build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuditRequestRequestAuditRecordCompanyTel self = new UpdateAuditRequestRequestAuditRecordCompanyTel();
            return TeaModel.build(map, self);
        }

        public UpdateAuditRequestRequestAuditRecordCompanyTel setCompanyTelNumber(String companyTelNumber) {
            this.companyTelNumber = companyTelNumber;
            return this;
        }
        public String getCompanyTelNumber() {
            return this.companyTelNumber;
        }

        public UpdateAuditRequestRequestAuditRecordCompanyTel setCompanyTelTitle(String companyTelTitle) {
            this.companyTelTitle = companyTelTitle;
            return this;
        }
        public String getCompanyTelTitle() {
            return this.companyTelTitle;
        }

    }

    public static class UpdateAuditRequestRequestAuditRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>unlimited</p>
         */
        @NameInMap("AgeLimit")
        public String ageLimit;

        /**
         * <strong>example:</strong>
         * <p>reason</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <strong>example:</strong>
         * <p>testaccount</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        /**
         * <strong>example:</strong>
         * <p>9211515**345</p>
         */
        @NameInMap("BusinessLicenseRegistrationNumber")
        public String businessLicenseRegistrationNumber;

        @NameInMap("CompanyAddress")
        public java.util.List<UpdateAuditRequestRequestAuditRecordCompanyAddress> companyAddress;

        /**
         * <strong>example:</strong>
         * <p>baidu</p>
         */
        @NameInMap("CompanyEnglishName")
        public String companyEnglishName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CompanyLegalName")
        public String companyLegalName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CompanyLegalPerson")
        public String companyLegalPerson;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CompanyProfile")
        public String companyProfile;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CompanyRegisteredCountry")
        public String companyRegisteredCountry;

        @NameInMap("CompanyTel")
        public java.util.List<UpdateAuditRequestRequestAuditRecordCompanyTel> companyTel;

        /**
         * <strong>example:</strong>
         * <p>xxxstreet</p>
         */
        @NameInMap("CompleteAddressOfHeadquarters")
        public String completeAddressOfHeadquarters;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@gamil.com">xxxx@gamil.com</a></p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <strong>example:</strong>
         * <p>N/A‌</p>
         */
        @NameInMap("EnableAutoReply")
        public String enableAutoReply;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("IndustryDescription")
        public String industryDescription;

        /**
         * <strong>example:</strong>
         * <p>telecommunicationsAndIT</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("LetterGuarantee")
        public String letterGuarantee;

        /**
         * <p>logo</p>
         */
        @NameInMap("Logo")
        public java.util.List<String> logo;

        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <strong>example:</strong>
         * <p>hello!</p>
         */
        @NameInMap("MessageDialogueIntroduction")
        public String messageDialogueIntroduction;

        /**
         * <strong>example:</strong>
         * <p>2025-11-07</p>
         */
        @NameInMap("MessageEnableDate")
        public String messageEnableDate;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MessageSessionName")
        public String messageSessionName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx.xxx.com">https://xxx.xxx.com</a></p>
         */
        @NameInMap("OtherLetterGuarantee")
        public String otherLetterGuarantee;

        /**
         * <strong>example:</strong>
         * <p>2025-11-07</p>
         */
        @NameInMap("RecoveryDate")
        public String recoveryDate;

        /**
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("ReplyContent")
        public String replyContent;

        /**
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("SuspensionDate")
        public String suspensionDate;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.xxx.xxx.com">https://www.xxx.xxx.com</a></p>
         */
        @NameInMap("WebAddress")
        public String webAddress;

        public static UpdateAuditRequestRequestAuditRecord build(java.util.Map<String, ?> map) throws Exception {
            UpdateAuditRequestRequestAuditRecord self = new UpdateAuditRequestRequestAuditRecord();
            return TeaModel.build(map, self);
        }

        public UpdateAuditRequestRequestAuditRecord setAgeLimit(String ageLimit) {
            this.ageLimit = ageLimit;
            return this;
        }
        public String getAgeLimit() {
            return this.ageLimit;
        }

        public UpdateAuditRequestRequestAuditRecord setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public UpdateAuditRequestRequestAuditRecord setBusinessAccountName(String businessAccountName) {
            this.businessAccountName = businessAccountName;
            return this;
        }
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        public UpdateAuditRequestRequestAuditRecord setBusinessLicenseRegistrationNumber(String businessLicenseRegistrationNumber) {
            this.businessLicenseRegistrationNumber = businessLicenseRegistrationNumber;
            return this;
        }
        public String getBusinessLicenseRegistrationNumber() {
            return this.businessLicenseRegistrationNumber;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyAddress(java.util.List<UpdateAuditRequestRequestAuditRecordCompanyAddress> companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public java.util.List<UpdateAuditRequestRequestAuditRecordCompanyAddress> getCompanyAddress() {
            return this.companyAddress;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyEnglishName(String companyEnglishName) {
            this.companyEnglishName = companyEnglishName;
            return this;
        }
        public String getCompanyEnglishName() {
            return this.companyEnglishName;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyLegalName(String companyLegalName) {
            this.companyLegalName = companyLegalName;
            return this;
        }
        public String getCompanyLegalName() {
            return this.companyLegalName;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyLegalPerson(String companyLegalPerson) {
            this.companyLegalPerson = companyLegalPerson;
            return this;
        }
        public String getCompanyLegalPerson() {
            return this.companyLegalPerson;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyProfile(String companyProfile) {
            this.companyProfile = companyProfile;
            return this;
        }
        public String getCompanyProfile() {
            return this.companyProfile;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyRegisteredCountry(String companyRegisteredCountry) {
            this.companyRegisteredCountry = companyRegisteredCountry;
            return this;
        }
        public String getCompanyRegisteredCountry() {
            return this.companyRegisteredCountry;
        }

        public UpdateAuditRequestRequestAuditRecord setCompanyTel(java.util.List<UpdateAuditRequestRequestAuditRecordCompanyTel> companyTel) {
            this.companyTel = companyTel;
            return this;
        }
        public java.util.List<UpdateAuditRequestRequestAuditRecordCompanyTel> getCompanyTel() {
            return this.companyTel;
        }

        public UpdateAuditRequestRequestAuditRecord setCompleteAddressOfHeadquarters(String completeAddressOfHeadquarters) {
            this.completeAddressOfHeadquarters = completeAddressOfHeadquarters;
            return this;
        }
        public String getCompleteAddressOfHeadquarters() {
            return this.completeAddressOfHeadquarters;
        }

        public UpdateAuditRequestRequestAuditRecord setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public UpdateAuditRequestRequestAuditRecord setEnableAutoReply(String enableAutoReply) {
            this.enableAutoReply = enableAutoReply;
            return this;
        }
        public String getEnableAutoReply() {
            return this.enableAutoReply;
        }

        public UpdateAuditRequestRequestAuditRecord setIndustryDescription(String industryDescription) {
            this.industryDescription = industryDescription;
            return this;
        }
        public String getIndustryDescription() {
            return this.industryDescription;
        }

        public UpdateAuditRequestRequestAuditRecord setIndustryInvolved(String industryInvolved) {
            this.industryInvolved = industryInvolved;
            return this;
        }
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        public UpdateAuditRequestRequestAuditRecord setLetterGuarantee(String letterGuarantee) {
            this.letterGuarantee = letterGuarantee;
            return this;
        }
        public String getLetterGuarantee() {
            return this.letterGuarantee;
        }

        public UpdateAuditRequestRequestAuditRecord setLogo(java.util.List<String> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<String> getLogo() {
            return this.logo;
        }

        public UpdateAuditRequestRequestAuditRecord setMessageDestinationCountry(java.util.List<String> messageDestinationCountry) {
            this.messageDestinationCountry = messageDestinationCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        public UpdateAuditRequestRequestAuditRecord setMessageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
            this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        public UpdateAuditRequestRequestAuditRecord setMessageDialogueIntroduction(String messageDialogueIntroduction) {
            this.messageDialogueIntroduction = messageDialogueIntroduction;
            return this;
        }
        public String getMessageDialogueIntroduction() {
            return this.messageDialogueIntroduction;
        }

        public UpdateAuditRequestRequestAuditRecord setMessageEnableDate(String messageEnableDate) {
            this.messageEnableDate = messageEnableDate;
            return this;
        }
        public String getMessageEnableDate() {
            return this.messageEnableDate;
        }

        public UpdateAuditRequestRequestAuditRecord setMessageSessionName(String messageSessionName) {
            this.messageSessionName = messageSessionName;
            return this;
        }
        public String getMessageSessionName() {
            return this.messageSessionName;
        }

        public UpdateAuditRequestRequestAuditRecord setOtherLetterGuarantee(String otherLetterGuarantee) {
            this.otherLetterGuarantee = otherLetterGuarantee;
            return this;
        }
        public String getOtherLetterGuarantee() {
            return this.otherLetterGuarantee;
        }

        public UpdateAuditRequestRequestAuditRecord setRecoveryDate(String recoveryDate) {
            this.recoveryDate = recoveryDate;
            return this;
        }
        public String getRecoveryDate() {
            return this.recoveryDate;
        }

        public UpdateAuditRequestRequestAuditRecord setReplyContent(String replyContent) {
            this.replyContent = replyContent;
            return this;
        }
        public String getReplyContent() {
            return this.replyContent;
        }

        public UpdateAuditRequestRequestAuditRecord setSuspensionDate(String suspensionDate) {
            this.suspensionDate = suspensionDate;
            return this;
        }
        public String getSuspensionDate() {
            return this.suspensionDate;
        }

        public UpdateAuditRequestRequestAuditRecord setWebAddress(String webAddress) {
            this.webAddress = webAddress;
            return this;
        }
        public String getWebAddress() {
            return this.webAddress;
        }

    }

}
