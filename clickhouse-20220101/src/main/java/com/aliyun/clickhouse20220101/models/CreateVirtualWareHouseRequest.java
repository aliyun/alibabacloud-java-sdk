// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateVirtualWareHouseRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组本地缓存空间 GiB
    @NameInMap("VirtualWareHouseCacheStorage")
    public Integer virtualWareHouseCacheStorage;

    // 计算组规格码
    @NameInMap("VirtualWareHouseClass")
    public String virtualWareHouseClass;

    // 计算组描述信息
    @NameInMap("VirtualWareHouseDescription")
    public String virtualWareHouseDescription;

    // 交换机ID
    @NameInMap("VswitchId")
    public String vswitchId;

    // 可用区ID
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateVirtualWareHouseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualWareHouseRequest self = new CreateVirtualWareHouseRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualWareHouseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateVirtualWareHouseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualWareHouseRequest setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
        this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
        return this;
    }
    public Integer getVirtualWareHouseCacheStorage() {
        return this.virtualWareHouseCacheStorage;
    }

    public CreateVirtualWareHouseRequest setVirtualWareHouseClass(String virtualWareHouseClass) {
        this.virtualWareHouseClass = virtualWareHouseClass;
        return this;
    }
    public String getVirtualWareHouseClass() {
        return this.virtualWareHouseClass;
    }

    public CreateVirtualWareHouseRequest setVirtualWareHouseDescription(String virtualWareHouseDescription) {
        this.virtualWareHouseDescription = virtualWareHouseDescription;
        return this;
    }
    public String getVirtualWareHouseDescription() {
        return this.virtualWareHouseDescription;
    }

    public CreateVirtualWareHouseRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateVirtualWareHouseRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
