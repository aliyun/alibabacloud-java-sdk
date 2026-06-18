// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterHyperNodesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <p>• If this parameter is not set or is set to a value less than 20, the default value is 20.</p>
     * <p>• If this parameter is set to a value greater than 100, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token used to start the query. Set this parameter to the NextToken value returned from a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
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
     * <p>rg-acfmywpvugkh7kq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListClusterHyperNodesRequestTags> tags;

    public static ListClusterHyperNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHyperNodesRequest self = new ListClusterHyperNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterHyperNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterHyperNodesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListClusterHyperNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClusterHyperNodesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListClusterHyperNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListClusterHyperNodesRequest setTags(java.util.List<ListClusterHyperNodesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListClusterHyperNodesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListClusterHyperNodesRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>my_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>my_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListClusterHyperNodesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHyperNodesRequestTags self = new ListClusterHyperNodesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListClusterHyperNodesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClusterHyperNodesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
