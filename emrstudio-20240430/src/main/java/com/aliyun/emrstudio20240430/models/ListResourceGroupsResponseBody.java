// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListResourceGroupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>10。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setData(java.util.List<ListResourceGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListResourceGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListResourceGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceGroupsResponseBodyDataAssociatedClusterTemplates extends TeaModel {
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <p>78723f0dc36。</p>
         */
        @NameInMap("templateId")
        public String templateId;

        @NameInMap("templateName")
        public String templateName;

        public static ListResourceGroupsResponseBodyDataAssociatedClusterTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyDataAssociatedClusterTemplates self = new ListResourceGroupsResponseBodyDataAssociatedClusterTemplates();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyDataAssociatedClusterTemplates setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListResourceGroupsResponseBodyDataAssociatedClusterTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListResourceGroupsResponseBodyDataAssociatedClusterTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListResourceGroupsResponseBodyDataAssociatedClusters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c-3cd8ba94b36cxxxx</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("clusterName")
        public String clusterName;

        @NameInMap("clusterType")
        public String clusterType;

        public static ListResourceGroupsResponseBodyDataAssociatedClusters build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyDataAssociatedClusters self = new ListResourceGroupsResponseBodyDataAssociatedClusters();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyDataAssociatedClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListResourceGroupsResponseBodyDataAssociatedClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListResourceGroupsResponseBodyDataAssociatedClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

    }

    public static class ListResourceGroupsResponseBodyDataAssociatedWorkspaces extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1200827。</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        @NameInMap("workspaceName")
        public String workspaceName;

        public static ListResourceGroupsResponseBodyDataAssociatedWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyDataAssociatedWorkspaces self = new ListResourceGroupsResponseBodyDataAssociatedWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyDataAssociatedWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListResourceGroupsResponseBodyDataAssociatedWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListResourceGroupsResponseBodyData extends TeaModel {
        @NameInMap("associatedClusterTemplates")
        public java.util.List<ListResourceGroupsResponseBodyDataAssociatedClusterTemplates> associatedClusterTemplates;

        @NameInMap("associatedClusters")
        public java.util.List<ListResourceGroupsResponseBodyDataAssociatedClusters> associatedClusters;

        @NameInMap("associatedWorkspaces")
        public java.util.List<ListResourceGroupsResponseBodyDataAssociatedWorkspaces> associatedWorkspaces;

        /**
         * <strong>example:</strong>
         * <p>2024-09-26T02:10:04Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2。</p>
         */
        @NameInMap("nodeMaxCount")
        public Integer nodeMaxCount;

        /**
         * <strong>example:</strong>
         * <p>1。</p>
         */
        @NameInMap("nodeMinCount")
        public Integer nodeMinCount;

        /**
         * <strong>example:</strong>
         * <p>EMR_W1_SMALL。</p>
         */
        @NameInMap("nodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>rg-acfm4ewqrznxxxx</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        @NameInMap("resourceGroupName")
        public String resourceGroupName;

        /**
         * <strong>example:</strong>
         * <p>CLUSTER_RESOURCE_GROUP。</p>
         */
        @NameInMap("resourceGroupType")
        public String resourceGroupType;

        public static ListResourceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyData self = new ListResourceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyData setAssociatedClusterTemplates(java.util.List<ListResourceGroupsResponseBodyDataAssociatedClusterTemplates> associatedClusterTemplates) {
            this.associatedClusterTemplates = associatedClusterTemplates;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyDataAssociatedClusterTemplates> getAssociatedClusterTemplates() {
            return this.associatedClusterTemplates;
        }

        public ListResourceGroupsResponseBodyData setAssociatedClusters(java.util.List<ListResourceGroupsResponseBodyDataAssociatedClusters> associatedClusters) {
            this.associatedClusters = associatedClusters;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyDataAssociatedClusters> getAssociatedClusters() {
            return this.associatedClusters;
        }

        public ListResourceGroupsResponseBodyData setAssociatedWorkspaces(java.util.List<ListResourceGroupsResponseBodyDataAssociatedWorkspaces> associatedWorkspaces) {
            this.associatedWorkspaces = associatedWorkspaces;
            return this;
        }
        public java.util.List<ListResourceGroupsResponseBodyDataAssociatedWorkspaces> getAssociatedWorkspaces() {
            return this.associatedWorkspaces;
        }

        public ListResourceGroupsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupsResponseBodyData setNodeMaxCount(Integer nodeMaxCount) {
            this.nodeMaxCount = nodeMaxCount;
            return this;
        }
        public Integer getNodeMaxCount() {
            return this.nodeMaxCount;
        }

        public ListResourceGroupsResponseBodyData setNodeMinCount(Integer nodeMinCount) {
            this.nodeMinCount = nodeMinCount;
            return this;
        }
        public Integer getNodeMinCount() {
            return this.nodeMinCount;
        }

        public ListResourceGroupsResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListResourceGroupsResponseBodyData setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListResourceGroupsResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListResourceGroupsResponseBodyData setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListResourceGroupsResponseBodyData setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

    }

}
