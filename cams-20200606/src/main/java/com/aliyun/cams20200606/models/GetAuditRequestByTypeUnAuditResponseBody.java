// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetAuditRequestByTypeUnAuditResponseBody extends TeaModel {
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
    public GetAuditRequestByTypeUnAuditResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAuditRequestByTypeUnAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditRequestByTypeUnAuditResponseBody self = new GetAuditRequestByTypeUnAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditRequestByTypeUnAuditResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAuditRequestByTypeUnAuditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuditRequestByTypeUnAuditResponseBody setData(GetAuditRequestByTypeUnAuditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAuditRequestByTypeUnAuditResponseBodyData getData() {
        return this.data;
    }

    public GetAuditRequestByTypeUnAuditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuditRequestByTypeUnAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditRequestByTypeUnAuditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxcompany</p>
         */
        @NameInMap("CompanyAddress")
        public String companyAddress;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("CompanyAddressTitle")
        public String companyAddressTitle;

        public static GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress build(java.util.Map<String, ?> map) throws Exception {
            GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress self = new GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress();
            return TeaModel.build(map, self);
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress setCompanyAddressTitle(String companyAddressTitle) {
            this.companyAddressTitle = companyAddressTitle;
            return this;
        }
        public String getCompanyAddressTitle() {
            return this.companyAddressTitle;
        }

    }

    public static class GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>143243**</p>
         */
        @NameInMap("CompanyTelNumber")
        public String companyTelNumber;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("CompanyTelTitle")
        public String companyTelTitle;

        public static GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel build(java.util.Map<String, ?> map) throws Exception {
            GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel self = new GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel();
            return TeaModel.build(map, self);
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel setCompanyTelNumber(String companyTelNumber) {
            this.companyTelNumber = companyTelNumber;
            return this;
        }
        public String getCompanyTelNumber() {
            return this.companyTelNumber;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel setCompanyTelTitle(String companyTelTitle) {
            this.companyTelTitle = companyTelTitle;
            return this;
        }
        public String getCompanyTelTitle() {
            return this.companyTelTitle;
        }

    }

    public static class GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eighteenUp</p>
         */
        @NameInMap("AgeLimit")
        public String ageLimit;

        /**
         * <strong>example:</strong>
         * <p>bnv</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        @NameInMap("CompanyAddress")
        public java.util.List<GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress> companyAddress;

        /**
         * <strong>example:</strong>
         * <p>Company English Name</p>
         */
        @NameInMap("CompanyEnglishName")
        public String companyEnglishName;

        /**
         * <strong>example:</strong>
         * <p>xxxxcompany</p>
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
         * <p>CompanyProfile</p>
         */
        @NameInMap("CompanyProfile")
        public String companyProfile;

        @NameInMap("CompanyRegisteredCountry")
        public java.util.List<String> companyRegisteredCountry;

        @NameInMap("CompanyTel")
        public java.util.List<GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel> companyTel;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:qqemail@gmail.com">qqemail@gmail.com</a></p>
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
         * <p>xxx</p>
         */
        @NameInMap("IndustryDescription")
        public String industryDescription;

        /**
         * <strong>example:</strong>
         * <p>it</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.xxxxxxx">https://www.xxxxxxx</a></p>
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
         * <p>MessageDialogueIntroduction</p>
         */
        @NameInMap("MessageDialogueIntroduction")
        public String messageDialogueIntroduction;

        /**
         * <strong>example:</strong>
         * <p>2025-11-01</p>
         */
        @NameInMap("MessageEnableDate")
        public String messageEnableDate;

        /**
         * <strong>example:</strong>
         * <p>Message Session Name</p>
         */
        @NameInMap("MessageSessionName")
        public String messageSessionName;

        /**
         * <strong>example:</strong>
         * <p>n</p>
         */
        @NameInMap("NowRecovery")
        public String nowRecovery;

        /**
         * <strong>example:</strong>
         * <p>2025-111-06</p>
         */
        @NameInMap("RecoveryDate")
        public String recoveryDate;

        /**
         * <strong>example:</strong>
         * <p>aaaqq</p>
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
         * <p><a href="http://www.xxxxx">www.xxxxx</a></p>
         */
        @NameInMap("WebAddress")
        public String webAddress;

        public static GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord build(java.util.Map<String, ?> map) throws Exception {
            GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord self = new GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord();
            return TeaModel.build(map, self);
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setAgeLimit(String ageLimit) {
            this.ageLimit = ageLimit;
            return this;
        }
        public String getAgeLimit() {
            return this.ageLimit;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setBusinessAccountName(String businessAccountName) {
            this.businessAccountName = businessAccountName;
            return this;
        }
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyAddress(java.util.List<GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress> companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public java.util.List<GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyAddress> getCompanyAddress() {
            return this.companyAddress;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyEnglishName(String companyEnglishName) {
            this.companyEnglishName = companyEnglishName;
            return this;
        }
        public String getCompanyEnglishName() {
            return this.companyEnglishName;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyLegalName(String companyLegalName) {
            this.companyLegalName = companyLegalName;
            return this;
        }
        public String getCompanyLegalName() {
            return this.companyLegalName;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyLegalPerson(String companyLegalPerson) {
            this.companyLegalPerson = companyLegalPerson;
            return this;
        }
        public String getCompanyLegalPerson() {
            return this.companyLegalPerson;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyProfile(String companyProfile) {
            this.companyProfile = companyProfile;
            return this;
        }
        public String getCompanyProfile() {
            return this.companyProfile;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyRegisteredCountry(java.util.List<String> companyRegisteredCountry) {
            this.companyRegisteredCountry = companyRegisteredCountry;
            return this;
        }
        public java.util.List<String> getCompanyRegisteredCountry() {
            return this.companyRegisteredCountry;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setCompanyTel(java.util.List<GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel> companyTel) {
            this.companyTel = companyTel;
            return this;
        }
        public java.util.List<GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecordCompanyTel> getCompanyTel() {
            return this.companyTel;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setEnableAutoReply(String enableAutoReply) {
            this.enableAutoReply = enableAutoReply;
            return this;
        }
        public String getEnableAutoReply() {
            return this.enableAutoReply;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setIndustryDescription(String industryDescription) {
            this.industryDescription = industryDescription;
            return this;
        }
        public String getIndustryDescription() {
            return this.industryDescription;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setIndustryInvolved(String industryInvolved) {
            this.industryInvolved = industryInvolved;
            return this;
        }
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setLetterGuarantee(String letterGuarantee) {
            this.letterGuarantee = letterGuarantee;
            return this;
        }
        public String getLetterGuarantee() {
            return this.letterGuarantee;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setLogo(java.util.List<String> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<String> getLogo() {
            return this.logo;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setMessageDestinationCountry(java.util.List<String> messageDestinationCountry) {
            this.messageDestinationCountry = messageDestinationCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setMessageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
            this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setMessageDialogueIntroduction(String messageDialogueIntroduction) {
            this.messageDialogueIntroduction = messageDialogueIntroduction;
            return this;
        }
        public String getMessageDialogueIntroduction() {
            return this.messageDialogueIntroduction;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setMessageEnableDate(String messageEnableDate) {
            this.messageEnableDate = messageEnableDate;
            return this;
        }
        public String getMessageEnableDate() {
            return this.messageEnableDate;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setMessageSessionName(String messageSessionName) {
            this.messageSessionName = messageSessionName;
            return this;
        }
        public String getMessageSessionName() {
            return this.messageSessionName;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setNowRecovery(String nowRecovery) {
            this.nowRecovery = nowRecovery;
            return this;
        }
        public String getNowRecovery() {
            return this.nowRecovery;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setRecoveryDate(String recoveryDate) {
            this.recoveryDate = recoveryDate;
            return this;
        }
        public String getRecoveryDate() {
            return this.recoveryDate;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setReplyContent(String replyContent) {
            this.replyContent = replyContent;
            return this;
        }
        public String getReplyContent() {
            return this.replyContent;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setSuspensionDate(String suspensionDate) {
            this.suspensionDate = suspensionDate;
            return this;
        }
        public String getSuspensionDate() {
            return this.suspensionDate;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord setWebAddress(String webAddress) {
            this.webAddress = webAddress;
            return this;
        }
        public String getWebAddress() {
            return this.webAddress;
        }

    }

    public static class GetAuditRequestByTypeUnAuditResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21432</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("AuditRecord")
        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord auditRecord;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("AuditResult")
        public String auditResult;

        /**
         * <strong>example:</strong>
         * <p>20250106</p>
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
         * <p>1789200</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>20251624</p>
         */
        @NameInMap("GmtModifier")
        public String gmtModifier;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>475646</p>
         */
        @NameInMap("MaapServiceNo")
        public String maapServiceNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>45345435435</p>
         */
        @NameInMap("RequestNo")
        public String requestNo;

        /**
         * <strong>example:</strong>
         * <p>viber_open</p>
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
         * <p>345436456546</p>
         */
        @NameInMap("SubscriberCode")
        public String subscriberCode;

        public static GetAuditRequestByTypeUnAuditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuditRequestByTypeUnAuditResponseBodyData self = new GetAuditRequestByTypeUnAuditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setAuditRecord(GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord auditRecord) {
            this.auditRecord = auditRecord;
            return this;
        }
        public GetAuditRequestByTypeUnAuditResponseBodyDataAuditRecord getAuditRecord() {
            return this.auditRecord;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setGmtModifier(String gmtModifier) {
            this.gmtModifier = gmtModifier;
            return this;
        }
        public String getGmtModifier() {
            return this.gmtModifier;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setMaapServiceNo(String maapServiceNo) {
            this.maapServiceNo = maapServiceNo;
            return this;
        }
        public String getMaapServiceNo() {
            return this.maapServiceNo;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setRequestNo(String requestNo) {
            this.requestNo = requestNo;
            return this;
        }
        public String getRequestNo() {
            return this.requestNo;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setRequestType(String requestType) {
            this.requestType = requestType;
            return this;
        }
        public String getRequestType() {
            return this.requestType;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAuditRequestByTypeUnAuditResponseBodyData setSubscriberCode(String subscriberCode) {
            this.subscriberCode = subscriberCode;
            return this;
        }
        public String getSubscriberCode() {
            return this.subscriberCode;
        }

    }

}
