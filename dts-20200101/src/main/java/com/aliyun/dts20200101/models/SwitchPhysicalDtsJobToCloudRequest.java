// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SwitchPhysicalDtsJobToCloudRequest extends TeaModel {
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static SwitchPhysicalDtsJobToCloudRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchPhysicalDtsJobToCloudRequest self = new SwitchPhysicalDtsJobToCloudRequest();
        return TeaModel.build(map, self);
    }

    public SwitchPhysicalDtsJobToCloudRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SwitchPhysicalDtsJobToCloudRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
