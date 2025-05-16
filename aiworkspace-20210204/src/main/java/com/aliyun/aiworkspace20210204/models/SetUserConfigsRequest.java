// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class SetUserConfigsRequest extends TeaModel {
    /**
     * <p>The configurations list.</p>
     */
    @NameInMap("Configs")
    public java.util.List<SetUserConfigsRequestConfigs> configs;

    public static SetUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserConfigsRequest self = new SetUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public SetUserConfigsRequest setConfigs(java.util.List<SetUserConfigsRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<SetUserConfigsRequestConfigs> getConfigs() {
        return this.configs;
    }

    public static class SetUserConfigsRequestConfigs extends TeaModel {
        /**
         * <p>The category. Only DataPrivacyConfig is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DataPrivacyConfig</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The key of the configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customizePAIAssumedRole</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <p>The value of the configuration item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The scope. Valid values: subUser and owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static SetUserConfigsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            SetUserConfigsRequestConfigs self = new SetUserConfigsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public SetUserConfigsRequestConfigs setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public SetUserConfigsRequestConfigs setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public SetUserConfigsRequestConfigs setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public SetUserConfigsRequestConfigs setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
