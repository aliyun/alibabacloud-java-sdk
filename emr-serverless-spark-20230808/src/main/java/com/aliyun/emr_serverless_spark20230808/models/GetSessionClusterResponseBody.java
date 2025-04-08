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
     * <p>The session.</p>
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
         * <p>The name of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>spark-defaults.conf</p>
         */
        @NameInMap("configFileName")
        public String configFileName;

        /**
         * <p>The key of the configuration.</p>
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
         * <p>Indicates whether automatic startup is enabled.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Indicates whether automatic termination is enabled.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The idle timeout period. The session is automatically terminated when the idle timeout period is exceeded.</p>
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
         * <p>The status change code.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
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
         * <p>The Spark configurations.</p>
         */
        @NameInMap("applicationConfigs")
        public java.util.List<GetSessionClusterResponseBodySessionClusterApplicationConfigs> applicationConfigs;

        /**
         * <p>Indicates whether automatic startup is enabled.</p>
         */
        @NameInMap("autoStartConfiguration")
        public GetSessionClusterResponseBodySessionClusterAutoStartConfiguration autoStartConfiguration;

        /**
         * <p>Indicates whether automatic termination is enabled.</p>
         */
        @NameInMap("autoStopConfiguration")
        public GetSessionClusterResponseBodySessionClusterAutoStopConfiguration autoStopConfiguration;

        /**
         * <p>The version of the Spark engine.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-2.2(Java Runtime)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <p>The domain name to which the Spark UI of the session belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>your.domain.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-gateway-cn-hangzhou-internal.data.aliyuncs.com</p>
         */
        @NameInMap("domainInner")
        public String domainInner;

        /**
         * <p>The ID of the job that is associated with the session.</p>
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
         * <p>env-cpv569tlhtgndjl86t40</p>
         */
        @NameInMap("envId")
        public String envId;

        /**
         * <p>The additional metadata of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;extraInfoKey&quot;:&quot;extraInfoValue&quot;}</p>
         */
        @NameInMap("extra")
        public String extra;

        /**
         * <p>Indicates whether the Fusion engine is used for acceleration.</p>
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
         * <p>The type of the job. This parameter is required and cannot be modified after the deployment is created. Valid values:</p>
         * <ul>
         * <li>SQLSCRIPT</li>
         * <li>JAR</li>
         * <li>PYTHON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("kind")
        public String kind;

        /**
         * <p>The name of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>jobName</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The version of Serverless Spark.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-2.2(Java Runtime)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The session ID.</p>
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
         * <p>The job status.</p>
         * <ul>
         * <li>Starting</li>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The reason of the job status change.</p>
         */
        @NameInMap("stateChangeReason")
        public GetSessionClusterResponseBodySessionClusterStateChangeReason stateChangeReason;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-231231</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The name of the account that is used to create the session.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("userName")
        public String userName;

        /**
         * <p>The Spark UI of the session.</p>
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
