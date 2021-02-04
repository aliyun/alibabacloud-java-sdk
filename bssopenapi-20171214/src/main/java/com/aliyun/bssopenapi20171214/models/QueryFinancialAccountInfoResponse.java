// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryFinancialAccountInfoResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryFinancialAccountInfoResponseData data;

    public static QueryFinancialAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFinancialAccountInfoResponse self = new QueryFinancialAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryFinancialAccountInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFinancialAccountInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFinancialAccountInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFinancialAccountInfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFinancialAccountInfoResponse setData(QueryFinancialAccountInfoResponseData data) {
        this.data = data;
        return this;
    }
    public QueryFinancialAccountInfoResponseData getData() {
        return this.data;
    }

    public static class QueryFinancialAccountInfoResponseData extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("IsFinancialAccount")
        @Validation(required = true)
        public Boolean isFinancialAccount;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("MemberNickName")
        @Validation(required = true)
        public String memberNickName;

        @NameInMap("MemberGroupId")
        @Validation(required = true)
        public Long memberGroupId;

        @NameInMap("MemberGroupName")
        @Validation(required = true)
        public String memberGroupName;

        public static QueryFinancialAccountInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryFinancialAccountInfoResponseData self = new QueryFinancialAccountInfoResponseData();
            return TeaModel.build(map, self);
        }

        public QueryFinancialAccountInfoResponseData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryFinancialAccountInfoResponseData setIsFinancialAccount(Boolean isFinancialAccount) {
            this.isFinancialAccount = isFinancialAccount;
            return this;
        }
        public Boolean getIsFinancialAccount() {
            return this.isFinancialAccount;
        }

        public QueryFinancialAccountInfoResponseData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public QueryFinancialAccountInfoResponseData setMemberNickName(String memberNickName) {
            this.memberNickName = memberNickName;
            return this;
        }
        public String getMemberNickName() {
            return this.memberNickName;
        }

        public QueryFinancialAccountInfoResponseData setMemberGroupId(Long memberGroupId) {
            this.memberGroupId = memberGroupId;
            return this;
        }
        public Long getMemberGroupId() {
            return this.memberGroupId;
        }

        public QueryFinancialAccountInfoResponseData setMemberGroupName(String memberGroupName) {
            this.memberGroupName = memberGroupName;
            return this;
        }
        public String getMemberGroupName() {
            return this.memberGroupName;
        }

    }

}
