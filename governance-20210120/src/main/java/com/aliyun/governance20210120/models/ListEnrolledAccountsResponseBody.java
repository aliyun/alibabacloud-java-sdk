// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEnrolledAccountsResponseBody extends TeaModel {
    /**
     * <p>The accounts.</p>
     */
    @NameInMap("EnrolledAccounts")
    public java.util.List<ListEnrolledAccountsResponseBodyEnrolledAccounts> enrolledAccounts;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The account ID.</p>
         */
        @NameInMap("AccountUid")
        public Long accountUid;

        /**
         * <p>The baseline ID.</p>
         */
        @NameInMap("BaselineId")
        public String baselineId;

        /**
         * <p>The time at which the account was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The display name of the account.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the parent folder.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the billing account.</p>
         */
        @NameInMap("PayerAccountUid")
        public Long payerAccountUid;

        /**
         * <p>The creation status of the account. Valid values:</p>
         * <br>
         * <p>*   Pending: The account is waiting to be created.</p>
         * <p>*   Running: The account is being created.</p>
         * <p>*   Finished: The account is created.</p>
         * <p>*   Failed: The account failed to be created.</p>
         * <p>*   Scheduling: The account is being scheduled.</p>
         * <p>*   ScheduleFailed: The account failed to be scheduled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the information about the account was updated.</p>
         */
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

        public ListEnrolledAccountsResponseBodyEnrolledAccounts setBaselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public String getBaselineId() {
            return this.baselineId;
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
