// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSessionClustersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The SQL Computes.</p>
     */
    @NameInMap("sessionClusters")
    public java.util.List<ListSessionClustersResponseBodySessionClusters> sessionClusters;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
        /**
         * <p>The name of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-default.conf</p>
         */
        @NameInMap("configFileName")
        public String configFileName;

        /**
         * <p>The key of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.app.name</p>
         */
        @NameInMap("configItemKey")
        public String configItemKey;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>test_application</p>
         */
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
        /**
         * <p>Indicates whether automatic startup is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Indicates whether automatic termination is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The idle timeout period. The SQL Compute is automatically terminated if the idle timeout period is exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
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
        /**
         * <p>The status change code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The status change message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
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
        /**
         * <p>The SQL Compute configurations, which are equivalent to the configurations of the Spark job.</p>
         */
        @NameInMap("applicationConfigs")
        public java.util.List<ListSessionClustersResponseBodySessionClustersApplicationConfigs> applicationConfigs;

        /**
         * <p>The automatic startup configurations.</p>
         */
        @NameInMap("autoStartConfiguration")
        public ListSessionClustersResponseBodySessionClustersAutoStartConfiguration autoStartConfiguration;

        /**
         * <p>The automatic termination configurations.</p>
         */
        @NameInMap("autoStopConfiguration")
        public ListSessionClustersResponseBodySessionClustersAutoStopConfiguration autoStopConfiguration;

        @NameInMap("domain")
        public String domain;

        @NameInMap("draftId")
        public String draftId;

        @NameInMap("kind")
        public String kind;

        /**
         * <p>The name of the SQL Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>adhoc_query</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The name of the queue on which the SQL Compute runs.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The SQL Compute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-123131</p>
         */
        @NameInMap("sessionClusterId")
        public String sessionClusterId;

        /**
         * <p>The status of the SQL Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The details of the last status change of the SQL Compute.</p>
         */
        @NameInMap("stateChangeReason")
        public ListSessionClustersResponseBodySessionClustersStateChangeReason stateChangeReason;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123131</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("userName")
        public String userName;

        @NameInMap("webUI")
        public String webUI;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
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

        public ListSessionClustersResponseBodySessionClusters setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListSessionClustersResponseBodySessionClusters setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public ListSessionClustersResponseBodySessionClusters setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
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

        public ListSessionClustersResponseBodySessionClusters setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
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

        public ListSessionClustersResponseBodySessionClusters setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
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
