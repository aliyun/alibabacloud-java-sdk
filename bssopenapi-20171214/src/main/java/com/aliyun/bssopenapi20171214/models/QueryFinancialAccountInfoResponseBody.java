// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryFinancialAccountInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryFinancialAccountInfoResponseBodyData data;

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

    public QueryFinancialAccountInfoResponseBody setData(QueryFinancialAccountInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFinancialAccountInfoResponseBodyData getData() {
        return this.data;
    }

    public static class QueryFinancialAccountInfoResponseBodyData extends TeaModel {
        @NameInMap("MemberNickName")
        public String memberNickName;

        @NameInMap("IsFinancialAccount")
        public Boolean isFinancialAccount;

        @NameInMap("MemberGroupName")
        public String memberGroupName;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("MemberGroupId")
        public Long memberGroupId;

        public static QueryFinancialAccountInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFinancialAccountInfoResponseBodyData self = new QueryFinancialAccountInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFinancialAccountInfoResponseBodyData setMemberNickName(String memberNickName) {
            this.memberNickName = memberNickName;
            return this;
        }
        public String getMemberNickName() {
            return this.memberNickName;
        }

        public QueryFinancialAccountInfoResponseBodyData setIsFinancialAccount(Boolean isFinancialAccount) {
            this.isFinancialAccount = isFinancialAccount;
            return this;
        }
        public Boolean getIsFinancialAccount() {
            return this.isFinancialAccount;
        }

        public QueryFinancialAccountInfoResponseBodyData setMemberGroupName(String memberGroupName) {
            this.memberGroupName = memberGroupName;
            return this;
        }
        public String getMemberGroupName() {
            return this.memberGroupName;
        }

        public QueryFinancialAccountInfoResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryFinancialAccountInfoResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public QueryFinancialAccountInfoResponseBodyData setMemberGroupId(Long memberGroupId) {
            this.memberGroupId = memberGroupId;
            return this;
        }
        public Long getMemberGroupId() {
            return this.memberGroupId;
        }

    }

}
