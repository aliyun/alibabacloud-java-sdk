// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEnrolledAccountsResponseBody extends TeaModel {
    /**
     * <p>The enrolled accounts.</p>
     */
    @NameInMap("EnrolledAccounts")
    public java.util.List<ListEnrolledAccountsResponseBodyEnrolledAccounts> enrolledAccounts;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAALHWGpGoYCcYMxiFfmlhvh62Xr2DzYbz/SAfc*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>768F908D-A66A-5A5D-816C-20C93CBBFEE3</p>
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
         * 
         * <strong>example:</strong>
         * <p>19534534552*****</p>
         */
        @NameInMap("AccountUid")
        public Long accountUid;

        /**
         * <p>The ID of the baseline that is implemented.</p>
         * 
         * <strong>example:</strong>
         * <p>afb-bp1durvn3lgqe28v****</p>
         */
        @NameInMap("BaselineId")
        public String baselineId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T02:38:27Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAccount</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-5ESoku****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the settlement account.</p>
         * 
         * <strong>example:</strong>
         * <p>13161210500*****</p>
         */
        @NameInMap("PayerAccountUid")
        public Long payerAccountUid;

        /**
         * <p>The creation status. Valid values:</p>
         * <ul>
         * <li>Pending: The account is pending to be created.</li>
         * <li>Running: The account is being created.</li>
         * <li>Finished: The account is created.</li>
         * <li>Failed: The account fails to be created.</li>
         * <li>Scheduling: The account is being scheduled.</li>
         * <li>ScheduleFailed: The account fails to be scheduled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T02:38:27Z</p>
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
