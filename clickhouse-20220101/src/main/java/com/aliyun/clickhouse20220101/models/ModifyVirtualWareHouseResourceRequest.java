// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseResourceRequest extends TeaModel {
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

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static ModifyVirtualWareHouseResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseResourceRequest self = new ModifyVirtualWareHouseResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseResourceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyVirtualWareHouseResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualWareHouseResourceRequest setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
        this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
        return this;
    }
    public Integer getVirtualWareHouseCacheStorage() {
        return this.virtualWareHouseCacheStorage;
    }

    public ModifyVirtualWareHouseResourceRequest setVirtualWareHouseClass(String virtualWareHouseClass) {
        this.virtualWareHouseClass = virtualWareHouseClass;
        return this;
    }
    public String getVirtualWareHouseClass() {
        return this.virtualWareHouseClass;
    }

    public ModifyVirtualWareHouseResourceRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
