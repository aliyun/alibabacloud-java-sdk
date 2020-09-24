// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetCustomerAccountInfoResponseData data;

    public static GetCustomerAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerAccountInfoResponse self = new GetCustomerAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerAccountInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerAccountInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomerAccountInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerAccountInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerAccountInfoResponse setData(GetCustomerAccountInfoResponseData data) {
        this.data = data;
        return this;
    }
    public GetCustomerAccountInfoResponseData getData() {
        return this.data;
    }

    public static class GetCustomerAccountInfoResponseData extends TeaModel {
        @NameInMap("LoginEmail")
        @Validation(required = true)
        public String loginEmail;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("Mpk")
        @Validation(required = true)
        public Long mpk;

        @NameInMap("HostingStatus")
        @Validation(required = true)
        public String hostingStatus;

        @NameInMap("CreditLimitStatus")
        @Validation(required = true)
        public String creditLimitStatus;

        @NameInMap("IsCertified")
        @Validation(required = true)
        public Boolean isCertified;

        public static GetCustomerAccountInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerAccountInfoResponseData self = new GetCustomerAccountInfoResponseData();
            return TeaModel.build(map, self);
        }

        public GetCustomerAccountInfoResponseData setLoginEmail(String loginEmail) {
            this.loginEmail = loginEmail;
            return this;
        }
        public String getLoginEmail() {
            return this.loginEmail;
        }

        public GetCustomerAccountInfoResponseData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetCustomerAccountInfoResponseData setMpk(Long mpk) {
            this.mpk = mpk;
            return this;
        }
        public Long getMpk() {
            return this.mpk;
        }

        public GetCustomerAccountInfoResponseData setHostingStatus(String hostingStatus) {
            this.hostingStatus = hostingStatus;
            return this;
        }
        public String getHostingStatus() {
            return this.hostingStatus;
        }

        public GetCustomerAccountInfoResponseData setCreditLimitStatus(String creditLimitStatus) {
            this.creditLimitStatus = creditLimitStatus;
            return this;
        }
        public String getCreditLimitStatus() {
            return this.creditLimitStatus;
        }

        public GetCustomerAccountInfoResponseData setIsCertified(Boolean isCertified) {
            this.isCertified = isCertified;
            return this;
        }
        public Boolean getIsCertified() {
            return this.isCertified;
        }

    }

}
