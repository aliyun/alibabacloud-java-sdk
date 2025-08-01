// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeNodesRequest extends TeaModel {
    /**
     * <p>The cluster number.</p>
     * 
     * <strong>example:</strong>
     * <p>A1</p>
     */
    @NameInMap("HpnZone")
    public String hpnZone;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>mock-machine-type2</p>
     */
    @NameInMap("MachineType")
    public String machineType;

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
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The types of the returned nodes that are not used.</p>
     */
    @NameInMap("OperatingStates")
    public java.util.List<String> operatingStates;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxno4vh5muoq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListFreeNodesRequestTags> tags;

    public static ListFreeNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFreeNodesRequest self = new ListFreeNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListFreeNodesRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public ListFreeNodesRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public ListFreeNodesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListFreeNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFreeNodesRequest setOperatingStates(java.util.List<String> operatingStates) {
        this.operatingStates = operatingStates;
        return this;
    }
    public java.util.List<String> getOperatingStates() {
        return this.operatingStates;
    }

    public ListFreeNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListFreeNodesRequest setTags(java.util.List<ListFreeNodesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListFreeNodesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListFreeNodesRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key_aa</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value_aa</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFreeNodesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListFreeNodesRequestTags self = new ListFreeNodesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListFreeNodesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFreeNodesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
