// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsRequest extends TeaModel {
    /**
     * <p>The list of workspace configurations to update or create.</p>
     */
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
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
         * 
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
         * <p>The category of the configuration item. Valid values:</p>
         * <ul>
         * <li>CommonResourceConfig: general resource configuration.</li>
         * <li>DLCAutoRecycle: DLC automatic reclamation.</li>
         * <li>DLCPriorityConfig: DLC priority settings.</li>
         * <li>DSWPriorityConfig: DSW priority settings.</li>
         * <li>QuotaMaximumDuration: the maximum running duration of DLC jobs in the quota.</li>
         * <li>CommonTagConfig: tag settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonResourceConfig</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The key of the configuration item. Valid values:</p>
         * <ul>
         * <li>tempStoragePath: the temporary storage path. This ConfigKey is valid only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: the automatic reclamation configuration. This ConfigKey is valid only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>priorityConfig: the priority configuration. This ConfigKey is valid only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
         * <li>quotaMaximumDuration: the maximum running duration of DLC jobs in the quota. This ConfigKey is valid only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: the preset tags for the workspace. Resources that are created must include these tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tempStoragePath</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <p>The configuration value.</p>
         * <ul>
         * <li>If ConfigKey is set to predefinedTags, the ConfigValue format is [{&quot;Type&quot;:&quot;Tag&quot;,&quot;Key&quot;:&quot;Key1&quot;,&quot;Value&quot;:&quot;{\&quot;Products\&quot;:\&quot;DLC,DSW,EAS\&quot;,\&quot;Values\&quot;:\&quot;value1,value2,value3\&quot;}&quot;}]. Products specifies which products use the preset tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test/s/</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The list of labels for the configuration item.</p>
         */
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
