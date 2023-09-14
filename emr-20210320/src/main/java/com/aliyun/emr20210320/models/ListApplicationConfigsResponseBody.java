// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationConfigsResponseBody extends TeaModel {
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfigs> applicationConfigs;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
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
         * <p>应用名称。</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>配置值生效状态。</p>
         */
        @NameInMap("ConfigEffectState")
        public String configEffectState;

        /**
         * <p>配置文件名称。</p>
         */
        @NameInMap("ConfigFileName")
        public String configFileName;

        /**
         * <p>配置项键。</p>
         */
        @NameInMap("ConfigItemKey")
        public String configItemKey;

        /**
         * <p>配置项值。</p>
         */
        @NameInMap("ConfigItemValue")
        public String configItemValue;

        /**
         * <p>创建时间。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>是否是自定义配置。</p>
         */
        @NameInMap("Custom")
        public Boolean custom;

        /**
         * <p>描述。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>初始值。</p>
         */
        @NameInMap("InitValue")
        public String initValue;

        /**
         * <p>修改人。</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>节点组ID。</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>节点ID。</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>更新时间。</p>
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
