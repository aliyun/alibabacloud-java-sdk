// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DetachAndReleaseClusterEniRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TargetClusterId")
    public String targetClusterId;

    @NameInMap("VswitchId")
    public String vswitchId;

    public static DetachAndReleaseClusterEniRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAndReleaseClusterEniRequest self = new DetachAndReleaseClusterEniRequest();
        return TeaModel.build(map, self);
    }

    public DetachAndReleaseClusterEniRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DetachAndReleaseClusterEniRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachAndReleaseClusterEniRequest setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public DetachAndReleaseClusterEniRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

}
