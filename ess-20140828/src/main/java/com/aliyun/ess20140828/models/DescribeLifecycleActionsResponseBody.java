// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeLifecycleActionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("LifecycleActions")
    public DescribeLifecycleActionsResponseBodyLifecycleActions lifecycleActions;

    public static DescribeLifecycleActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleActionsResponseBody self = new DescribeLifecycleActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleActionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeLifecycleActionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLifecycleActionsResponseBody setLifecycleActions(DescribeLifecycleActionsResponseBodyLifecycleActions lifecycleActions) {
        this.lifecycleActions = lifecycleActions;
        return this;
    }
    public DescribeLifecycleActionsResponseBodyLifecycleActions getLifecycleActions() {
        return this.lifecycleActions;
    }

    public static class DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds self = new DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction extends TeaModel {
        @NameInMap("LifecycleHookId")
        public String lifecycleHookId;

        @NameInMap("InstanceIds")
        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds instanceIds;

        @NameInMap("LifecycleActionToken")
        public String lifecycleActionToken;

        @NameInMap("LifecycleActionStatus")
        public String lifecycleActionStatus;

        @NameInMap("LifecycleActionResult")
        public String lifecycleActionResult;

        public static DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction self = new DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction setLifecycleHookId(String lifecycleHookId) {
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }
        public String getLifecycleHookId() {
            return this.lifecycleHookId;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction setInstanceIds(DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleActionInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction setLifecycleActionToken(String lifecycleActionToken) {
            this.lifecycleActionToken = lifecycleActionToken;
            return this;
        }
        public String getLifecycleActionToken() {
            return this.lifecycleActionToken;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction setLifecycleActionStatus(String lifecycleActionStatus) {
            this.lifecycleActionStatus = lifecycleActionStatus;
            return this;
        }
        public String getLifecycleActionStatus() {
            return this.lifecycleActionStatus;
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction setLifecycleActionResult(String lifecycleActionResult) {
            this.lifecycleActionResult = lifecycleActionResult;
            return this;
        }
        public String getLifecycleActionResult() {
            return this.lifecycleActionResult;
        }

    }

    public static class DescribeLifecycleActionsResponseBodyLifecycleActions extends TeaModel {
        @NameInMap("LifecycleAction")
        public java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction> lifecycleAction;

        public static DescribeLifecycleActionsResponseBodyLifecycleActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleActionsResponseBodyLifecycleActions self = new DescribeLifecycleActionsResponseBodyLifecycleActions();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleActionsResponseBodyLifecycleActions setLifecycleAction(java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction> lifecycleAction) {
            this.lifecycleAction = lifecycleAction;
            return this;
        }
        public java.util.List<DescribeLifecycleActionsResponseBodyLifecycleActionsLifecycleAction> getLifecycleAction() {
            return this.lifecycleAction;
        }

    }

}
