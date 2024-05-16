// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryUserListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DsgUserGroupQueryUserListResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DsgUserGroupQueryUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryUserListResponseBody self = new DsgUserGroupQueryUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryUserListResponseBody setData(java.util.List<DsgUserGroupQueryUserListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DsgUserGroupQueryUserListResponseBodyData> getData() {
        return this.data;
    }

    public DsgUserGroupQueryUserListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgUserGroupQueryUserListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgUserGroupQueryUserListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgUserGroupQueryUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgUserGroupQueryUserListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgUserGroupQueryUserListResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountType")
        public Integer accountType;

        @NameInMap("BaseId")
        public String baseId;

        @NameInMap("ParentAccountId")
        public String parentAccountId;

        @NameInMap("YunAccount")
        public String yunAccount;

        public static DsgUserGroupQueryUserListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupQueryUserListResponseBodyData self = new DsgUserGroupQueryUserListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupQueryUserListResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DsgUserGroupQueryUserListResponseBodyData setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public DsgUserGroupQueryUserListResponseBodyData setBaseId(String baseId) {
            this.baseId = baseId;
            return this;
        }
        public String getBaseId() {
            return this.baseId;
        }

        public DsgUserGroupQueryUserListResponseBodyData setParentAccountId(String parentAccountId) {
            this.parentAccountId = parentAccountId;
            return this;
        }
        public String getParentAccountId() {
            return this.parentAccountId;
        }

        public DsgUserGroupQueryUserListResponseBodyData setYunAccount(String yunAccount) {
            this.yunAccount = yunAccount;
            return this;
        }
        public String getYunAccount() {
            return this.yunAccount;
        }

    }

}
