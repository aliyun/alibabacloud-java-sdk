// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetSessionClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The session object.</p>
     */
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
         * <p>The configuration file name.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-defaults.conf</p>
         */
        @NameInMap("configFileName")
        public String configFileName;

        /**
         * <p>The configuration key.</p>
         * 
         * <strong>example:</strong>
         * <p>spark.app.name</p>
         */
        @NameInMap("configItemKey")
        public String configItemKey;

        /**
         * <p>The configuration value.</p>
         * 
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
         * <p>Specifies whether auto-start is enabled. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
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
         * <p>Specifies whether auto-stop is allowed. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The idle timeout in minutes after which the session is automatically stopped.</p>
         * 
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
         * <p>The code for the state change.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The message for the state change.</p>
         * 
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
        /**
         * <p>The list of Spark application configurations.</p>
         */
        @NameInMap("applicationConfigs")
        public java.util.List<GetSessionClusterResponseBodySessionClusterApplicationConfigs> applicationConfigs;

        /**
         * <p>The auto-start configuration.</p>
         */
        @NameInMap("autoStartConfiguration")
        public GetSessionClusterResponseBodySessionClusterAutoStartConfiguration autoStartConfiguration;

        /**
         * <p>The auto-stop configuration.</p>
         */
        @NameInMap("autoStopConfiguration")
        public GetSessionClusterResponseBodySessionClusterAutoStopConfiguration autoStopConfiguration;

        /**
         * <p>The token used to connect to the session cluster.</p>
         */
        @NameInMap("connectionToken")
        public String connectionToken;

        /**
         * <p>The version actually displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <p>The domain to which the session Spark UI belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>your.domain.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The internal domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-gateway-cn-hangzhou-internal.data.aliyuncs.com</p>
         */
        @NameInMap("domainInner")
        public String domainInner;

        /**
         * <p>The ID of the development job bound to the session.</p>
         * 
         * <strong>example:</strong>
         * <p>TSK-xxxxxxxx</p>
         */
        @NameInMap("draftId")
        public String draftId;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cpv569tlhtgndjl8****</p>
         */
        @NameInMap("envId")
        public String envId;

        /**
         * <p>The extra metadata of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;extraInfoKey&quot;:&quot;extraInfoValue&quot;}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>Specifies whether Fusion engine acceleration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fusion")
        public Boolean fusion;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-01 06:23:01</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The effective job type. This parameter is required and cannot be modified after creation. Valid values:</p>
         * <ul>
         * <li>SQLSCRIPT: SQL job.</li>
         * <li>JAR: JAR job.</li>
         * <li>PYTHON: Python job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The session name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Specifies whether the public network access endpoint is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicEndpointEnabled")
        public Boolean publicEndpointEnabled;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The Serverless Spark version.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The interactive job session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-1234567890ab</p>
         */
        @NameInMap("sessionClusterId")
        public String sessionClusterId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-01 06:23:01</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Starting: The job is starting.</li>
         * <li>Running: The job is running.</li>
         * <li>Stopping: The job is stopping.</li>
         * <li>Stopped: The job is stopped.</li>
         * <li>Error: The job has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The reason for the state change.</p>
         */
        @NameInMap("stateChangeReason")
        public GetSessionClusterResponseBodySessionClusterStateChangeReason stateChangeReason;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxxxxx</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The name of the session creator.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <p>The URL of the session Spark UI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://spark-ui/link">https://spark-ui/link</a></p>
         */
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

        public GetSessionClusterResponseBodySessionCluster setConnectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        public String getConnectionToken() {
            return this.connectionToken;
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

        public GetSessionClusterResponseBodySessionCluster setDomainInner(String domainInner) {
            this.domainInner = domainInner;
            return this;
        }
        public String getDomainInner() {
            return this.domainInner;
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

        public GetSessionClusterResponseBodySessionCluster setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetSessionClusterResponseBodySessionCluster setFusion(Boolean fusion) {
            this.fusion = fusion;
            return this;
        }
        public Boolean getFusion() {
            return this.fusion;
        }

        public GetSessionClusterResponseBodySessionCluster setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
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

        public GetSessionClusterResponseBodySessionCluster setPublicEndpointEnabled(Boolean publicEndpointEnabled) {
            this.publicEndpointEnabled = publicEndpointEnabled;
            return this;
        }
        public Boolean getPublicEndpointEnabled() {
            return this.publicEndpointEnabled;
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

        public GetSessionClusterResponseBodySessionCluster setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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
