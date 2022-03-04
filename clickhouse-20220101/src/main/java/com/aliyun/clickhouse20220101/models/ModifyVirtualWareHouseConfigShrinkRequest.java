// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseConfigShrinkRequest extends TeaModel {
    // 参数变更列表
    @NameInMap("ConfigChanges")
    public String configChangesShrink;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static ModifyVirtualWareHouseConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseConfigShrinkRequest self = new ModifyVirtualWareHouseConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseConfigShrinkRequest setConfigChangesShrink(String configChangesShrink) {
        this.configChangesShrink = configChangesShrink;
        return this;
    }
    public String getConfigChangesShrink() {
        return this.configChangesShrink;
    }

    public ModifyVirtualWareHouseConfigShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyVirtualWareHouseConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualWareHouseConfigShrinkRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

}
