// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ReleaseInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReleaseIgnoreTime")
    public Boolean releaseIgnoreTime;

    @NameInMap("ForceDeleteInstance")
    public Boolean forceDeleteInstance;

    public static ReleaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceRequest self = new ReleaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseInstanceRequest setReleaseIgnoreTime(Boolean releaseIgnoreTime) {
        this.releaseIgnoreTime = releaseIgnoreTime;
        return this;
    }
    public Boolean getReleaseIgnoreTime() {
        return this.releaseIgnoreTime;
    }

    public ReleaseInstanceRequest setForceDeleteInstance(Boolean forceDeleteInstance) {
        this.forceDeleteInstance = forceDeleteInstance;
        return this;
    }
    public Boolean getForceDeleteInstance() {
        return this.forceDeleteInstance;
    }

}
