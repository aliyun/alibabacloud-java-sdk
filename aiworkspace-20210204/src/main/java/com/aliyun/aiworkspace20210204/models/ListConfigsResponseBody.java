// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    /**
     * <p>The list of configuration items.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListConfigsResponseBodyConfigs> configs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A******C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponseBody self = new ListConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponseBody setConfigs(java.util.List<ListConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListConfigsResponseBodyConfigsLabels extends TeaModel {
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

        public static ListConfigsResponseBodyConfigsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListConfigsResponseBodyConfigsLabels self = new ListConfigsResponseBodyConfigsLabels();
            return TeaModel.build(map, self);
        }

        public ListConfigsResponseBodyConfigsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConfigsResponseBodyConfigsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The key of the configuration item. The following keys are supported:</p>
         * <ul>
         * <li><p>tempStoragePath: The path for temporary storage. This key is valid only when CategoryName is set to CommonResourceConfig.</p>
         * </li>
         * <li><p>isAutoRecycle: The automatic recycling configuration. This key is valid only when CategoryName is set to DLCAutoRecycle.</p>
         * </li>
         * <li><p>priorityConfig: The priority configuration. This key is valid only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</p>
         * </li>
         * <li><p>quotaMaximumDuration: The configuration for the maximum runtime of a DLC task in a quota. This key is valid only when CategoryName is set to QuotaMaximumDuration.</p>
         * </li>
         * <li><p>predefinedTags: The predefined labels for the workspace. Resources that you create must have these labels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tempTableLifecycle</p>
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

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The list of labels for the configuration item.</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListConfigsResponseBodyConfigsLabels> labels;

        public static ListConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListConfigsResponseBodyConfigs self = new ListConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListConfigsResponseBodyConfigs setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListConfigsResponseBodyConfigs setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListConfigsResponseBodyConfigs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListConfigsResponseBodyConfigs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListConfigsResponseBodyConfigs setLabels(java.util.List<ListConfigsResponseBodyConfigsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListConfigsResponseBodyConfigsLabels> getLabels() {
            return this.labels;
        }

    }

}
