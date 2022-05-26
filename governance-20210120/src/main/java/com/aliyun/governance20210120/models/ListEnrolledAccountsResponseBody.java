// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEnrolledAccountsResponseBody extends TeaModel {
    // 账号列表
    @NameInMap("EnrolledAccounts")
    public java.util.List<ListEnrolledAccountsResponseBodyEnrolledAccounts> enrolledAccounts;

    // 查询返回结果下一页的令牌
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListEnrolledAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnrolledAccountsResponseBody self = new ListEnrolledAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnrolledAccountsResponseBody setEnrolledAccounts(java.util.List<ListEnrolledAccountsResponseBodyEnrolledAccounts> enrolledAccounts) {
        this.enrolledAccounts = enrolledAccounts;
        return this;
    }
    public java.util.List<ListEnrolledAccountsResponseBodyEnrolledAccounts> getEnrolledAccounts() {
        return this.enrolledAccounts;
    }

    public ListEnrolledAccountsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEnrolledAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnrolledAccountsResponseBodyEnrolledAccounts extends TeaModel {
        // 账号ID
        @NameInMap("AccountUid")
        public Long accountUid;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 账号显示名称
        @NameInMap("DisplayName")
        public String displayName;

        // 父资源夹ID
        @NameInMap("FolderId")
        public String folderId;

        // 结算账号ID
        @NameInMap("PayerAccountUid")
        public Long payerAccountUid;

        // 创建状态
        @NameInMap("Status")
        public String status;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListEnrolledAccountsResponseBodyEnrolledAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListEnrolledAccountsResponseBodyEnrolledAccounts self = new ListEnrolledAccountsResponseBodyEnrolledAccounts();
            return TeaModel.build(map, self);
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setAccountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }
        public Long getAccountUid() {
            return this.accountUid;
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setPayerAccountUid(Long payerAccountUid) {
            this.payerAccountUid = payerAccountUid;
            return this;
        }
        public Long getPayerAccountUid() {
            return this.payerAccountUid;
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
