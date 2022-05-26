// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetIdentityRegistrationByCustomerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetIdentityRegistrationByCustomerResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetIdentityRegistrationByCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityRegistrationByCustomerResponseBody self = new GetIdentityRegistrationByCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityRegistrationByCustomerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityRegistrationByCustomerResponseBody setData(GetIdentityRegistrationByCustomerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityRegistrationByCustomerResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityRegistrationByCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityRegistrationByCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityRegistrationByCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityRegistrationByCustomerResponseBodyData extends TeaModel {
        @NameInMap("AccountType")
        public Integer accountType;

        @NameInMap("ApplicationId")
        public Long applicationId;

        @NameInMap("ApplyStatus")
        public String applyStatus;

        @NameInMap("AuditCode")
        public String auditCode;

        @NameInMap("CustomerId")
        public Long customerId;

        @NameInMap("DocBackPic")
        public String docBackPic;

        @NameInMap("DocFrontPic")
        public String docFrontPic;

        @NameInMap("DocNum")
        public String docNum;

        @NameInMap("DocType")
        public String docType;

        @NameInMap("Email")
        public String email;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("RegisteredAddress")
        public String registeredAddress;

        @NameInMap("RegisteredCountry")
        public String registeredCountry;

        @NameInMap("RegisteredNum")
        public String registeredNum;

        @NameInMap("Tel")
        public String tel;

        public static GetIdentityRegistrationByCustomerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityRegistrationByCustomerResponseBodyData self = new GetIdentityRegistrationByCustomerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setApplyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }
        public String getApplyStatus() {
            return this.applyStatus;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setAuditCode(String auditCode) {
            this.auditCode = auditCode;
            return this;
        }
        public String getAuditCode() {
            return this.auditCode;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }
        public Long getCustomerId() {
            return this.customerId;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setDocBackPic(String docBackPic) {
            this.docBackPic = docBackPic;
            return this;
        }
        public String getDocBackPic() {
            return this.docBackPic;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setDocFrontPic(String docFrontPic) {
            this.docFrontPic = docFrontPic;
            return this;
        }
        public String getDocFrontPic() {
            return this.docFrontPic;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setDocNum(String docNum) {
            this.docNum = docNum;
            return this;
        }
        public String getDocNum() {
            return this.docNum;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setDocType(String docType) {
            this.docType = docType;
            return this;
        }
        public String getDocType() {
            return this.docType;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setRegisteredAddress(String registeredAddress) {
            this.registeredAddress = registeredAddress;
            return this;
        }
        public String getRegisteredAddress() {
            return this.registeredAddress;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setRegisteredCountry(String registeredCountry) {
            this.registeredCountry = registeredCountry;
            return this;
        }
        public String getRegisteredCountry() {
            return this.registeredCountry;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setRegisteredNum(String registeredNum) {
            this.registeredNum = registeredNum;
            return this;
        }
        public String getRegisteredNum() {
            return this.registeredNum;
        }

        public GetIdentityRegistrationByCustomerResponseBodyData setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

    }

}
