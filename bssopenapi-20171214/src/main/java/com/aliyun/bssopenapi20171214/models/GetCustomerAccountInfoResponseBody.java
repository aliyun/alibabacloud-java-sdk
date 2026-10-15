// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetCustomerAccountInfoResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94017C56-1725-5DD9-AB41-B3BAE791D600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was completed. A value of false indicates that an error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li>1: enterprise account.</li>
         * <li>0: individual account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The business type of the end user.</p>
         * <p>Valid values:</p>
         * <ol>
         * <li><p>Freeze: The user is in a frozen state.</p>
         * </li>
         * <li><p>Thaw: The user is in a thawed state.</p>
         * </li>
         * <li><p>Trusteeship: The user is in a trusteeship state.</p>
         * </li>
         * <li><p>TrusteeshipCancel: The user is in a non-trusteeship state.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Freeze</p>
         */
        @NameInMap("CreditLimitStatus")
        public String creditLimitStatus;

        /**
         * <p>The hosting status. This parameter is provided by the credit control system and indicates whether the instance is managed by Alibaba Cloud. If the instance is managed, Alibaba Cloud handles resource suspension/resumption due to overdue payments.</p>
         * <p>Valid values:</p>
         * <ol>
         * <li><p>FREEZE: The user\&quot;s business is frozen.</p>
         * </li>
         * <li><p>TRUSTEESHIP: The user\&quot;s business is under trusteeship.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>FREEZE</p>
         */
        @NameInMap("HostingStatus")
        public String hostingStatus;

        /**
         * <p>The real-name verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCertified")
        public Boolean isCertified;

        /**
         * <p>The email address of the end customer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@aliyun.com">xxxx@aliyun.com</a></p>
         */
        @NameInMap("LoginEmail")
        public String loginEmail;

        /**
         * <p>The MPK of the parent account.</p>
         * 
         * <strong>example:</strong>
         * <p>1051360339779133</p>
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
