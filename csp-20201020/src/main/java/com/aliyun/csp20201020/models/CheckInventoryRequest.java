// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckInventoryRequest extends TeaModel {
    @NameInMap("CloudDiskSize")
    public Long cloudDiskSize;

    @NameInMap("CuNum")
    public Long cuNum;

    @NameInMap("EnableMultiAvailableZone")
    public Boolean enableMultiAvailableZone;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MainZoneId")
    public String mainZoneId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneIds")
    public String zoneIds;

    public static CheckInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInventoryRequest self = new CheckInventoryRequest();
        return TeaModel.build(map, self);
    }

    public CheckInventoryRequest setCloudDiskSize(Long cloudDiskSize) {
        this.cloudDiskSize = cloudDiskSize;
        return this;
    }
    public Long getCloudDiskSize() {
        return this.cloudDiskSize;
    }

    public CheckInventoryRequest setCuNum(Long cuNum) {
        this.cuNum = cuNum;
        return this;
    }
    public Long getCuNum() {
        return this.cuNum;
    }

    public CheckInventoryRequest setEnableMultiAvailableZone(Boolean enableMultiAvailableZone) {
        this.enableMultiAvailableZone = enableMultiAvailableZone;
        return this;
    }
    public Boolean getEnableMultiAvailableZone() {
        return this.enableMultiAvailableZone;
    }

    public CheckInventoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckInventoryRequest setMainZoneId(String mainZoneId) {
        this.mainZoneId = mainZoneId;
        return this;
    }
    public String getMainZoneId() {
        return this.mainZoneId;
    }

    public CheckInventoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckInventoryRequest setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

}
