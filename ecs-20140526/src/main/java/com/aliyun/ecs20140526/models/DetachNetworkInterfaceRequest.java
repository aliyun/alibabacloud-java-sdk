// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    public String networkInterfaceId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("TrunkNetworkInstanceId")
    public String trunkNetworkInstanceId;

    public static DetachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkInterfaceRequest self = new DetachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public DetachNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DetachNetworkInterfaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachNetworkInterfaceRequest setTrunkNetworkInstanceId(String trunkNetworkInstanceId) {
        this.trunkNetworkInstanceId = trunkNetworkInstanceId;
        return this;
    }
    public String getTrunkNetworkInstanceId() {
        return this.trunkNetworkInstanceId;
    }

}
