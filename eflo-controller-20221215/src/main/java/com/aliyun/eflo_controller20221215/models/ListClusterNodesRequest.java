// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterNodesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i15b480fbd2fcdbc2869cd80</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token that determines the start position of the query. Set this parameter to the value of the NextToken parameter that is returned from the last call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdQ3Z+oPlg49gsr2y8jb6wY=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The node group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxkxkllss</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
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
         * <p>The tag key for the node.</p>
         * 
         * <strong>example:</strong>
         * <p>aa_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value for the node.</p>
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
