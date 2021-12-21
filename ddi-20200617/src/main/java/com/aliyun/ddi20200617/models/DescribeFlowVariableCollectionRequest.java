// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowVariableCollectionRequest extends TeaModel {
    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeFlowVariableCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowVariableCollectionRequest self = new DescribeFlowVariableCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowVariableCollectionRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public DescribeFlowVariableCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFlowVariableCollectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
