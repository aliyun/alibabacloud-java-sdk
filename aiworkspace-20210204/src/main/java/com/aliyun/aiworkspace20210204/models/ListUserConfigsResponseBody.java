// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListUserConfigsResponseBody extends TeaModel {
    /**
     * <p>The configurations list.</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListUserConfigsResponseBodyConfigs> configs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sdjksdk-******-dsfds</p>
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

    public static ListUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserConfigsResponseBody self = new ListUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserConfigsResponseBody setConfigs(java.util.List<ListUserConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListUserConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The category. Currently, only DataPrivacyConfig is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DataPrivacyConfig</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The key of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>customizePAIAssumedRole</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <p>The scope. Currently, subUser and owner are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>subUser</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static ListUserConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListUserConfigsResponseBodyConfigs self = new ListUserConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListUserConfigsResponseBodyConfigs setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListUserConfigsResponseBodyConfigs setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ListUserConfigsResponseBodyConfigs setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ListUserConfigsResponseBodyConfigs setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
