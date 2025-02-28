// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigRequest extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ModifyDBClusterConfigRequestConfigs> configs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ModifyDBClusterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigRequest self = new ModifyDBClusterConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigRequest setConfigs(java.util.List<ModifyDBClusterConfigRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ModifyDBClusterConfigRequestConfigs> getConfigs() {
        return this.configs;
    }

    public ModifyDBClusterConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public static class ModifyDBClusterConfigRequestConfigs extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModifyDBClusterConfigRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBClusterConfigRequestConfigs self = new ModifyDBClusterConfigRequestConfigs();
            return TeaModel.build(map, self);
        }

        public ModifyDBClusterConfigRequestConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyDBClusterConfigRequestConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
