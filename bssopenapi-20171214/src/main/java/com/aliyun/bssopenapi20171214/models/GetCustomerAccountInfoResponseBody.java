// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCustomerAccountInfoResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerAccountInfoResponseBody self = new GetCustomerAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerAccountInfoResponseBody setData(GetCustomerAccountInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerAccountInfoResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class GetCustomerAccountInfoResponseBodyData extends TeaModel {
        /**
         * <p>The type of the account. A value of 1 indicates an enterprise account. A value of 0 indicates an individual account.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The business status of the customer. Valid values:</p>
         * <br>
         * <p>Freeze: The business is frozen.</p>
         * <br>
         * <p>Thaw: The business is unfrozen.</p>
         * <br>
         * <p>Trusteeship: The business is hosted.</p>
         * <br>
         * <p>TrusteeshipCancel: The business is not hosted.</p>
         */
        @NameInMap("CreditLimitStatus")
        public String creditLimitStatus;

        /**
         * <p>The hosting status of the credit information and instances of the customer. If the credit information and instances of the customer are managed on Alibaba Cloud, Alibaba Cloud suspends a customer service upon overdue payment. Valid values:</p>
         * <br>
         * <p>FREEZE: The business of the customer is frozen.</p>
         * <br>
         * <p>TRUSTEESHIP: The business of the customer is hosted.</p>
         */
        @NameInMap("HostingStatus")
        public String hostingStatus;

        /**
         * <p>Indicates whether the account passes the real-name verification.</p>
         */
        @NameInMap("IsCertified")
        public Boolean isCertified;

        /**
         * <p>The email address of the customer.</p>
         */
        @NameInMap("LoginEmail")
        public String loginEmail;

        /**
         * <p>The ID of the management account.</p>
         */
        @NameInMap("Mpk")
        public Long mpk;

        public static GetCustomerAccountInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerAccountInfoResponseBodyData self = new GetCustomerAccountInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerAccountInfoResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetCustomerAccountInfoResponseBodyData setCreditLimitStatus(String creditLimitStatus) {
            this.creditLimitStatus = creditLimitStatus;
            return this;
        }
        public String getCreditLimitStatus() {
            return this.creditLimitStatus;
        }

        public GetCustomerAccountInfoResponseBodyData setHostingStatus(String hostingStatus) {
            this.hostingStatus = hostingStatus;
            return this;
        }
        public String getHostingStatus() {
            return this.hostingStatus;
        }

        public GetCustomerAccountInfoResponseBodyData setIsCertified(Boolean isCertified) {
            this.isCertified = isCertified;
            return this;
        }
        public Boolean getIsCertified() {
            return this.isCertified;
        }

        public GetCustomerAccountInfoResponseBodyData setLoginEmail(String loginEmail) {
            this.loginEmail = loginEmail;
            return this;
        }
        public String getLoginEmail() {
            return this.loginEmail;
        }

        public GetCustomerAccountInfoResponseBodyData setMpk(Long mpk) {
            this.mpk = mpk;
            return this;
        }
        public Long getMpk() {
            return this.mpk;
        }

    }

}
