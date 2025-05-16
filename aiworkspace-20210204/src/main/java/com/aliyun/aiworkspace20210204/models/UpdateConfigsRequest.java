// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigsRequest extends TeaModel {
    /**
     * <p>The list of workspace configurations to update or add.</p>
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
         * <p>The tag key.</p>
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
         * <p>The category of the configuration item. Supported categories:</p>
         * <ul>
         * <li>CommonResourceConfig</li>
         * <li>DLCAutoRecycle</li>
         * <li>DLCPriorityConfig</li>
         * <li>DSWPriorityConfig</li>
         * <li>QuotaMaximumDuration</li>
         * <li>CommonTagConfig</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonResourceConfig</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The key of the configuration item. Supported keys:</p>
         * <ul>
         * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>quotaMaximumDuration: Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: The predefined tags of the workspace. All created resources must have tags.</li>
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
         * <li>When ConfigKey is predefinedTags, the ConfigValue follows this format: [{&quot;Type&quot;:&quot;Tag&quot;,&quot;Key&quot;:&quot;Key1&quot;,&quot;Value&quot;:&quot;{&quot;Products&quot;:&quot;DLC,DSW,EAS&quot;,&quot;Values&quot;:&quot;value1,value2,value3&quot;}&quot;}]. &quot;Products&quot; indicates the products that use the predefined tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test/s/</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The tags of the configuration item.</p>
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
