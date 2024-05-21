// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSessionClustersResponseBody extends TeaModel {
    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sessionClusters")
    public java.util.List<ListSessionClustersResponseBodySessionClusters> sessionClusters;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListSessionClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSessionClustersResponseBody self = new ListSessionClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSessionClustersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSessionClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSessionClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSessionClustersResponseBody setSessionClusters(java.util.List<ListSessionClustersResponseBodySessionClusters> sessionClusters) {
        this.sessionClusters = sessionClusters;
        return this;
    }
    public java.util.List<ListSessionClustersResponseBodySessionClusters> getSessionClusters() {
        return this.sessionClusters;
    }

    public ListSessionClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSessionClustersResponseBodySessionClustersApplicationConfigs extends TeaModel {
        @NameInMap("configFileName")
        public String configFileName;

        @NameInMap("configItemKey")
        public String configItemKey;

        @NameInMap("configItemValue")
        public String configItemValue;

        public static ListSessionClustersResponseBodySessionClustersApplicationConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListSessionClustersResponseBodySessionClustersApplicationConfigs self = new ListSessionClustersResponseBodySessionClustersApplicationConfigs();
            return TeaModel.build(map, self);
        }

        public ListSessionClustersResponseBodySessionClustersApplicationConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ListSessionClustersResponseBodySessionClustersApplicationConfigs setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public ListSessionClustersResponseBodySessionClustersApplicationConfigs setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class ListSessionClustersResponseBodySessionClustersAutoStartConfiguration extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        public static ListSessionClustersResponseBodySessionClustersAutoStartConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListSessionClustersResponseBodySessionClustersAutoStartConfiguration self = new ListSessionClustersResponseBodySessionClustersAutoStartConfiguration();
            return TeaModel.build(map, self);
        }

        public ListSessionClustersResponseBodySessionClustersAutoStartConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class ListSessionClustersResponseBodySessionClustersAutoStopConfiguration extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("idleTimeoutMinutes")
        public Integer idleTimeoutMinutes;

        public static ListSessionClustersResponseBodySessionClustersAutoStopConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListSessionClustersResponseBodySessionClustersAutoStopConfiguration self = new ListSessionClustersResponseBodySessionClustersAutoStopConfiguration();
            return TeaModel.build(map, self);
        }

        public ListSessionClustersResponseBodySessionClustersAutoStopConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSessionClustersResponseBodySessionClustersAutoStopConfiguration setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Integer getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

    }

    public static class ListSessionClustersResponseBodySessionClustersStateChangeReason extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static ListSessionClustersResponseBodySessionClustersStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            ListSessionClustersResponseBodySessionClustersStateChangeReason self = new ListSessionClustersResponseBodySessionClustersStateChangeReason();
            return TeaModel.build(map, self);
        }

        public ListSessionClustersResponseBodySessionClustersStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListSessionClustersResponseBodySessionClustersStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListSessionClustersResponseBodySessionClusters extends TeaModel {
        @NameInMap("applicationConfigs")
        public java.util.List<ListSessionClustersResponseBodySessionClustersApplicationConfigs> applicationConfigs;

        @NameInMap("autoStartConfiguration")
        public ListSessionClustersResponseBodySessionClustersAutoStartConfiguration autoStartConfiguration;

        @NameInMap("autoStopConfiguration")
        public ListSessionClustersResponseBodySessionClustersAutoStopConfiguration autoStopConfiguration;

        @NameInMap("name")
        public String name;

        /**
         * <p>作业实例名称。</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>SQL Compute id</p>
         */
        @NameInMap("sessionClusterId")
        public String sessionClusterId;

        /**
         * <p>作业状态。</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("stateChangeReason")
        public ListSessionClustersResponseBodySessionClustersStateChangeReason stateChangeReason;

        /**
         * <p>任务实例ID。</p>
         */
        @NameInMap("userId")
        public String userId;

        @NameInMap("userName")
        public String userName;

        /**
         * <p>工作空间id。</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListSessionClustersResponseBodySessionClusters build(java.util.Map<String, ?> map) throws Exception {
            ListSessionClustersResponseBodySessionClusters self = new ListSessionClustersResponseBodySessionClusters();
            return TeaModel.build(map, self);
        }

        public ListSessionClustersResponseBodySessionClusters setApplicationConfigs(java.util.List<ListSessionClustersResponseBodySessionClustersApplicationConfigs> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }
        public java.util.List<ListSessionClustersResponseBodySessionClustersApplicationConfigs> getApplicationConfigs() {
            return this.applicationConfigs;
        }

        public ListSessionClustersResponseBodySessionClusters setAutoStartConfiguration(ListSessionClustersResponseBodySessionClustersAutoStartConfiguration autoStartConfiguration) {
            this.autoStartConfiguration = autoStartConfiguration;
            return this;
        }
        public ListSessionClustersResponseBodySessionClustersAutoStartConfiguration getAutoStartConfiguration() {
            return this.autoStartConfiguration;
        }

        public ListSessionClustersResponseBodySessionClusters setAutoStopConfiguration(ListSessionClustersResponseBodySessionClustersAutoStopConfiguration autoStopConfiguration) {
            this.autoStopConfiguration = autoStopConfiguration;
            return this;
        }
        public ListSessionClustersResponseBodySessionClustersAutoStopConfiguration getAutoStopConfiguration() {
            return this.autoStopConfiguration;
        }

        public ListSessionClustersResponseBodySessionClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSessionClustersResponseBodySessionClusters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListSessionClustersResponseBodySessionClusters setSessionClusterId(String sessionClusterId) {
            this.sessionClusterId = sessionClusterId;
            return this;
        }
        public String getSessionClusterId() {
            return this.sessionClusterId;
        }

        public ListSessionClustersResponseBodySessionClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListSessionClustersResponseBodySessionClusters setStateChangeReason(ListSessionClustersResponseBodySessionClustersStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public ListSessionClustersResponseBodySessionClustersStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public ListSessionClustersResponseBodySessionClusters setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListSessionClustersResponseBodySessionClusters setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListSessionClustersResponseBodySessionClusters setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
