// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseConfigRequest extends TeaModel {
    // 参数变更列表
    @NameInMap("ConfigChanges")
    public java.util.List<ModifyVirtualWareHouseConfigRequestConfigChanges> configChanges;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    // 计算组ID
    @NameInMap("VirtualWareHouseId")
    public String virtualWareHouseId;

    public static ModifyVirtualWareHouseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseConfigRequest self = new ModifyVirtualWareHouseConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseConfigRequest setConfigChanges(java.util.List<ModifyVirtualWareHouseConfigRequestConfigChanges> configChanges) {
        this.configChanges = configChanges;
        return this;
    }
    public java.util.List<ModifyVirtualWareHouseConfigRequestConfigChanges> getConfigChanges() {
        return this.configChanges;
    }

    public ModifyVirtualWareHouseConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyVirtualWareHouseConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualWareHouseConfigRequest setVirtualWareHouseId(String virtualWareHouseId) {
        this.virtualWareHouseId = virtualWareHouseId;
        return this;
    }
    public String getVirtualWareHouseId() {
        return this.virtualWareHouseId;
    }

    public static class ModifyVirtualWareHouseConfigRequestConfigChanges extends TeaModel {
        // 参数路径
        @NameInMap("ConfigFullPath")
        public String configFullPath;

        // 参数设定值
        @NameInMap("Value")
        public String value;

        public static ModifyVirtualWareHouseConfigRequestConfigChanges build(java.util.Map<String, ?> map) throws Exception {
            ModifyVirtualWareHouseConfigRequestConfigChanges self = new ModifyVirtualWareHouseConfigRequestConfigChanges();
            return TeaModel.build(map, self);
        }

        public ModifyVirtualWareHouseConfigRequestConfigChanges setConfigFullPath(String configFullPath) {
            this.configFullPath = configFullPath;
            return this;
        }
        public String getConfigFullPath() {
            return this.configFullPath;
        }

        public ModifyVirtualWareHouseConfigRequestConfigChanges setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
