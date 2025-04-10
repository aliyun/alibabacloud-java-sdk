// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterNodesRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i15b480fbd2fcdbc2869cd80</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Number of items per page in a paginated query, with a default value of 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>Query token (Token), which is the value of the NextToken parameter returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdQ3Z+oPlg49gsr2y8jb6wY=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Node group ID</p>
     * 
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>resource group id</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxkxkllss</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>tag information</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListClusterNodesRequestTags> tags;

    public static ListClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodesRequest self = new ListClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterNodesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListClusterNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterNodesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListClusterNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListClusterNodesRequest setTags(java.util.List<ListClusterNodesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListClusterNodesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListClusterNodesRequestTags extends TeaModel {
        /**
         * <p>The key of tag object</p>
         * 
         * <strong>example:</strong>
         * <p>aa_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag object</p>
         * 
         * <strong>example:</strong>
         * <p>aa_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListClusterNodesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListClusterNodesRequestTags self = new ListClusterNodesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListClusterNodesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClusterNodesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
