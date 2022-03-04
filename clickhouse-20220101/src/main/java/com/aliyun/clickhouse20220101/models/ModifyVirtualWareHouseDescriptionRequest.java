// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseDescriptionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组描述信息
    @NameInMap("VirtualWareHouseDescription")
    public String virtualWareHouseDescription;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static ModifyVirtualWareHouseDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseDescriptionRequest self = new ModifyVirtualWareHouseDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseDescriptionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyVirtualWareHouseDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualWareHouseDescriptionRequest setVirtualWareHouseDescription(String virtualWareHouseDescription) {
        this.virtualWareHouseDescription = virtualWareHouseDescription;
        return this;
    }
    public String getVirtualWareHouseDescription() {
        return this.virtualWareHouseDescription;
    }

    public ModifyVirtualWareHouseDescriptionRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
