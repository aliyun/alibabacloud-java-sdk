// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleActionsResponseBody extends TeaModel {
    /**
     * <p>The actions of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleActions")
    public java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActions> lifecycleActions;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAcSz4VTb1Nq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>42A742EB-FCF3-459E-9C62-E107048C17E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the queried lifecycle actions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLifecycleActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleActionsResponseBody self = new DescribeLifecycleActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleActionsResponseBody setLifecycleActions(java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActions> lifecycleActions) {
        this.lifecycleActions = lifecycleActions;
        return this;
    }
    public java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActions> getLifecycleActions() {
        return this.lifecycleActions;
    }

    public DescribeLifecycleActionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLifecycleActionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLifecycleActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecycleActionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLifecycleActionsResponseBodyLifecycleActions extends TeaModel {
        /**
         * <p>The IDs of the ECS instances on which the lifecycle hook takes effect</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The subsequent action that Auto Scaling performs after the lifecycle hook times out. Valid values:</p>
         * <ul>
         * <li>CONTINUE: Auto Scaling continues to respond to a scale-in or scale-out request.</li>
         * <li>ABANDON: Auto Scaling releases ECS instances that are created during scale-out events, or removes ECS instances from the scaling group during scale-in events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("LifecycleActionResult")
        public String lifecycleActionResult;

        /**
         * <p>The status of the lifecycle hook action.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("LifecycleActionStatus")
        public String lifecycleActionStatus;

        /**
         * <p>The token of the lifecycle hook action.</p>
         * 
         * <strong>example:</strong>
         * <p>9C2E9DA7-F794-449A-ACF6-CEE24444F7BB</p>
         */
        @NameInMap("LifecycleActionToken")
        public String lifecycleActionToken;

        /**
         * <p>The ID of the lifecycle hook.</p>
         * 
         * <strong>example:</strong>
         * <p>ash-bp18uoft0deax0f7****</p>
         */
        @NameInMap("LifecycleHookId")
        public String lifecycleHookId;

        public static DescribeLifecycleActionsResponseBodyLifecycleActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleActionsResponseBodyLifecycleActions self = new DescribeLifecycleActionsResponseBodyLifecycleActions();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActions setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActions setLifecycleActionResult(String lifecycleActionResult) {
            this.lifecycleActionResult = lifecycleActionResult;
            return this;
        }
        public String getLifecycleActionResult() {
            return this.lifecycleActionResult;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActions setLifecycleActionStatus(String lifecycleActionStatus) {
            this.lifecycleActionStatus = lifecycleActionStatus;
            return this;
        }
        public String getLifecycleActionStatus() {
            return this.lifecycleActionStatus;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActions setLifecycleActionToken(String lifecycleActionToken) {
            this.lifecycleActionToken = lifecycleActionToken;
            return this;
        }
        public String getLifecycleActionToken() {
            return this.lifecycleActionToken;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActions setLifecycleHookId(String lifecycleHookId) {
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }
        public String getLifecycleHookId() {
            return this.lifecycleHookId;
        }

    }

}
