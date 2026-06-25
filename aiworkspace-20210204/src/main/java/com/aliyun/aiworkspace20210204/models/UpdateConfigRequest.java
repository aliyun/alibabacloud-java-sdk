// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    /**
     * <p>The classification of the configuration item. The following classifications are supported:</p>
     * <ul>
     * <li><p>CommonResourceConfig: The common resource configuration.</p>
     * </li>
     * <li><p>DLCAutoRecycle: The DLC auto-recycle configuration.</p>
     * </li>
     * <li><p>DLCPriorityConfig: The DLC priority settings.</p>
     * </li>
     * <li><p>DSWPriorityConfig: The DSW priority settings.</p>
     * </li>
     * <li><p>QuotaMaximumDuration: The maximum runtime of a DLC task for a quota.</p>
     * </li>
     * <li><p>CommonTagConfig: The tag settings.</p>
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
     * <li><p>isAutoRecycle: The auto-recycle configuration. This key is valid only when CategoryName is set to DLCAutoRecycle.</p>
     * </li>
     * <li><p>priorityConfig: The priority configuration. This key is valid only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</p>
     * </li>
     * <li><p>quotaMaximumDuration: The maximum runtime of a DLC task for a quota. This key is valid only when CategoryName is set to QuotaMaximumDuration.</p>
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
     * 
     * <strong>example:</strong>
     * <p>oss://***</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The list of labels for the configuration item.</p>
     */
    @NameInMap("Labels")
    public java.util.List<UpdateConfigRequestLabels> labels;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public UpdateConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public UpdateConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public UpdateConfigRequest setLabels(java.util.List<UpdateConfigRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<UpdateConfigRequestLabels> getLabels() {
        return this.labels;
    }

    public static class UpdateConfigRequestLabels extends TeaModel {
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

        public static UpdateConfigRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigRequestLabels self = new UpdateConfigRequestLabels();
            return TeaModel.build(map, self);
        }

        public UpdateConfigRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateConfigRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
