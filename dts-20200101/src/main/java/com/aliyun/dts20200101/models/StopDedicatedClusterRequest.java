// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopDedicatedClusterRequest extends TeaModel {
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DedicatedClusterName")
    public String dedicatedClusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static StopDedicatedClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDedicatedClusterRequest self = new StopDedicatedClusterRequest();
        return TeaModel.build(map, self);
    }

    public StopDedicatedClusterRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public StopDedicatedClusterRequest setDedicatedClusterName(String dedicatedClusterName) {
        this.dedicatedClusterName = dedicatedClusterName;
        return this;
    }
    public String getDedicatedClusterName() {
        return this.dedicatedClusterName;
    }

    public StopDedicatedClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopDedicatedClusterRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StopDedicatedClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
