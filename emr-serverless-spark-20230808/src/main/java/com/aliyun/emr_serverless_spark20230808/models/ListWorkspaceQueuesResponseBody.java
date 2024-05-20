// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspaceQueuesResponseBody extends TeaModel {
    /**
     * <p>一次获取的最大记录数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>下一页TOKEN。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("queues")
    public java.util.List<ListWorkspaceQueuesResponseBodyQueues> queues;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>记录总数。</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListWorkspaceQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceQueuesResponseBody self = new ListWorkspaceQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceQueuesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkspaceQueuesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkspaceQueuesResponseBody setQueues(java.util.List<ListWorkspaceQueuesResponseBodyQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<ListWorkspaceQueuesResponseBodyQueues> getQueues() {
        return this.queues;
    }

    public ListWorkspaceQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceQueuesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkspaceQueuesResponseBodyQueuesAllowActions extends TeaModel {
        /**
         * <p>行为 arn。</p>
         */
        @NameInMap("actionArn")
        public String actionArn;

        /**
         * <p>权限名称。</p>
         */
        @NameInMap("actionName")
        public String actionName;

        /**
         * <p>action 依赖列表。</p>
         */
        @NameInMap("dependencies")
        public java.util.List<String> dependencies;

        /**
         * <p>action 描述。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>权限展示名称。</p>
         */
        @NameInMap("displayName")
        public String displayName;

        public static ListWorkspaceQueuesResponseBodyQueuesAllowActions build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceQueuesResponseBodyQueuesAllowActions self = new ListWorkspaceQueuesResponseBodyQueuesAllowActions();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceQueuesResponseBodyQueuesAllowActions setActionArn(String actionArn) {
            this.actionArn = actionArn;
            return this;
        }
        public String getActionArn() {
            return this.actionArn;
        }

        public ListWorkspaceQueuesResponseBodyQueuesAllowActions setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListWorkspaceQueuesResponseBodyQueuesAllowActions setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public ListWorkspaceQueuesResponseBodyQueuesAllowActions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspaceQueuesResponseBodyQueuesAllowActions setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class ListWorkspaceQueuesResponseBodyQueues extends TeaModel {
        /**
         * <p>队列允许的操作</p>
         */
        @NameInMap("allowActions")
        public java.util.List<ListWorkspaceQueuesResponseBodyQueuesAllowActions> allowActions;

        @NameInMap("creator")
        public String creator;

        @NameInMap("environments")
        public java.util.List<String> environments;

        /**
         * <p>队列资源最大容量</p>
         */
        @NameInMap("maxResource")
        public String maxResource;

        /**
         * <p>队列资源最小容量</p>
         */
        @NameInMap("minResource")
        public String minResource;

        /**
         * <p>队列Label</p>
         */
        @NameInMap("properties")
        public String properties;

        /**
         * <p>队列名称。</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>队列架构</p>
         */
        @NameInMap("queueScope")
        public String queueScope;

        @NameInMap("queueStatus")
        public String queueStatus;

        /**
         * <p>队列类型</p>
         */
        @NameInMap("queueType")
        public String queueType;

        /**
         * <p>regionId。</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>队列资源使用容量</p>
         */
        @NameInMap("usedResource")
        public String usedResource;

        /**
         * <p>工作空间id。</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListWorkspaceQueuesResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceQueuesResponseBodyQueues self = new ListWorkspaceQueuesResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceQueuesResponseBodyQueues setAllowActions(java.util.List<ListWorkspaceQueuesResponseBodyQueuesAllowActions> allowActions) {
            this.allowActions = allowActions;
            return this;
        }
        public java.util.List<ListWorkspaceQueuesResponseBodyQueuesAllowActions> getAllowActions() {
            return this.allowActions;
        }

        public ListWorkspaceQueuesResponseBodyQueues setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkspaceQueuesResponseBodyQueues setEnvironments(java.util.List<String> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<String> getEnvironments() {
            return this.environments;
        }

        public ListWorkspaceQueuesResponseBodyQueues setMaxResource(String maxResource) {
            this.maxResource = maxResource;
            return this;
        }
        public String getMaxResource() {
            return this.maxResource;
        }

        public ListWorkspaceQueuesResponseBodyQueues setMinResource(String minResource) {
            this.minResource = minResource;
            return this;
        }
        public String getMinResource() {
            return this.minResource;
        }

        public ListWorkspaceQueuesResponseBodyQueues setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public ListWorkspaceQueuesResponseBodyQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListWorkspaceQueuesResponseBodyQueues setQueueScope(String queueScope) {
            this.queueScope = queueScope;
            return this;
        }
        public String getQueueScope() {
            return this.queueScope;
        }

        public ListWorkspaceQueuesResponseBodyQueues setQueueStatus(String queueStatus) {
            this.queueStatus = queueStatus;
            return this;
        }
        public String getQueueStatus() {
            return this.queueStatus;
        }

        public ListWorkspaceQueuesResponseBodyQueues setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public ListWorkspaceQueuesResponseBodyQueues setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListWorkspaceQueuesResponseBodyQueues setUsedResource(String usedResource) {
            this.usedResource = usedResource;
            return this;
        }
        public String getUsedResource() {
            return this.usedResource;
        }

        public ListWorkspaceQueuesResponseBodyQueues setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
