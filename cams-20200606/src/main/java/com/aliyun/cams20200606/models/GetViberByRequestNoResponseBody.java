// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetViberByRequestNoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetViberByRequestNoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8**9-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetViberByRequestNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetViberByRequestNoResponseBody self = new GetViberByRequestNoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetViberByRequestNoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetViberByRequestNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetViberByRequestNoResponseBody setData(GetViberByRequestNoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetViberByRequestNoResponseBodyData getData() {
        return this.data;
    }

    public GetViberByRequestNoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetViberByRequestNoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetViberByRequestNoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>address</p>
         */
        @NameInMap("CompanyAddress")
        public String companyAddress;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("CompanyAddressTitle")
        public String companyAddressTitle;

        public static GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress build(java.util.Map<String, ?> map) throws Exception {
            GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress self = new GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress();
            return TeaModel.build(map, self);
        }

        public GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress setCompanyAddressTitle(String companyAddressTitle) {
            this.companyAddressTitle = companyAddressTitle;
            return this;
        }
        public String getCompanyAddressTitle() {
            return this.companyAddressTitle;
        }

    }

    public static class GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>134213213</p>
         */
        @NameInMap("CompanyTelNumber")
        public String companyTelNumber;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CompanyTelTitle")
        public String companyTelTitle;

        public static GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel build(java.util.Map<String, ?> map) throws Exception {
            GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel self = new GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel();
            return TeaModel.build(map, self);
        }

        public GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel setCompanyTelNumber(String companyTelNumber) {
            this.companyTelNumber = companyTelNumber;
            return this;
        }
        public String getCompanyTelNumber() {
            return this.companyTelNumber;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel setCompanyTelTitle(String companyTelTitle) {
            this.companyTelTitle = companyTelTitle;
            return this;
        }
        public String getCompanyTelTitle() {
            return this.companyTelTitle;
        }

    }

    public static class GetViberByRequestNoResponseBodyDataAuditRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eighteenUp</p>
         */
        @NameInMap("AgeLimit")
        public String ageLimit;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <strong>example:</strong>
         * <p>aaaa</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        /**
         * <strong>example:</strong>
         * <p>43645465465</p>
         */
        @NameInMap("BusinessLicenseRegistrationNumber")
        public String businessLicenseRegistrationNumber;

        @NameInMap("CompanyAddress")
        public java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress> companyAddress;

        /**
         * <strong>example:</strong>
         * <p>english</p>
         */
        @NameInMap("CompanyEnglishName")
        public String companyEnglishName;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxcompany</p>
         */
        @NameInMap("CompanyLegalName")
        public String companyLegalName;

        /**
         * <strong>example:</strong>
         * <p>jack</p>
         */
        @NameInMap("CompanyLegalPerson")
        public String companyLegalPerson;

        /**
         * <strong>example:</strong>
         * <p>new</p>
         */
        @NameInMap("CompanyProfile")
        public String companyProfile;

        /**
         * <strong>example:</strong>
         * <p>beijing</p>
         */
        @NameInMap("CompanyRegisteredCountry")
        public String companyRegisteredCountry;

        @NameInMap("CompanyTel")
        public java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel> companyTel;

        /**
         * <strong>example:</strong>
         * <p>address</p>
         */
        @NameInMap("CompleteAddressOfHeadquarters")
        public String completeAddressOfHeadquarters;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("EnableAutoReply")
        public String enableAutoReply;

        /**
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("IndustryDescription")
        public String industryDescription;

        /**
         * <strong>example:</strong>
         * <p>cateringServices</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxxxx">https://xxxxxxxxxx</a></p>
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
         * <p>aaa</p>
         */
        @NameInMap("MessageDialogueIntroduction")
        public String messageDialogueIntroduction;

        /**
         * <strong>example:</strong>
         * <p>2025-08-05</p>
         */
        @NameInMap("MessageEnableDate")
        public String messageEnableDate;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("MessageSessionName")
        public String messageSessionName;

        /**
         * <strong>example:</strong>
         * <p>NowRecovery</p>
         */
        @NameInMap("NowRecovery")
        public String nowRecovery;

        /**
         * <strong>example:</strong>
         * <p><a href="https://wwwxxxx">https://wwwxxxx</a></p>
         */
        @NameInMap("OtherLetterGuarantee")
        public String otherLetterGuarantee;

        /**
         * <strong>example:</strong>
         * <p>2025-11-11</p>
         */
        @NameInMap("RecoveryDate")
        public String recoveryDate;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ReplyContent")
        public String replyContent;

        /**
         * <p>SuspensionDate</p>
         * 
         * <strong>example:</strong>
         * <p>SuspensionDate</p>
         */
        @NameInMap("SuspensionDate")
        public String suspensionDate;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxx">https://xxxxxx</a></p>
         */
        @NameInMap("WebAddress")
        public String webAddress;

        public static GetViberByRequestNoResponseBodyDataAuditRecord build(java.util.Map<String, ?> map) throws Exception {
            GetViberByRequestNoResponseBodyDataAuditRecord self = new GetViberByRequestNoResponseBodyDataAuditRecord();
            return TeaModel.build(map, self);
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setAgeLimit(String ageLimit) {
            this.ageLimit = ageLimit;
            return this;
        }
        public String getAgeLimit() {
            return this.ageLimit;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setBusinessAccountName(String businessAccountName) {
            this.businessAccountName = businessAccountName;
            return this;
        }
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setBusinessLicenseRegistrationNumber(String businessLicenseRegistrationNumber) {
            this.businessLicenseRegistrationNumber = businessLicenseRegistrationNumber;
            return this;
        }
        public String getBusinessLicenseRegistrationNumber() {
            return this.businessLicenseRegistrationNumber;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyAddress(java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress> companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress> getCompanyAddress() {
            return this.companyAddress;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyEnglishName(String companyEnglishName) {
            this.companyEnglishName = companyEnglishName;
            return this;
        }
        public String getCompanyEnglishName() {
            return this.companyEnglishName;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyLegalName(String companyLegalName) {
            this.companyLegalName = companyLegalName;
            return this;
        }
        public String getCompanyLegalName() {
            return this.companyLegalName;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyLegalPerson(String companyLegalPerson) {
            this.companyLegalPerson = companyLegalPerson;
            return this;
        }
        public String getCompanyLegalPerson() {
            return this.companyLegalPerson;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyProfile(String companyProfile) {
            this.companyProfile = companyProfile;
            return this;
        }
        public String getCompanyProfile() {
            return this.companyProfile;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyRegisteredCountry(String companyRegisteredCountry) {
            this.companyRegisteredCountry = companyRegisteredCountry;
            return this;
        }
        public String getCompanyRegisteredCountry() {
            return this.companyRegisteredCountry;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompanyTel(java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel> companyTel) {
            this.companyTel = companyTel;
            return this;
        }
        public java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel> getCompanyTel() {
            return this.companyTel;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setCompleteAddressOfHeadquarters(String completeAddressOfHeadquarters) {
            this.completeAddressOfHeadquarters = completeAddressOfHeadquarters;
            return this;
        }
        public String getCompleteAddressOfHeadquarters() {
            return this.completeAddressOfHeadquarters;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setEnableAutoReply(String enableAutoReply) {
            this.enableAutoReply = enableAutoReply;
            return this;
        }
        public String getEnableAutoReply() {
            return this.enableAutoReply;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setIndustryDescription(String industryDescription) {
            this.industryDescription = industryDescription;
            return this;
        }
        public String getIndustryDescription() {
            return this.industryDescription;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setIndustryInvolved(String industryInvolved) {
            this.industryInvolved = industryInvolved;
            return this;
        }
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setLetterGuarantee(String letterGuarantee) {
            this.letterGuarantee = letterGuarantee;
            return this;
        }
        public String getLetterGuarantee() {
            return this.letterGuarantee;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setLogo(java.util.List<String> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<String> getLogo() {
            return this.logo;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setMessageDestinationCountry(java.util.List<String> messageDestinationCountry) {
            this.messageDestinationCountry = messageDestinationCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setMessageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
            this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setMessageDialogueIntroduction(String messageDialogueIntroduction) {
            this.messageDialogueIntroduction = messageDialogueIntroduction;
            return this;
        }
        public String getMessageDialogueIntroduction() {
            return this.messageDialogueIntroduction;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setMessageEnableDate(String messageEnableDate) {
            this.messageEnableDate = messageEnableDate;
            return this;
        }
        public String getMessageEnableDate() {
            return this.messageEnableDate;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setMessageSessionName(String messageSessionName) {
            this.messageSessionName = messageSessionName;
            return this;
        }
        public String getMessageSessionName() {
            return this.messageSessionName;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setNowRecovery(String nowRecovery) {
            this.nowRecovery = nowRecovery;
            return this;
        }
        public String getNowRecovery() {
            return this.nowRecovery;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setOtherLetterGuarantee(String otherLetterGuarantee) {
            this.otherLetterGuarantee = otherLetterGuarantee;
            return this;
        }
        public String getOtherLetterGuarantee() {
            return this.otherLetterGuarantee;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setRecoveryDate(String recoveryDate) {
            this.recoveryDate = recoveryDate;
            return this;
        }
        public String getRecoveryDate() {
            return this.recoveryDate;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setReplyContent(String replyContent) {
            this.replyContent = replyContent;
            return this;
        }
        public String getReplyContent() {
            return this.replyContent;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setSuspensionDate(String suspensionDate) {
            this.suspensionDate = suspensionDate;
            return this;
        }
        public String getSuspensionDate() {
            return this.suspensionDate;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setWebAddress(String webAddress) {
            this.webAddress = webAddress;
            return this;
        }
        public String getWebAddress() {
            return this.webAddress;
        }

    }

    public static class GetViberByRequestNoResponseBodyData extends TeaModel {
        @NameInMap("AuditRecord")
        public GetViberByRequestNoResponseBodyDataAuditRecord auditRecord;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("AuditResult")
        public String auditResult;

        /**
         * <strong>example:</strong>
         * <p>1785465</p>
         */
        @NameInMap("AuditTime")
        public String auditTime;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>1753236426000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>17833636</p>
         */
        @NameInMap("GmtModifier")
        public String gmtModifier;

        /**
         * <p>ID。</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>735221</p>
         */
        @NameInMap("MaapServiceNo")
        public String maapServiceNo;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>5435435435</p>
         */
        @NameInMap("RequestNo")
        public String requestNo;

        /**
         * <strong>example:</strong>
         * <p>viberOpen</p>
         */
        @NameInMap("RequestType")
        public String requestType;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>4534**</p>
         */
        @NameInMap("SubscriberCode")
        public String subscriberCode;

        public static GetViberByRequestNoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetViberByRequestNoResponseBodyData self = new GetViberByRequestNoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetViberByRequestNoResponseBodyData setAuditRecord(GetViberByRequestNoResponseBodyDataAuditRecord auditRecord) {
            this.auditRecord = auditRecord;
            return this;
        }
        public GetViberByRequestNoResponseBodyDataAuditRecord getAuditRecord() {
            return this.auditRecord;
        }

        public GetViberByRequestNoResponseBodyData setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public GetViberByRequestNoResponseBodyData setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public GetViberByRequestNoResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetViberByRequestNoResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetViberByRequestNoResponseBodyData setGmtModifier(String gmtModifier) {
            this.gmtModifier = gmtModifier;
            return this;
        }
        public String getGmtModifier() {
            return this.gmtModifier;
        }

        public GetViberByRequestNoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetViberByRequestNoResponseBodyData setMaapServiceNo(String maapServiceNo) {
            this.maapServiceNo = maapServiceNo;
            return this;
        }
        public String getMaapServiceNo() {
            return this.maapServiceNo;
        }

        public GetViberByRequestNoResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetViberByRequestNoResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetViberByRequestNoResponseBodyData setRequestNo(String requestNo) {
            this.requestNo = requestNo;
            return this;
        }
        public String getRequestNo() {
            return this.requestNo;
        }

        public GetViberByRequestNoResponseBodyData setRequestType(String requestType) {
            this.requestType = requestType;
            return this;
        }
        public String getRequestType() {
            return this.requestType;
        }

        public GetViberByRequestNoResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetViberByRequestNoResponseBodyData setSubscriberCode(String subscriberCode) {
            this.subscriberCode = subscriberCode;
            return this;
        }
        public String getSubscriberCode() {
            return this.subscriberCode;
        }

    }

}
