// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDedicatedClusterRequest extends TeaModel {
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DedicatedClusterName")
    public String dedicatedClusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OversoldRatio")
    public Integer oversoldRatio;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDedicatedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedClusterRequest self = new ModifyDedicatedClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedClusterRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public ModifyDedicatedClusterRequest setDedicatedClusterName(String dedicatedClusterName) {
        this.dedicatedClusterName = dedicatedClusterName;
        return this;
    }
    public String getDedicatedClusterName() {
        return this.dedicatedClusterName;
    }

    public ModifyDedicatedClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDedicatedClusterRequest setOversoldRatio(Integer oversoldRatio) {
        this.oversoldRatio = oversoldRatio;
        return this;
    }
    public Integer getOversoldRatio() {
        return this.oversoldRatio;
    }

    public ModifyDedicatedClusterRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyDedicatedClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
