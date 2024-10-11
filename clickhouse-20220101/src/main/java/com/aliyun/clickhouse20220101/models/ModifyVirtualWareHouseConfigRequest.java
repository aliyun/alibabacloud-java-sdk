// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigChanges")
    public java.util.List<ModifyVirtualWareHouseConfigRequestConfigChanges> configChanges;

    /**
     * <strong>example:</strong>
     * <p>cc-bp1qx68m06981****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vw-uf62965t8lt50****</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>keep_alive_timeout</p>
         */
        @NameInMap("ConfigFullPath")
        public String configFullPath;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
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
