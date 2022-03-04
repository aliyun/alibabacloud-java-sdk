// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateVirtualWareHouseRequest extends TeaModel {
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

    public static CheckCreateVirtualWareHouseRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateVirtualWareHouseRequest self = new CheckCreateVirtualWareHouseRequest();
        return TeaModel.build(map, self);
    }

    public CheckCreateVirtualWareHouseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CheckCreateVirtualWareHouseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCreateVirtualWareHouseRequest setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
        this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
        return this;
    }
    public Integer getVirtualWareHouseCacheStorage() {
        return this.virtualWareHouseCacheStorage;
    }

    public CheckCreateVirtualWareHouseRequest setVirtualWareHouseClass(String virtualWareHouseClass) {
        this.virtualWareHouseClass = virtualWareHouseClass;
        return this;
    }
    public String getVirtualWareHouseClass() {
        return this.virtualWareHouseClass;
    }

    public CheckCreateVirtualWareHouseRequest setVirtualWareHouseDescription(String virtualWareHouseDescription) {
        this.virtualWareHouseDescription = virtualWareHouseDescription;
        return this;
    }
    public String getVirtualWareHouseDescription() {
        return this.virtualWareHouseDescription;
    }

    public CheckCreateVirtualWareHouseRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CheckCreateVirtualWareHouseRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
