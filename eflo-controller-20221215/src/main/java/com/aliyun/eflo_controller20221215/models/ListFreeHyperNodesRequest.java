// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeHyperNodesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>The machine type.</p>
     * 
     * <strong>example:</strong>
     * <p>efg1.nvga1</p>
     */
    @NameInMap("MachineType")
    public String machineType;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <p>• If you do not set this parameter or you set a value less than 20, the default value is 20.</p>
     * <p>• If you set a value greater than 100, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. Set this parameter to the NextToken value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzyqdwnfabx6q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A list of statuses of unused nodes to return.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListFreeHyperNodesRequestTags> tags;

    public static ListFreeHyperNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFreeHyperNodesRequest self = new ListFreeHyperNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListFreeHyperNodesRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public ListFreeHyperNodesRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public ListFreeHyperNodesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFreeHyperNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFreeHyperNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListFreeHyperNodesRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListFreeHyperNodesRequest setTags(java.util.List<ListFreeHyperNodesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListFreeHyperNodesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListFreeHyperNodesRequestTags extends TeaModel {
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
         * <p>129</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFreeHyperNodesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListFreeHyperNodesRequestTags self = new ListFreeHyperNodesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListFreeHyperNodesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFreeHyperNodesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
