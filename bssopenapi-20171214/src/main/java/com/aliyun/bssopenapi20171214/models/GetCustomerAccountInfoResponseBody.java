// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetCustomerAccountInfoResponseBodyData data;

    public static GetCustomerAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerAccountInfoResponseBody self = new GetCustomerAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomerAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerAccountInfoResponseBody setData(GetCustomerAccountInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerAccountInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetCustomerAccountInfoResponseBodyData extends TeaModel {
        @NameInMap("LoginEmail")
        public String loginEmail;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Mpk")
        public Long mpk;

        @NameInMap("HostingStatus")
        public String hostingStatus;

        @NameInMap("CreditLimitStatus")
        public String creditLimitStatus;

        @NameInMap("IsCertified")
        public Boolean isCertified;

        public static GetCustomerAccountInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerAccountInfoResponseBodyData self = new GetCustomerAccountInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerAccountInfoResponseBodyData setLoginEmail(String loginEmail) {
            this.loginEmail = loginEmail;
            return this;
        }
        public String getLoginEmail() {
            return this.loginEmail;
        }

        public GetCustomerAccountInfoResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetCustomerAccountInfoResponseBodyData setMpk(Long mpk) {
            this.mpk = mpk;
            return this;
        }
        public Long getMpk() {
            return this.mpk;
        }

        public GetCustomerAccountInfoResponseBodyData setHostingStatus(String hostingStatus) {
            this.hostingStatus = hostingStatus;
            return this;
        }
        public String getHostingStatus() {
            return this.hostingStatus;
        }

        public GetCustomerAccountInfoResponseBodyData setCreditLimitStatus(String creditLimitStatus) {
            this.creditLimitStatus = creditLimitStatus;
            return this;
        }
        public String getCreditLimitStatus() {
            return this.creditLimitStatus;
        }

        public GetCustomerAccountInfoResponseBodyData setIsCertified(Boolean isCertified) {
            this.isCertified = isCertified;
            return this;
        }
        public Boolean getIsCertified() {
            return this.isCertified;
        }

    }

}
