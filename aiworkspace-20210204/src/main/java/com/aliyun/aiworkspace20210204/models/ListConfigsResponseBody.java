// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    // 配置列表
    @NameInMap("Configs")
    public java.util.List<ListConfigsResponseBodyConfigs> configs;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回数量
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

    public static class ListConfigsResponseBodyConfigs extends TeaModel {
        // 配置键
        @NameInMap("ConfigKey")
        public String configKey;

        // 配置值
        @NameInMap("ConfigValue")
        public String configValue;

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

    }

}
