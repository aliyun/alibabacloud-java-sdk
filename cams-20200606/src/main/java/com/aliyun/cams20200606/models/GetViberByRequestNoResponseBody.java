// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetViberByRequestNoResponseBody extends TeaModel {
    /**
     * <p>Access denial details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p><code>OK</code>: The request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetViberByRequestNoResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID for the request. You can use this Aliyun-generated ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8**9-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates if the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The company telephone number.</p>
         * 
         * <strong>example:</strong>
         * <p>134213213</p>
         */
        @NameInMap("CompanyTelNumber")
        public String companyTelNumber;

        /**
         * <p>The title for the telephone number.</p>
         * 
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
         * <p>The age restriction.</p>
         * 
         * <strong>example:</strong>
         * <p>eighteenUp</p>
         */
        @NameInMap("AgeLimit")
        public String ageLimit;

        /**
         * <p>The reason for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <p>The name of the business account.</p>
         * 
         * <strong>example:</strong>
         * <p>aaaa</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        /**
         * <p>The business license registration number.</p>
         * 
         * <strong>example:</strong>
         * <p>43645465465</p>
         */
        @NameInMap("BusinessLicenseRegistrationNumber")
        public String businessLicenseRegistrationNumber;

        /**
         * <p>The company addresses.</p>
         */
        @NameInMap("CompanyAddress")
        public java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyAddress> companyAddress;

        /**
         * <p>The English name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>english</p>
         */
        @NameInMap("CompanyEnglishName")
        public String companyEnglishName;

        /**
         * <p>The legal name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxcompany</p>
         */
        @NameInMap("CompanyLegalName")
        public String companyLegalName;

        /**
         * <p>The name of the company\&quot;s legal representative.</p>
         * 
         * <strong>example:</strong>
         * <p>jack</p>
         */
        @NameInMap("CompanyLegalPerson")
        public String companyLegalPerson;

        /**
         * <p>The company profile.</p>
         * 
         * <strong>example:</strong>
         * <p>new</p>
         */
        @NameInMap("CompanyProfile")
        public String companyProfile;

        /**
         * <p>The country or region where the company is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing</p>
         */
        @NameInMap("CompanyRegisteredCountry")
        public String companyRegisteredCountry;

        /**
         * <p>The company telephone numbers.</p>
         */
        @NameInMap("CompanyTel")
        public java.util.List<GetViberByRequestNoResponseBodyDataAuditRecordCompanyTel> companyTel;

        /**
         * <p>The complete address of the company\&quot;s headquarters.</p>
         * 
         * <strong>example:</strong>
         * <p>address</p>
         */
        @NameInMap("CompleteAddressOfHeadquarters")
        public String completeAddressOfHeadquarters;

        /**
         * <p>The contact person\&quot;s email address.</p>
         * 
         * <strong>example:</strong>
         * <p>6944**@gmail.com</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>The contact email address.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ContactMail")
        public String contactMail;

        /**
         * <p>The contact person\&quot;s name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwq</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The contact person\&quot;s phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>861151515***</p>
         */
        @NameInMap("ContactPhone")
        public String contactPhone;

        /**
         * <p>The contact person\&quot;s position.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("ContactPosition")
        public String contactPosition;

        /**
         * <p>Indicates whether auto-reply is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("EnableAutoReply")
        public String enableAutoReply;

        /**
         * <p>A description of the industry.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("IndustryDescription")
        public String industryDescription;

        /**
         * <p>The company\&quot;s industry.</p>
         * 
         * <strong>example:</strong>
         * <p>cateringServices</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <p>The URL of the letter of guarantee.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxxxxxxx">https://xxxxxxxxxx</a></p>
         */
        @NameInMap("LetterGuarantee")
        public String letterGuarantee;

        /**
         * <p>The logo URLs.</p>
         */
        @NameInMap("Logo")
        public java.util.List<String> logo;

        /**
         * <p>The local destination countries or regions.</p>
         */
        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        /**
         * <p>The international destination countries or regions.</p>
         */
        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <p>A brief introduction to the business messaging conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("MessageDialogueIntroduction")
        public String messageDialogueIntroduction;

        /**
         * <p>The date business messaging is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-05</p>
         */
        @NameInMap("MessageEnableDate")
        public String messageEnableDate;

        /**
         * <p>The name of the business messaging conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("MessageSessionName")
        public String messageSessionName;

        /**
         * <p>The recovery status.</p>
         * 
         * <strong>example:</strong>
         * <p>NowRecovery</p>
         */
        @NameInMap("NowRecovery")
        public String nowRecovery;

        /**
         * <p>The URL for supplementary information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://wwwxxxx">https://wwwxxxx</a></p>
         */
        @NameInMap("OtherLetterGuarantee")
        public String otherLetterGuarantee;

        /**
         * <p>The date of recovery.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-11</p>
         */
        @NameInMap("RecoveryDate")
        public String recoveryDate;

        /**
         * <p>The content of the auto-reply message.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ReplyContent")
        public String replyContent;

        /**
         * <p>The suspension date.</p>
         * 
         * <strong>example:</strong>
         * <p>SuspensionDate</p>
         */
        @NameInMap("SuspensionDate")
        public String suspensionDate;

        /**
         * <p>The company website.</p>
         * 
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

        public GetViberByRequestNoResponseBodyDataAuditRecord setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setContactMail(String contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public String getContactMail() {
            return this.contactMail;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public GetViberByRequestNoResponseBodyDataAuditRecord setContactPosition(String contactPosition) {
            this.contactPosition = contactPosition;
            return this;
        }
        public String getContactPosition() {
            return this.contactPosition;
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
        /**
         * <p>The audit record details.</p>
         */
        @NameInMap("AuditRecord")
        public GetViberByRequestNoResponseBodyDataAuditRecord auditRecord;

        /**
         * <p>The audit result.</p>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("AuditResult")
        public String auditResult;

        /**
         * <p>The audit time.</p>
         * 
         * <strong>example:</strong>
         * <p>1785465</p>
         */
        @NameInMap("AuditTime")
        public String auditTime;

        /**
         * <p>The creator of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753236426000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>17833636</p>
         */
        @NameInMap("GmtModifier")
        public String gmtModifier;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The Viber service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735221</p>
         */
        @NameInMap("MaapServiceNo")
        public String maapServiceNo;

        /**
         * <p>The user who last modified the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The audit comment.</p>
         * 
         * <strong>example:</strong>
         * <p>aa</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The unique number for the application request.</p>
         * 
         * <strong>example:</strong>
         * <p>5435435435</p>
         */
        @NameInMap("RequestNo")
        public String requestNo;

        /**
         * <p>The type of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>viberOpen</p>
         */
        @NameInMap("RequestType")
        public String requestType;

        /**
         * <p>The status of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The subscriber code.</p>
         * 
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
