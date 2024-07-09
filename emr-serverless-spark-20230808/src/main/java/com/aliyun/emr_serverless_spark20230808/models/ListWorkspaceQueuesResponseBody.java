// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListWorkspaceQueuesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of queues.</p>
     */
    @NameInMap("queues")
    public java.util.List<ListWorkspaceQueuesResponseBodyQueues> queues;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of a behavior.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::workspaceId:action/create_queue</p>
         */
        @NameInMap("actionArn")
        public String actionArn;

        /**
         * <p>The name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>view</p>
         */
        @NameInMap("actionName")
        public String actionName;

        /**
         * <p>The dependencies of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;view&quot;]</p>
         */
        @NameInMap("dependencies")
        public java.util.List<String> dependencies;

        /**
         * <p>The description of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>文件目录遍历、文件浏览</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the permission.</p>
         * 
         * <strong>example:</strong>
         * <p>文件目录遍历、文件浏览</p>
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
         * <p>The operations allowed for the queue.</p>
         */
        @NameInMap("allowActions")
        public java.util.List<ListWorkspaceQueuesResponseBodyQueuesAllowActions> allowActions;

        /**
         * <p>The ID of the user who created the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>237109</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The environment types of the queue.</p>
         */
        @NameInMap("environments")
        public java.util.List<String> environments;

        /**
         * <p>The maximum capacity of resources that can be used in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpu&quot;: &quot;2&quot;,&quot;memory&quot;: &quot;2Gi&quot;}</p>
         */
        @NameInMap("maxResource")
        public String maxResource;

        /**
         * <p>The minimum capacity of resources that can be used in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpu&quot;: &quot;2&quot;,&quot;memory&quot;: &quot;2Gi&quot;}</p>
         */
        @NameInMap("minResource")
        public String minResource;

        /**
         * <p>The queue label.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("properties")
        public String properties;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The queue architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;arch&quot;: &quot;x86&quot;}</p>
         */
        @NameInMap("queueScope")
        public String queueScope;

        /**
         * <p>The status of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("queueStatus")
        public String queueStatus;

        /**
         * <p>The queue type.</p>
         * 
         * <strong>example:</strong>
         * <p>instance, instanceChildren</p>
         */
        @NameInMap("queueType")
        public String queueType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The capacity of resources that are used in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cpu&quot;: &quot;2&quot;,&quot;memory&quot;: &quot;2Gi&quot;}</p>
         */
        @NameInMap("usedResource")
        public String usedResource;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
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
