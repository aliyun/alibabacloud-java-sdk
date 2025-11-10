// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>Component configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>Detailed information.</p>
     */
    @NameInMap("release")
    public GetAddonReleaseResponseBodyRelease release;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddonReleaseResponseBody self = new GetAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddonReleaseResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetAddonReleaseResponseBody setRelease(GetAddonReleaseResponseBodyRelease release) {
        this.release = release;
        return this;
    }
    public GetAddonReleaseResponseBodyRelease getRelease() {
        return this.release;
    }

    public GetAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAddonReleaseResponseBodyReleaseConditions extends TeaModel {
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
         * <p>Details.</p>
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
         * <p>True</p>
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

        public static GetAddonReleaseResponseBodyReleaseConditions build(java.util.Map<String, ?> map) throws Exception {
            GetAddonReleaseResponseBodyReleaseConditions self = new GetAddonReleaseResponseBodyReleaseConditions();
            return TeaModel.build(map, self);
        }

        public GetAddonReleaseResponseBodyReleaseConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public GetAddonReleaseResponseBodyReleaseConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public GetAddonReleaseResponseBodyReleaseConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAddonReleaseResponseBodyReleaseConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAddonReleaseResponseBodyReleaseConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAddonReleaseResponseBodyRelease extends TeaModel {
        /**
         * <p>Addon component name.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-gpu</p>
         */
        @NameInMap("addonName")
        public String addonName;

        /**
         * <p>Number of alert rules.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("alertRuleCount")
        public Long alertRuleCount;

        /**
         * <p>Installation phase information.</p>
         */
        @NameInMap("conditions")
        public java.util.List<GetAddonReleaseResponseBodyReleaseConditions> conditions;

        /**
         * <p>Component configuration information.</p>
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
         * <p>2024-11-04T16:10:12+08:00</p>
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
         * <p>Whether there is a configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("haveConfig")
        public Boolean haveConfig;

        /**
         * <p>User ID for connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1707xxxxxxxxxxxx</p>
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
         * <p>Parent AddonRelease ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxxx</p>
         */
        @NameInMap("parentAddonReleaseId")
        public String parentAddonReleaseId;

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxxx</p>
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
         * <p>Release ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7339d808-66f9-4d40-83fa-xxxxxxxxxxx</p>
         */
        @NameInMap("releaseId")
        public String releaseId;

        /**
         * <p>The name of the Release.</p>
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
         * <p>container</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>Component status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-04T16:10:12+08:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>Owner user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1707xxxxxxxxxxxx</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>Component version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.2</p>
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

        public static GetAddonReleaseResponseBodyRelease build(java.util.Map<String, ?> map) throws Exception {
            GetAddonReleaseResponseBodyRelease self = new GetAddonReleaseResponseBodyRelease();
            return TeaModel.build(map, self);
        }

        public GetAddonReleaseResponseBodyRelease setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public GetAddonReleaseResponseBodyRelease setAlertRuleCount(Long alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            return this;
        }
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        public GetAddonReleaseResponseBodyRelease setConditions(java.util.List<GetAddonReleaseResponseBodyReleaseConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetAddonReleaseResponseBodyReleaseConditions> getConditions() {
            return this.conditions;
        }

        public GetAddonReleaseResponseBodyRelease setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetAddonReleaseResponseBodyRelease setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAddonReleaseResponseBodyRelease setDashboardCount(Long dashboardCount) {
            this.dashboardCount = dashboardCount;
            return this;
        }
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        public GetAddonReleaseResponseBodyRelease setEntityRules(EntityGroupBase entityRules) {
            this.entityRules = entityRules;
            return this;
        }
        public EntityGroupBase getEntityRules() {
            return this.entityRules;
        }

        public GetAddonReleaseResponseBodyRelease setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetAddonReleaseResponseBodyRelease setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetAddonReleaseResponseBodyRelease setExporterCount(Long exporterCount) {
            this.exporterCount = exporterCount;
            return this;
        }
        public Long getExporterCount() {
            return this.exporterCount;
        }

        public GetAddonReleaseResponseBodyRelease setHaveConfig(Boolean haveConfig) {
            this.haveConfig = haveConfig;
            return this;
        }
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        public GetAddonReleaseResponseBodyRelease setInstallUserId(String installUserId) {
            this.installUserId = installUserId;
            return this;
        }
        public String getInstallUserId() {
            return this.installUserId;
        }

        public GetAddonReleaseResponseBodyRelease setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetAddonReleaseResponseBodyRelease setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public GetAddonReleaseResponseBodyRelease setParentAddonReleaseId(String parentAddonReleaseId) {
            this.parentAddonReleaseId = parentAddonReleaseId;
            return this;
        }
        public String getParentAddonReleaseId() {
            return this.parentAddonReleaseId;
        }

        public GetAddonReleaseResponseBodyRelease setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetAddonReleaseResponseBodyRelease setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAddonReleaseResponseBodyRelease setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public GetAddonReleaseResponseBodyRelease setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public GetAddonReleaseResponseBodyRelease setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetAddonReleaseResponseBodyRelease setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAddonReleaseResponseBodyRelease setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetAddonReleaseResponseBodyRelease setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAddonReleaseResponseBodyRelease setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAddonReleaseResponseBodyRelease setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
