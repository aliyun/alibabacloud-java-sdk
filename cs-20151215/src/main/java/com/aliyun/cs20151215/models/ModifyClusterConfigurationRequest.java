// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterConfigurationRequest extends TeaModel {
    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 自定配置。
    @NameInMap("customize_config")
    public ModifyClusterConfigurationRequestCustomizeConfig customizeConfig;

    public static ModifyClusterConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConfigurationRequest self = new ModifyClusterConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConfigurationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterConfigurationRequest setCustomizeConfig(ModifyClusterConfigurationRequestCustomizeConfig customizeConfig) {
        this.customizeConfig = customizeConfig;
        return this;
    }
    public ModifyClusterConfigurationRequestCustomizeConfig getCustomizeConfig() {
        return this.customizeConfig;
    }

    public static class ModifyClusterConfigurationRequestCustomizeConfigConfigs extends TeaModel {
        // key。
        @NameInMap("key")
        public String key;

        // value。
        @NameInMap("value")
        public String value;

        public static ModifyClusterConfigurationRequestCustomizeConfigConfigs build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterConfigurationRequestCustomizeConfigConfigs self = new ModifyClusterConfigurationRequestCustomizeConfigConfigs();
            return TeaModel.build(map, self);
        }

        public ModifyClusterConfigurationRequestCustomizeConfigConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyClusterConfigurationRequestCustomizeConfigConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyClusterConfigurationRequestCustomizeConfig extends TeaModel {
        // 配置集合。
        @NameInMap("configs")
        public ModifyClusterConfigurationRequestCustomizeConfigConfigs configs;

        // 配置名称。
        @NameInMap("name")
        public String name;

        public static ModifyClusterConfigurationRequestCustomizeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterConfigurationRequestCustomizeConfig self = new ModifyClusterConfigurationRequestCustomizeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterConfigurationRequestCustomizeConfig setConfigs(ModifyClusterConfigurationRequestCustomizeConfigConfigs configs) {
            this.configs = configs;
            return this;
        }
        public ModifyClusterConfigurationRequestCustomizeConfigConfigs getConfigs() {
            return this.configs;
        }

        public ModifyClusterConfigurationRequestCustomizeConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
