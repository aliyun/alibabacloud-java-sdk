// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsRequest extends TeaModel {
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

    public static class UpdateConfigsRequestConfigsLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateConfigsRequestConfigsLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigsRequestConfigsLabels self = new UpdateConfigsRequestConfigsLabels();
            return TeaModel.build(map, self);
        }

        public UpdateConfigsRequestConfigsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateConfigsRequestConfigsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateConfigsRequestConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CommonResourceConfig</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>tempStoragePath</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <strong>example:</strong>
         * <p>oss://test/s/</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Labels")
        public java.util.List<UpdateConfigsRequestConfigsLabels> labels;

        public static UpdateConfigsRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigsRequestConfigs self = new UpdateConfigsRequestConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateConfigsRequestConfigs setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
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

        public UpdateConfigsRequestConfigs setLabels(java.util.List<UpdateConfigsRequestConfigsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<UpdateConfigsRequestConfigsLabels> getLabels() {
            return this.labels;
        }

    }

}
