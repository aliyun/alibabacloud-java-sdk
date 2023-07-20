// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleActionsResponseBody extends TeaModel {
    @NameInMap("LifecycleActions")
    public java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActions> lifecycleActions;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("LifecycleActionResult")
        public String lifecycleActionResult;

        @NameInMap("LifecycleActionStatus")
        public String lifecycleActionStatus;

        @NameInMap("LifecycleActionToken")
        public String lifecycleActionToken;

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
