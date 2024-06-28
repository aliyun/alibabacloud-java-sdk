// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryFinancialAccountInfoResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryFinancialAccountInfoResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>97426BC2-792E-41F5-92B8-73C710DA7779</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFinancialAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFinancialAccountInfoResponseBody self = new QueryFinancialAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFinancialAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFinancialAccountInfoResponseBody setData(QueryFinancialAccountInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFinancialAccountInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryFinancialAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFinancialAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFinancialAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFinancialAccountInfoResponseBodyData extends TeaModel {
        /**
         * <p>The type of the financial account. A value of MASTER indicates that the account is a management account. A value of MEMBER indicates that the account is a member.</p>
         * 
         * <strong>example:</strong>
         * <p>MEMBER</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>Indicates whether the account is a financial account. A value of true indicates that the account is a financial account. A value of false indicates that the account is not a financial account.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFinancialAccount")
        public Boolean isFinancialAccount;

        /**
         * <p>The ID of the group to which the member belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>124</p>
         */
        @NameInMap("MemberGroupId")
        public Long memberGroupId;

        /**
         * <p>The name of the group to which the member belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Test group</p>
         */
        @NameInMap("MemberGroupName")
        public String memberGroupName;

        /**
         * <p>The display name of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("MemberNickName")
        public String memberNickName;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>killortop3</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static QueryFinancialAccountInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFinancialAccountInfoResponseBodyData self = new QueryFinancialAccountInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFinancialAccountInfoResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public QueryFinancialAccountInfoResponseBodyData setIsFinancialAccount(Boolean isFinancialAccount) {
            this.isFinancialAccount = isFinancialAccount;
            return this;
        }
        public Boolean getIsFinancialAccount() {
            return this.isFinancialAccount;
        }

        public QueryFinancialAccountInfoResponseBodyData setMemberGroupId(Long memberGroupId) {
            this.memberGroupId = memberGroupId;
            return this;
        }
        public Long getMemberGroupId() {
            return this.memberGroupId;
        }

        public QueryFinancialAccountInfoResponseBodyData setMemberGroupName(String memberGroupName) {
            this.memberGroupName = memberGroupName;
            return this;
        }
        public String getMemberGroupName() {
            return this.memberGroupName;
        }

        public QueryFinancialAccountInfoResponseBodyData setMemberNickName(String memberNickName) {
            this.memberNickName = memberNickName;
            return this;
        }
        public String getMemberNickName() {
            return this.memberNickName;
        }

        public QueryFinancialAccountInfoResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
