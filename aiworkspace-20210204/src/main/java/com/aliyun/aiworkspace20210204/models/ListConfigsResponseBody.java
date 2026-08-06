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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A******C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
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
         * <p>The configuration ID, which is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>wc-95******o36ylr</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The key of the configuration item. The following keys are supported:</p>
         * <ul>
         * <li>tempStoragePath: the temporary storage path. This ConfigKey can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: the automatic recycling configuration. This ConfigKey can be used only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>priorityConfig: the priority configuration. This ConfigKey can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
         * <li>quotaMaximumDuration: the maximum runtime duration configuration for DLC jobs in a quota. This ConfigKey can be used only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: the preset tags for the workspace. Resources that are created must include these tags.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tempTableLifecycle</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <p>The configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://***</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The UTC time when the configuration item was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-12T07:59:41.000Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The UTC time when the configuration item was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:44:10.000Z</p>
         */
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

        public ListConfigsResponseBodyConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
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
