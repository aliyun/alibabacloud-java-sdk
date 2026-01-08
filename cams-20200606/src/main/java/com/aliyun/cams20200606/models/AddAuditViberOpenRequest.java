// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAuditViberOpenRequest extends TeaModel {
    @NameInMap("AuditRecord")
    public AddAuditViberOpenRequestAuditRecord auditRecord;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("AuditResult")
    public String auditResult;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAuditViberOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuditViberOpenRequest self = new AddAuditViberOpenRequest();
        return TeaModel.build(map, self);
    }

    public AddAuditViberOpenRequest setAuditRecord(AddAuditViberOpenRequestAuditRecord auditRecord) {
        this.auditRecord = auditRecord;
        return this;
    }
    public AddAuditViberOpenRequestAuditRecord getAuditRecord() {
        return this.auditRecord;
    }

    public AddAuditViberOpenRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public AddAuditViberOpenRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddAuditViberOpenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAuditViberOpenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAuditViberOpenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class AddAuditViberOpenRequestAuditRecordCompanyAddress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>address</p>
         */
        @NameInMap("CompanyAddress")
        public String companyAddress;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("CompanyAddressTitle")
        public String companyAddressTitle;

        public static AddAuditViberOpenRequestAuditRecordCompanyAddress build(java.util.Map<String, ?> map) throws Exception {
            AddAuditViberOpenRequestAuditRecordCompanyAddress self = new AddAuditViberOpenRequestAuditRecordCompanyAddress();
            return TeaModel.build(map, self);
        }

        public AddAuditViberOpenRequestAuditRecordCompanyAddress setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        public AddAuditViberOpenRequestAuditRecordCompanyAddress setCompanyAddressTitle(String companyAddressTitle) {
            this.companyAddressTitle = companyAddressTitle;
            return this;
        }
        public String getCompanyAddressTitle() {
            return this.companyAddressTitle;
        }

    }

    public static class AddAuditViberOpenRequestAuditRecordCompanyTel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>156********</p>
         */
        @NameInMap("CompanyTelNumber")
        public String companyTelNumber;

        /**
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("CompanyTelTitle")
        public String companyTelTitle;

        public static AddAuditViberOpenRequestAuditRecordCompanyTel build(java.util.Map<String, ?> map) throws Exception {
            AddAuditViberOpenRequestAuditRecordCompanyTel self = new AddAuditViberOpenRequestAuditRecordCompanyTel();
            return TeaModel.build(map, self);
        }

        public AddAuditViberOpenRequestAuditRecordCompanyTel setCompanyTelNumber(String companyTelNumber) {
            this.companyTelNumber = companyTelNumber;
            return this;
        }
        public String getCompanyTelNumber() {
            return this.companyTelNumber;
        }

        public AddAuditViberOpenRequestAuditRecordCompanyTel setCompanyTelTitle(String companyTelTitle) {
            this.companyTelTitle = companyTelTitle;
            return this;
        }
        public String getCompanyTelTitle() {
            return this.companyTelTitle;
        }

    }

    public static class AddAuditViberOpenRequestAuditRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AgeLimit")
        public String ageLimit;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("BusinessLicenseRegistrationNumber")
        public String businessLicenseRegistrationNumber;

        @NameInMap("CompanyAddress")
        public java.util.List<AddAuditViberOpenRequestAuditRecordCompanyAddress> companyAddress;

        /**
         * <strong>example:</strong>
         * <p>7Pj6</p>
         */
        @NameInMap("CompanyEnglishName")
        public String companyEnglishName;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CompanyLegalName")
        public String companyLegalName;

        /**
         * <strong>example:</strong>
         * <p>jerry</p>
         */
        @NameInMap("CompanyLegalPerson")
        public String companyLegalPerson;

        /**
         * <strong>example:</strong>
         * <p>CompanyProfile</p>
         */
        @NameInMap("CompanyProfile")
        public String companyProfile;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("CompanyRegisteredCountry")
        public String companyRegisteredCountry;

        @NameInMap("CompanyTel")
        public java.util.List<AddAuditViberOpenRequestAuditRecordCompanyTel> companyTel;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CompleteAddressOfHeadquarters")
        public String completeAddressOfHeadquarters;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@123.com">123@123.com</a></p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("EnableAutoReply")
        public String enableAutoReply;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("IndustryDescription")
        public String industryDescription;

        /**
         * <strong>example:</strong>
         * <p>NFUwytiBnm11</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <strong>example:</strong>
         * <p>tiCaYNHR8ttt</p>
         */
        @NameInMap("LetterGuarantee")
        public String letterGuarantee;

        @NameInMap("Logo")
        public java.util.List<String> logo;

        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("MessageDialogueIntroduction")
        public String messageDialogueIntroduction;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MessageEnableDate")
        public String messageEnableDate;

        /**
         * <strong>example:</strong>
         * <p>nPHK8uaRo</p>
         */
        @NameInMap("MessageSessionName")
        public String messageSessionName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OtherLetterGuarantee")
        public String otherLetterGuarantee;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("ReplyContent")
        public String replyContent;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("WebAddress")
        public String webAddress;

        public static AddAuditViberOpenRequestAuditRecord build(java.util.Map<String, ?> map) throws Exception {
            AddAuditViberOpenRequestAuditRecord self = new AddAuditViberOpenRequestAuditRecord();
            return TeaModel.build(map, self);
        }

        public AddAuditViberOpenRequestAuditRecord setAgeLimit(String ageLimit) {
            this.ageLimit = ageLimit;
            return this;
        }
        public String getAgeLimit() {
            return this.ageLimit;
        }

        public AddAuditViberOpenRequestAuditRecord setBusinessAccountName(String businessAccountName) {
            this.businessAccountName = businessAccountName;
            return this;
        }
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        public AddAuditViberOpenRequestAuditRecord setBusinessLicenseRegistrationNumber(String businessLicenseRegistrationNumber) {
            this.businessLicenseRegistrationNumber = businessLicenseRegistrationNumber;
            return this;
        }
        public String getBusinessLicenseRegistrationNumber() {
            return this.businessLicenseRegistrationNumber;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyAddress(java.util.List<AddAuditViberOpenRequestAuditRecordCompanyAddress> companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public java.util.List<AddAuditViberOpenRequestAuditRecordCompanyAddress> getCompanyAddress() {
            return this.companyAddress;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyEnglishName(String companyEnglishName) {
            this.companyEnglishName = companyEnglishName;
            return this;
        }
        public String getCompanyEnglishName() {
            return this.companyEnglishName;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyLegalName(String companyLegalName) {
            this.companyLegalName = companyLegalName;
            return this;
        }
        public String getCompanyLegalName() {
            return this.companyLegalName;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyLegalPerson(String companyLegalPerson) {
            this.companyLegalPerson = companyLegalPerson;
            return this;
        }
        public String getCompanyLegalPerson() {
            return this.companyLegalPerson;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyProfile(String companyProfile) {
            this.companyProfile = companyProfile;
            return this;
        }
        public String getCompanyProfile() {
            return this.companyProfile;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyRegisteredCountry(String companyRegisteredCountry) {
            this.companyRegisteredCountry = companyRegisteredCountry;
            return this;
        }
        public String getCompanyRegisteredCountry() {
            return this.companyRegisteredCountry;
        }

        public AddAuditViberOpenRequestAuditRecord setCompanyTel(java.util.List<AddAuditViberOpenRequestAuditRecordCompanyTel> companyTel) {
            this.companyTel = companyTel;
            return this;
        }
        public java.util.List<AddAuditViberOpenRequestAuditRecordCompanyTel> getCompanyTel() {
            return this.companyTel;
        }

        public AddAuditViberOpenRequestAuditRecord setCompleteAddressOfHeadquarters(String completeAddressOfHeadquarters) {
            this.completeAddressOfHeadquarters = completeAddressOfHeadquarters;
            return this;
        }
        public String getCompleteAddressOfHeadquarters() {
            return this.completeAddressOfHeadquarters;
        }

        public AddAuditViberOpenRequestAuditRecord setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public AddAuditViberOpenRequestAuditRecord setEnableAutoReply(String enableAutoReply) {
            this.enableAutoReply = enableAutoReply;
            return this;
        }
        public String getEnableAutoReply() {
            return this.enableAutoReply;
        }

        public AddAuditViberOpenRequestAuditRecord setIndustryDescription(String industryDescription) {
            this.industryDescription = industryDescription;
            return this;
        }
        public String getIndustryDescription() {
            return this.industryDescription;
        }

        public AddAuditViberOpenRequestAuditRecord setIndustryInvolved(String industryInvolved) {
            this.industryInvolved = industryInvolved;
            return this;
        }
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        public AddAuditViberOpenRequestAuditRecord setLetterGuarantee(String letterGuarantee) {
            this.letterGuarantee = letterGuarantee;
            return this;
        }
        public String getLetterGuarantee() {
            return this.letterGuarantee;
        }

        public AddAuditViberOpenRequestAuditRecord setLogo(java.util.List<String> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<String> getLogo() {
            return this.logo;
        }

        public AddAuditViberOpenRequestAuditRecord setMessageDestinationCountry(java.util.List<String> messageDestinationCountry) {
            this.messageDestinationCountry = messageDestinationCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        public AddAuditViberOpenRequestAuditRecord setMessageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
            this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        public AddAuditViberOpenRequestAuditRecord setMessageDialogueIntroduction(String messageDialogueIntroduction) {
            this.messageDialogueIntroduction = messageDialogueIntroduction;
            return this;
        }
        public String getMessageDialogueIntroduction() {
            return this.messageDialogueIntroduction;
        }

        public AddAuditViberOpenRequestAuditRecord setMessageEnableDate(String messageEnableDate) {
            this.messageEnableDate = messageEnableDate;
            return this;
        }
        public String getMessageEnableDate() {
            return this.messageEnableDate;
        }

        public AddAuditViberOpenRequestAuditRecord setMessageSessionName(String messageSessionName) {
            this.messageSessionName = messageSessionName;
            return this;
        }
        public String getMessageSessionName() {
            return this.messageSessionName;
        }

        public AddAuditViberOpenRequestAuditRecord setOtherLetterGuarantee(String otherLetterGuarantee) {
            this.otherLetterGuarantee = otherLetterGuarantee;
            return this;
        }
        public String getOtherLetterGuarantee() {
            return this.otherLetterGuarantee;
        }

        public AddAuditViberOpenRequestAuditRecord setReplyContent(String replyContent) {
            this.replyContent = replyContent;
            return this;
        }
        public String getReplyContent() {
            return this.replyContent;
        }

        public AddAuditViberOpenRequestAuditRecord setWebAddress(String webAddress) {
            this.webAddress = webAddress;
            return this;
        }
        public String getWebAddress() {
            return this.webAddress;
        }

    }

}
