// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ListConfigsResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A******C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>tempTableLifecycle</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <strong>example:</strong>
         * <p>oss://***</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

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

        public ListConfigsResponseBodyConfigs setLabels(java.util.List<ListConfigsResponseBodyConfigsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListConfigsResponseBodyConfigsLabels> getLabels() {
            return this.labels;
        }

    }

}
