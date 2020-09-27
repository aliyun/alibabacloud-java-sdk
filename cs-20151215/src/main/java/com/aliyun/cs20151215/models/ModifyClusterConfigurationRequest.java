// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterConfigurationRequest extends TeaModel {
    // 配置集合。
    @NameInMap("configs")
    public ModifyClusterConfigurationRequestConfigs configs;

    // 配置名称。
    @NameInMap("name")
    public String name;

    public static ModifyClusterConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConfigurationRequest self = new ModifyClusterConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConfigurationRequest setConfigs(ModifyClusterConfigurationRequestConfigs configs) {
        this.configs = configs;
        return this;
    }
    public ModifyClusterConfigurationRequestConfigs getConfigs() {
        return this.configs;
    }

    public ModifyClusterConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class ModifyClusterConfigurationRequestConfigs extends TeaModel {
        // key。
        @NameInMap("key")
        public String key;

        // value。
        @NameInMap("value")
        public String value;

        public static ModifyClusterConfigurationRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterConfigurationRequestConfigs self = new ModifyClusterConfigurationRequestConfigs();
            return TeaModel.build(map, self);
        }

        public ModifyClusterConfigurationRequestConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyClusterConfigurationRequestConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
