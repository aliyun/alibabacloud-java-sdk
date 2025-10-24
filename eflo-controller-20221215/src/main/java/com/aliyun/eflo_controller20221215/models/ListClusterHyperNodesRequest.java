// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListClusterHyperNodesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>563d42ae0b17572449ec8c97f7f66069</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ng-ec3c96ff0aa4c60d</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmywpvugkh7kq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
         * <strong>example:</strong>
         * <p>my_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
