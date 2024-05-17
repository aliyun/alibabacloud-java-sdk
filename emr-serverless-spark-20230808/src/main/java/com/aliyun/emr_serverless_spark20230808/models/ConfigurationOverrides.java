// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ConfigurationOverrides extends TeaModel {
    @NameInMap("configurations")
    public java.util.List<ConfigurationOverridesConfigurations> configurations;

    public static ConfigurationOverrides build(java.util.Map<String, ?> map) throws Exception {
        ConfigurationOverrides self = new ConfigurationOverrides();
        return TeaModel.build(map, self);
    }

    public ConfigurationOverrides setConfigurations(java.util.List<ConfigurationOverridesConfigurations> configurations) {
        this.configurations = configurations;
        return this;
    }
    public java.util.List<ConfigurationOverridesConfigurations> getConfigurations() {
        return this.configurations;
    }

    public static class ConfigurationOverridesConfigurations extends TeaModel {
        @NameInMap("configFileName")
        public String configFileName;

        @NameInMap("configItemKey")
        public String configItemKey;

        @NameInMap("configItemValue")
        public String configItemValue;

        public static ConfigurationOverridesConfigurations build(java.util.Map<String, ?> map) throws Exception {
            ConfigurationOverridesConfigurations self = new ConfigurationOverridesConfigurations();
            return TeaModel.build(map, self);
        }

        public ConfigurationOverridesConfigurations setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ConfigurationOverridesConfigurations setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ConfigurationOverridesConfigurations setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

}
