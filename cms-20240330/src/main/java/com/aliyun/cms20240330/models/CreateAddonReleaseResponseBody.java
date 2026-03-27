// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>Accessed component information.</p>
     */
    @NameInMap("release")
    public CreateAddonReleaseResponseBodyRelease release;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAddonReleaseResponseBody self = new CreateAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAddonReleaseResponseBody setRelease(CreateAddonReleaseResponseBodyRelease release) {
        this.release = release;
        return this;
    }
    public CreateAddonReleaseResponseBodyRelease getRelease() {
        return this.release;
    }

    public CreateAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAddonReleaseResponseBodyReleaseConditions extends TeaModel {
        /**
         * <p>First transition time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-04T16:10:22+08:00</p>
         */
        @NameInMap("firstTransitionTime")
        public String firstTransitionTime;

        /**
         * <p>Last transition time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-04T16:10:22+08:00</p>
         */
        @NameInMap("lastTransitionTime")
        public String lastTransitionTime;

        /**
         * <p>Detailed information.</p>
         * 
         * <strong>example:</strong>
         * <p>The addon loaded successfully</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Phase status.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;phase\&quot;: \&quot;Created\&quot;, \&quot;executionDetails\&quot;: [], \&quot;invocations\&quot;: [], \&quot;latestExecError\&quot;: {\&quot;message\&quot;: \&quot;\&quot;, \&quot;code\&quot;: \&quot;\&quot;, \&quot;requestId\&quot;: \&quot;\&quot;, \&quot;extraInfo\&quot;: \&quot;\&quot;, \&quot;title\&quot;: \&quot;\&quot;}}</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Phase type.</p>
         * 
         * <strong>example:</strong>
         * <p>Loaded</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAddonReleaseResponseBodyReleaseConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateAddonReleaseResponseBodyReleaseConditions self = new CreateAddonReleaseResponseBodyReleaseConditions();
            return TeaModel.build(map, self);
        }

        public CreateAddonReleaseResponseBodyReleaseConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public CreateAddonReleaseResponseBodyReleaseConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public CreateAddonReleaseResponseBodyReleaseConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateAddonReleaseResponseBodyReleaseConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAddonReleaseResponseBodyReleaseConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateAddonReleaseResponseBodyRelease extends TeaModel {
        /**
         * <p>The Addon name of the component being monitored.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-gpu</p>
         */
        @NameInMap("addonName")
        public String addonName;

        /**
         * <p>Number of alert groups.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("alertRuleCount")
        public Long alertRuleCount;

        /**
         * <p>Component installation phase information.</p>
         */
        @NameInMap("conditions")
        public java.util.List<CreateAddonReleaseResponseBodyReleaseConditions> conditions;

        /**
         * <p>Component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>Connection time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-05T15:21:30+08:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Number of dashboards.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("dashboardCount")
        public Long dashboardCount;

        /**
         * <p>Entity details.</p>
         */
        @NameInMap("entityRules")
        public EntityGroupBase entityRules;

        /**
         * <p>Environment type.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("envType")
        public String envType;

        /**
         * <p>Environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxx</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        /**
         * <p>Number of plugins.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("exporterCount")
        public Long exporterCount;

        /**
         * <p>Whether it has configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("haveConfig")
        public Boolean haveConfig;

        /**
         * <p>ID of the user who installed it.</p>
         * 
         * <strong>example:</strong>
         * <p>1654218965xxxxxx</p>
         */
        @NameInMap("installUserId")
        public String installUserId;

        /**
         * <p>Language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <p>Whether it is a managed component.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("managed")
        public Boolean managed;

        /**
         * <p>Parent AddonReleaseId.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxx</p>
         */
        @NameInMap("parentAddonReleaseId")
        public String parentAddonReleaseId;

        /**
         * <p>Policy environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxx</p>
         */
        @NameInMap("policyId")
        public String policyId;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>ReleaseID after installation.</p>
         * 
         * <strong>example:</strong>
         * <p>2e898e60-5e6a-46d1-a994-xxxxxxxxxx</p>
         */
        @NameInMap("releaseId")
        public String releaseId;

        /**
         * <p>Name of the Release.</p>
         * 
         * <strong>example:</strong>
         * <p>test-gpu-integration-name</p>
         */
        @NameInMap("releaseName")
        public String releaseName;

        /**
         * <p>Component scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>Component status.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-13T02:21:02Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>ID of the owner user.</p>
         * 
         * <strong>example:</strong>
         * <p>165421896xxxxxx</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>Component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static CreateAddonReleaseResponseBodyRelease build(java.util.Map<String, ?> map) throws Exception {
            CreateAddonReleaseResponseBodyRelease self = new CreateAddonReleaseResponseBodyRelease();
            return TeaModel.build(map, self);
        }

        public CreateAddonReleaseResponseBodyRelease setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public CreateAddonReleaseResponseBodyRelease setAlertRuleCount(Long alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            return this;
        }
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        public CreateAddonReleaseResponseBodyRelease setConditions(java.util.List<CreateAddonReleaseResponseBodyReleaseConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<CreateAddonReleaseResponseBodyReleaseConditions> getConditions() {
            return this.conditions;
        }

        public CreateAddonReleaseResponseBodyRelease setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateAddonReleaseResponseBodyRelease setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAddonReleaseResponseBodyRelease setDashboardCount(Long dashboardCount) {
            this.dashboardCount = dashboardCount;
            return this;
        }
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        public CreateAddonReleaseResponseBodyRelease setEntityRules(EntityGroupBase entityRules) {
            this.entityRules = entityRules;
            return this;
        }
        public EntityGroupBase getEntityRules() {
            return this.entityRules;
        }

        public CreateAddonReleaseResponseBodyRelease setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public CreateAddonReleaseResponseBodyRelease setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public CreateAddonReleaseResponseBodyRelease setExporterCount(Long exporterCount) {
            this.exporterCount = exporterCount;
            return this;
        }
        public Long getExporterCount() {
            return this.exporterCount;
        }

        public CreateAddonReleaseResponseBodyRelease setHaveConfig(Boolean haveConfig) {
            this.haveConfig = haveConfig;
            return this;
        }
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        public CreateAddonReleaseResponseBodyRelease setInstallUserId(String installUserId) {
            this.installUserId = installUserId;
            return this;
        }
        public String getInstallUserId() {
            return this.installUserId;
        }

        public CreateAddonReleaseResponseBodyRelease setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateAddonReleaseResponseBodyRelease setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public CreateAddonReleaseResponseBodyRelease setParentAddonReleaseId(String parentAddonReleaseId) {
            this.parentAddonReleaseId = parentAddonReleaseId;
            return this;
        }
        public String getParentAddonReleaseId() {
            return this.parentAddonReleaseId;
        }

        public CreateAddonReleaseResponseBodyRelease setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public CreateAddonReleaseResponseBodyRelease setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAddonReleaseResponseBodyRelease setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public CreateAddonReleaseResponseBodyRelease setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public CreateAddonReleaseResponseBodyRelease setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public CreateAddonReleaseResponseBodyRelease setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAddonReleaseResponseBodyRelease setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateAddonReleaseResponseBodyRelease setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateAddonReleaseResponseBodyRelease setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateAddonReleaseResponseBodyRelease setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
