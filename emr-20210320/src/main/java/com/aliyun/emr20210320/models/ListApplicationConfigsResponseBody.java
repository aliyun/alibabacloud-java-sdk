// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationConfigsResponseBody extends TeaModel {
    /**
     * <p>The application configurations.</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfigs> applicationConfigs;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the next page returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationConfigsResponseBody self = new ListApplicationConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationConfigsResponseBody setApplicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfigs> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public ListApplicationConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ApplicationConfigs extends TeaModel {
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The status of the configuration value.</p>
         */
        @NameInMap("ConfigEffectState")
        public String configEffectState;

        /**
         * <p>The name of the configuration file.</p>
         */
        @NameInMap("ConfigFileName")
        public String configFileName;

        /**
         * <p>The key of the configuration item.</p>
         */
        @NameInMap("ConfigItemKey")
        public String configItemKey;

        /**
         * <p>The value of the configuration item.</p>
         */
        @NameInMap("ConfigItemValue")
        public String configItemValue;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the configurations are custom.</p>
         */
        @NameInMap("Custom")
        public Boolean custom;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The initial value.</p>
         */
        @NameInMap("InitValue")
        public String initValue;

        /**
         * <p>The person who modified the configurations.</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The node group ID.</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The node ID.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ApplicationConfigs build(java.util.Map<String, ?> map) throws Exception {
            ApplicationConfigs self = new ApplicationConfigs();
            return TeaModel.build(map, self);
        }

        public ApplicationConfigs setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ApplicationConfigs setConfigEffectState(String configEffectState) {
            this.configEffectState = configEffectState;
            return this;
        }
        public String getConfigEffectState() {
            return this.configEffectState;
        }

        public ApplicationConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ApplicationConfigs setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ApplicationConfigs setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

        public ApplicationConfigs setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ApplicationConfigs setCustom(Boolean custom) {
            this.custom = custom;
            return this;
        }
        public Boolean getCustom() {
            return this.custom;
        }

        public ApplicationConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ApplicationConfigs setInitValue(String initValue) {
            this.initValue = initValue;
            return this;
        }
        public String getInitValue() {
            return this.initValue;
        }

        public ApplicationConfigs setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ApplicationConfigs setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ApplicationConfigs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ApplicationConfigs setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
