// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAuditViberOpenRequest extends TeaModel {
    /**
     * <p>The audit record.</p>
     */
    @NameInMap("AuditRecord")
    public AddAuditViberOpenRequestAuditRecord auditRecord;

    /**
     * <p>The audit result.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("AuditResult")
    public String auditResult;

    /**
     * <p>The Space ID of the ISV sub-customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>1651322271196729</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:testuser@testdomain.co">testuser@testdomain.co</a></p>
     */
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <strong>example:</strong>
     * <p>1754580903499898</p>
     */
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
         * <p>The company address.</p>
         * 
         * <strong>example:</strong>
         * <p>address</p>
         */
        @NameInMap("CompanyAddress")
        public String companyAddress;

        /**
         * <p>The title of the company address.</p>
         * 
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
         * <p>The company phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>156********</p>
         */
        @NameInMap("CompanyTelNumber")
        public String companyTelNumber;

        /**
         * <p>The title of the company phone number.</p>
         * 
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
         * <p>The age limit.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("AgeLimit")
        public String ageLimit;

        /**
         * <p>The name of the business account.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        /**
         * <p>The registration number of the business license.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("BusinessLicenseRegistrationNumber")
        public String businessLicenseRegistrationNumber;

        /**
         * <p>A list of company addresses.</p>
         */
        @NameInMap("CompanyAddress")
        public java.util.List<AddAuditViberOpenRequestAuditRecordCompanyAddress> companyAddress;

        /**
         * <p>The English name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>7Pj6</p>
         */
        @NameInMap("CompanyEnglishName")
        public String companyEnglishName;

        /**
         * <p>The legal name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("CompanyLegalName")
        public String companyLegalName;

        /**
         * <p>The legal representative of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>jerry</p>
         */
        @NameInMap("CompanyLegalPerson")
        public String companyLegalPerson;

        /**
         * <p>The company profile.</p>
         * 
         * <strong>example:</strong>
         * <p>CompanyProfile</p>
         */
        @NameInMap("CompanyProfile")
        public String companyProfile;

        /**
         * <p>The country where the company is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("CompanyRegisteredCountry")
        public String companyRegisteredCountry;

        /**
         * <p>A list of company phone number objects.</p>
         */
        @NameInMap("CompanyTel")
        public java.util.List<AddAuditViberOpenRequestAuditRecordCompanyTel> companyTel;

        /**
         * <p>The complete address of the headquarters.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("CompleteAddressOfHeadquarters")
        public String completeAddressOfHeadquarters;

        /**
         * <p>The email address of the contact person.</p>
         * 
         * <strong>example:</strong>
         * <p>7151***<a href="mailto:5@qq.com">5@qq.com</a></p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123@123.com">123@123.com</a></p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <p>The name of the contact person.</p>
         * 
         * <strong>example:</strong>
         * <p>mary</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The phone number of the contact person.</p>
         * 
         * <strong>example:</strong>
         * <p>8615115**777</p>
         */
        @NameInMap("ContactPhone")
        public String contactPhone;

        /**
         * <p>The position of the contact person.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ContactPosition")
        public String contactPosition;

        /**
         * <p>Specifies whether to enable auto-reply.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("EnableAutoReply")
        public String enableAutoReply;

        /**
         * <p>A description of the industry.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("IndustryDescription")
        public String industryDescription;

        /**
         * <p>The industry involved.</p>
         * 
         * <strong>example:</strong>
         * <p>NFUwytiBnm11</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <p>The letter of guarantee.</p>
         * 
         * <strong>example:</strong>
         * <p>tiCaYNHR8ttt</p>
         */
        @NameInMap("LetterGuarantee")
        public String letterGuarantee;

        /**
         * <p>A list of logos.</p>
         */
        @NameInMap("Logo")
        public java.util.List<String> logo;

        /**
         * <p>A list of destination countries/regions for messages.</p>
         */
        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        /**
         * <p>A list of destination countries/regions for international messages.</p>
         */
        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <p>The introduction in the message dialog box.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("MessageDialogueIntroduction")
        public String messageDialogueIntroduction;

        /**
         * <p>The date when messaging is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("MessageEnableDate")
        public String messageEnableDate;

        /**
         * <p>The name of the message session.</p>
         * 
         * <strong>example:</strong>
         * <p>nPHK8uaRo</p>
         */
        @NameInMap("MessageSessionName")
        public String messageSessionName;

        /**
         * <p>Other letters of guarantee.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("OtherLetterGuarantee")
        public String otherLetterGuarantee;

        /**
         * <p>The content of the reply.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("ReplyContent")
        public String replyContent;

        /**
         * <p>The website address.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
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

        public AddAuditViberOpenRequestAuditRecord setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public AddAuditViberOpenRequestAuditRecord setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public AddAuditViberOpenRequestAuditRecord setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public AddAuditViberOpenRequestAuditRecord setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public AddAuditViberOpenRequestAuditRecord setContactPosition(String contactPosition) {
            this.contactPosition = contactPosition;
            return this;
        }
        public String getContactPosition() {
            return this.contactPosition;
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
