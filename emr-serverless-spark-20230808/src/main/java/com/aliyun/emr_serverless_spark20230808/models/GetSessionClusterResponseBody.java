// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetSessionClusterResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sessionCluster")
    public GetSessionClusterResponseBodySessionCluster sessionCluster;

    public static GetSessionClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionClusterResponseBody self = new GetSessionClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionClusterResponseBody setSessionCluster(GetSessionClusterResponseBodySessionCluster sessionCluster) {
        this.sessionCluster = sessionCluster;
        return this;
    }
    public GetSessionClusterResponseBodySessionCluster getSessionCluster() {
        return this.sessionCluster;
    }

    public static class GetSessionClusterResponseBodySessionClusterApplicationConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>spark-defaults.conf</p>
         */
        @NameInMap("configFileName")
        public String configFileName;

        /**
         * <strong>example:</strong>
         * <p>spark.app.name</p>
         */
        @NameInMap("configItemKey")
        public String configItemKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("configItemValue")
        public String configItemValue;

        public static GetSessionClusterResponseBodySessionClusterApplicationConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetSessionClusterResponseBodySessionClusterApplicationConfigs self = new GetSessionClusterResponseBodySessionClusterApplicationConfigs();
            return TeaModel.build(map, self);
        }

        public GetSessionClusterResponseBodySessionClusterApplicationConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public GetSessionClusterResponseBodySessionClusterApplicationConfigs setConfigItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }
        public String getConfigItemKey() {
            return this.configItemKey;
        }

        public GetSessionClusterResponseBodySessionClusterApplicationConfigs setConfigItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }
        public String getConfigItemValue() {
            return this.configItemValue;
        }

    }

    public static class GetSessionClusterResponseBodySessionClusterAutoStartConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static GetSessionClusterResponseBodySessionClusterAutoStartConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetSessionClusterResponseBodySessionClusterAutoStartConfiguration self = new GetSessionClusterResponseBodySessionClusterAutoStartConfiguration();
            return TeaModel.build(map, self);
        }

        public GetSessionClusterResponseBodySessionClusterAutoStartConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class GetSessionClusterResponseBodySessionClusterAutoStopConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("idleTimeoutMinutes")
        public Integer idleTimeoutMinutes;

        public static GetSessionClusterResponseBodySessionClusterAutoStopConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetSessionClusterResponseBodySessionClusterAutoStopConfiguration self = new GetSessionClusterResponseBodySessionClusterAutoStopConfiguration();
            return TeaModel.build(map, self);
        }

        public GetSessionClusterResponseBodySessionClusterAutoStopConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetSessionClusterResponseBodySessionClusterAutoStopConfiguration setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }
        public Integer getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

    }

    public static class GetSessionClusterResponseBodySessionClusterStateChangeReason extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        public static GetSessionClusterResponseBodySessionClusterStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            GetSessionClusterResponseBodySessionClusterStateChangeReason self = new GetSessionClusterResponseBodySessionClusterStateChangeReason();
            return TeaModel.build(map, self);
        }

        public GetSessionClusterResponseBodySessionClusterStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSessionClusterResponseBodySessionClusterStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetSessionClusterResponseBodySessionCluster extends TeaModel {
        @NameInMap("applicationConfigs")
        public java.util.List<GetSessionClusterResponseBodySessionClusterApplicationConfigs> applicationConfigs;

        @NameInMap("autoStartConfiguration")
        public GetSessionClusterResponseBodySessionClusterAutoStartConfiguration autoStartConfiguration;

        @NameInMap("autoStopConfiguration")
        public GetSessionClusterResponseBodySessionClusterAutoStopConfiguration autoStopConfiguration;

        /**
         * <strong>example:</strong>
         * <p>esr-2.2(Java Runtime)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <strong>example:</strong>
         * <p>your.domain.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>TSK-xxxxxxxx</p>
         */
        @NameInMap("draftId")
        public String draftId;

        /**
         * <strong>example:</strong>
         * <p>env-cpv569tlhtgndjl86t40</p>
         */
        @NameInMap("envId")
        public String envId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fusion")
        public Boolean fusion;

        /**
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>作业实例名称。</p>
         * 
         * <strong>example:</strong>
         * <p>jobName</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>esr-2.2（Java Runtime）</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>交互式作业会话id。</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-1234567890ab</p>
         */
        @NameInMap("sessionClusterId")
        public String sessionClusterId;

        /**
         * <p>作业状态。</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("stateChangeReason")
        public GetSessionClusterResponseBodySessionClusterStateChangeReason stateChangeReason;

        /**
         * <p>任务实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>jr-231231</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://spark-ui/link">https://spark-ui/link</a></p>
         */
        @NameInMap("webUI")
        public String webUI;

        /**
         * <p>工作空间id。</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetSessionClusterResponseBodySessionCluster build(java.util.Map<String, ?> map) throws Exception {
            GetSessionClusterResponseBodySessionCluster self = new GetSessionClusterResponseBodySessionCluster();
            return TeaModel.build(map, self);
        }

        public GetSessionClusterResponseBodySessionCluster setApplicationConfigs(java.util.List<GetSessionClusterResponseBodySessionClusterApplicationConfigs> applicationConfigs) {
            this.applicationConfigs = applicationConfigs;
            return this;
        }
        public java.util.List<GetSessionClusterResponseBodySessionClusterApplicationConfigs> getApplicationConfigs() {
            return this.applicationConfigs;
        }

        public GetSessionClusterResponseBodySessionCluster setAutoStartConfiguration(GetSessionClusterResponseBodySessionClusterAutoStartConfiguration autoStartConfiguration) {
            this.autoStartConfiguration = autoStartConfiguration;
            return this;
        }
        public GetSessionClusterResponseBodySessionClusterAutoStartConfiguration getAutoStartConfiguration() {
            return this.autoStartConfiguration;
        }

        public GetSessionClusterResponseBodySessionCluster setAutoStopConfiguration(GetSessionClusterResponseBodySessionClusterAutoStopConfiguration autoStopConfiguration) {
            this.autoStopConfiguration = autoStopConfiguration;
            return this;
        }
        public GetSessionClusterResponseBodySessionClusterAutoStopConfiguration getAutoStopConfiguration() {
            return this.autoStopConfiguration;
        }

        public GetSessionClusterResponseBodySessionCluster setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public GetSessionClusterResponseBodySessionCluster setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetSessionClusterResponseBodySessionCluster setDraftId(String draftId) {
            this.draftId = draftId;
            return this;
        }
        public String getDraftId() {
            return this.draftId;
        }

        public GetSessionClusterResponseBodySessionCluster setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetSessionClusterResponseBodySessionCluster setFusion(Boolean fusion) {
            this.fusion = fusion;
            return this;
        }
        public Boolean getFusion() {
            return this.fusion;
        }

        public GetSessionClusterResponseBodySessionCluster setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public GetSessionClusterResponseBodySessionCluster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSessionClusterResponseBodySessionCluster setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetSessionClusterResponseBodySessionCluster setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public GetSessionClusterResponseBodySessionCluster setSessionClusterId(String sessionClusterId) {
            this.sessionClusterId = sessionClusterId;
            return this;
        }
        public String getSessionClusterId() {
            return this.sessionClusterId;
        }

        public GetSessionClusterResponseBodySessionCluster setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetSessionClusterResponseBodySessionCluster setStateChangeReason(GetSessionClusterResponseBodySessionClusterStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public GetSessionClusterResponseBodySessionClusterStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public GetSessionClusterResponseBodySessionCluster setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetSessionClusterResponseBodySessionCluster setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetSessionClusterResponseBodySessionCluster setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
        }

        public GetSessionClusterResponseBodySessionCluster setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
