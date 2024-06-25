// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterConfigurationRequest extends TeaModel {
    /**
     * <p>The custom configuration.</p>
     */
    @NameInMap("customize_config")
    public java.util.List<ModifyClusterConfigurationRequestCustomizeConfig> customizeConfig;

    public static ModifyClusterConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterConfigurationRequest self = new ModifyClusterConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterConfigurationRequest setCustomizeConfig(java.util.List<ModifyClusterConfigurationRequestCustomizeConfig> customizeConfig) {
        this.customizeConfig = customizeConfig;
        return this;
    }
    public java.util.List<ModifyClusterConfigurationRequestCustomizeConfig> getCustomizeConfig() {
        return this.customizeConfig;
    }

    public static class ModifyClusterConfigurationRequestCustomizeConfigConfigs extends TeaModel {
        /**
         * <p>The name of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxRequestsInflight</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The custom configuration.</p>
         */
        @NameInMap("configs")
        public java.util.List<ModifyClusterConfigurationRequestCustomizeConfigConfigs> configs;

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>kube-apiserver</p>
         */
        @NameInMap("name")
        public String name;

        public static ModifyClusterConfigurationRequestCustomizeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterConfigurationRequestCustomizeConfig self = new ModifyClusterConfigurationRequestCustomizeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyClusterConfigurationRequestCustomizeConfig setConfigs(java.util.List<ModifyClusterConfigurationRequestCustomizeConfigConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<ModifyClusterConfigurationRequestCustomizeConfigConfigs> getConfigs() {
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
