// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFreeNodesRequest extends TeaModel {
    @NameInMap("HpnZone")
    public String hpnZone;

    @NameInMap("MachineType")
    public String machineType;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

    public ListFreeNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
