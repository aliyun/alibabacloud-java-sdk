// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    /**
     * <p>The configuration items.</p>
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
     * <p>The number of items returned.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>The key of the configuration item. Supported keys:</p>
         * <ul>
         * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
         * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
         * <li>quotaMaximumDuration: Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
         * <li>predefinedTags: The predefined tags of the workspace. All created resources must have tags</li>
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
         * <p>The tags of the configuration item.</p>
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
