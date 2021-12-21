// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowVariableCollectionRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyFlowVariableCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowVariableCollectionRequest self = new ModifyFlowVariableCollectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowVariableCollectionRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyFlowVariableCollectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowVariableCollectionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
