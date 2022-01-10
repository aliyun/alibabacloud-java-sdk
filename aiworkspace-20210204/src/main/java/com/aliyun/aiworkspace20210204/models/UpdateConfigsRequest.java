// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsRequest extends TeaModel {
    // 配置列表
    @NameInMap("Configs")
    public java.util.List<UpdateConfigsRequestConfigs> configs;

    public static UpdateConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigsRequest self = new UpdateConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigsRequest setConfigs(java.util.List<UpdateConfigsRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<UpdateConfigsRequestConfigs> getConfigs() {
        return this.configs;
    }

    public static class UpdateConfigsRequestConfigs extends TeaModel {
        // 配置键
        @NameInMap("ConfigKey")
        public String configKey;

        // 配置值
        @NameInMap("ConfigValue")
        public String configValue;

        public static UpdateConfigsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigsRequestConfigs self = new UpdateConfigsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateConfigsRequestConfigs setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public UpdateConfigsRequestConfigs setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

    }

}
