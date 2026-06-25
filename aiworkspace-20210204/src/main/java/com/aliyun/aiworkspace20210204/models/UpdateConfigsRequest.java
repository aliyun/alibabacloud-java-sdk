// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsRequest extends TeaModel {
    /**
     * <p>A list of workspace configurations to update or add.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
         * <p>The category of the configuration item. The following categories are supported:</p>
         * <ul>
         * <li><p>CommonResourceConfig: General resource configuration.</p>
         * </li>
         * <li><p>DLCAutoRecycle: DLC automatic recycling.</p>
         * </li>
         * <li><p>DLCPriorityConfig: DLC priority settings.</p>
         * </li>
         * <li><p>DSWPriorityConfig: DSW priority settings.</p>
         * </li>
         * <li><p>QuotaMaximumDuration: Configuration for the maximum runtime of a DLC job within a quota.</p>
         * </li>
         * <li><p>CommonTagConfig: Tag settings.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonResourceConfig</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The key of the configuration item. The following keys are supported:</p>
         * <ul>
         * <li><p>tempStoragePath: The path for temporary storage. This key is valid only when CategoryName is set to CommonResourceConfig.</p>
         * </li>
         * <li><p>isAutoRecycle: The configuration for automatic resource recycling. This key is valid only when CategoryName is set to DLCAutoRecycle.</p>
         * </li>
         * <li><p>priorityConfig: The priority configuration. This key is valid only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</p>
         * </li>
         * <li><p>quotaMaximumDuration: The maximum runtime configuration for a DLC job within a quota. This key is valid only when CategoryName is set to QuotaMaximumDuration.</p>
         * </li>
         * <li><p>predefinedTags: The predefined tags for the workspace. Created resources must have these tags.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tempStoragePath</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <p>The value of the configuration item.</p>
         * <ul>
         * <li>If ConfigKey is set to predefinedTags, the format of ConfigValue is [{&quot;Type&quot;:&quot;Tag&quot;,&quot;Key&quot;:&quot;Key1&quot;,&quot;Value&quot;:&quot;{\\&quot;Products\\&quot;:\\&quot;DLC,DSW,EAS\\&quot;,\\&quot;Values\\&quot;:\\&quot;value1,value2,value3\\&quot;}&quot;}]. The Products field specifies which products use the predefined tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test/s/</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>A list of tags for the configuration item.</p>
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
