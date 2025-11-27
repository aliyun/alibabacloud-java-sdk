// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListActionPlansResponseBody extends TeaModel {
    /**
     * <p>The list of execution plan results.</p>
     */
    @NameInMap("ActionPlans")
    public java.util.List<ListActionPlansResponseBodyActionPlans> actionPlans;

    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates the read position returned by the current call. An empty value means all data has been read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86scXXXXXXXXXX</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total data count under the current request conditions (optional; not returned by default).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListActionPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionPlansResponseBody self = new ListActionPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActionPlansResponseBody setActionPlans(java.util.List<ListActionPlansResponseBodyActionPlans> actionPlans) {
        this.actionPlans = actionPlans;
        return this;
    }
    public java.util.List<ListActionPlansResponseBodyActionPlans> getActionPlans() {
        return this.actionPlans;
    }

    public ListActionPlansResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListActionPlansResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListActionPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListActionPlansResponseBodyActionPlans extends TeaModel {
        /**
         * <p>The ID of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-hz036ubmx2qmw93k****</p>
         */
        @NameInMap("ActionPlanId")
        public String actionPlanId;

        /**
         * <p>The name of the execution plan.</p>
         * 
         * <strong>example:</strong>
         * <p>TestActionPlan</p>
         */
        @NameInMap("ActionPlanName")
        public String actionPlanName;

        /**
         * <p>The time when the execution plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10 17:58:24</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The status of the execution plan. The possible values are as follows:</p>
         * <ul>
         * <li>Active Instant tasks are dynamically managed only when the execution plan is in the Active state.</li>
         * <li>Inactive Instant tasks are no longer managed by execution plans in the Inactive state.</li>
         * <li>Deleting: The execution plan is being deleted. You cannot modify the parameters of an execution plan in this state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the execution plan was last modified. The time follows the ISO 8601 standard and UTC +0. The format is yyyy-MM-ddTHH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10 17:58:24</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListActionPlansResponseBodyActionPlans build(java.util.Map<String, ?> map) throws Exception {
            ListActionPlansResponseBodyActionPlans self = new ListActionPlansResponseBodyActionPlans();
            return TeaModel.build(map, self);
        }

        public ListActionPlansResponseBodyActionPlans setActionPlanId(String actionPlanId) {
            this.actionPlanId = actionPlanId;
            return this;
        }
        public String getActionPlanId() {
            return this.actionPlanId;
        }

        public ListActionPlansResponseBodyActionPlans setActionPlanName(String actionPlanName) {
            this.actionPlanName = actionPlanName;
            return this;
        }
        public String getActionPlanName() {
            return this.actionPlanName;
        }

        public ListActionPlansResponseBodyActionPlans setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListActionPlansResponseBodyActionPlans setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListActionPlansResponseBodyActionPlans setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
