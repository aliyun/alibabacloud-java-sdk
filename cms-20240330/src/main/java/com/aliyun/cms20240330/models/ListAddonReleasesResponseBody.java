// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAddonReleasesResponseBody extends TeaModel {
    /**
     * <p>Set of add-on component information.</p>
     */
    @NameInMap("releases")
    public java.util.List<ListAddonReleasesResponseBodyReleases> releases;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Number of components.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAddonReleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddonReleasesResponseBody self = new ListAddonReleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddonReleasesResponseBody setReleases(java.util.List<ListAddonReleasesResponseBodyReleases> releases) {
        this.releases = releases;
        return this;
    }
    public java.util.List<ListAddonReleasesResponseBodyReleases> getReleases() {
        return this.releases;
    }

    public ListAddonReleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAddonReleasesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAddonReleasesResponseBodyReleasesConditions extends TeaModel {
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

        public static ListAddonReleasesResponseBodyReleasesConditions build(java.util.Map<String, ?> map) throws Exception {
            ListAddonReleasesResponseBodyReleasesConditions self = new ListAddonReleasesResponseBodyReleasesConditions();
            return TeaModel.build(map, self);
        }

        public ListAddonReleasesResponseBodyReleasesConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public ListAddonReleasesResponseBodyReleasesConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public ListAddonReleasesResponseBodyReleasesConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAddonReleasesResponseBodyReleasesConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAddonReleasesResponseBodyReleasesConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAddonReleasesResponseBodyReleasesSubAddonRelease extends TeaModel {
        /**
         * <p>Number of ready sub-Releases.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ready")
        public Integer ready;

        /**
         * <p>Number of sub-Releases.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListAddonReleasesResponseBodyReleasesSubAddonRelease build(java.util.Map<String, ?> map) throws Exception {
            ListAddonReleasesResponseBodyReleasesSubAddonRelease self = new ListAddonReleasesResponseBodyReleasesSubAddonRelease();
            return TeaModel.build(map, self);
        }

        public ListAddonReleasesResponseBodyReleasesSubAddonRelease setReady(Integer ready) {
            this.ready = ready;
            return this;
        }
        public Integer getReady() {
            return this.ready;
        }

        public ListAddonReleasesResponseBodyReleasesSubAddonRelease setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListAddonReleasesResponseBodyReleases extends TeaModel {
        /**
         * <p>Addon name.</p>
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
         * <p>API version.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>Installation phase information.</p>
         */
        @NameInMap("conditions")
        public java.util.List<ListAddonReleasesResponseBodyReleasesConditions> conditions;

        /**
         * <p>Component configuration information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;install&quot;:{&quot;mode&quot;:&quot;auto-install&quot;,&quot;listenPort&quot;:&quot;9400&quot;},&quot;discoverMode&quot;:&quot;instances&quot;,&quot;discover&quot;:{&quot;instances&quot;:&quot;worker-k8s-for-cs-c126d87c76218487e83ab322017f11b44&quot;},&quot;scrapeInterval&quot;:&quot;15&quot;,&quot;enableSecuritecs-nodeyGroupInjection&quot;:&quot;true&quot;,&quot;metricTags&quot;:&quot;&quot;}</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <p>Access time.</p>
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
         * <p>policy-xxxxxxxxxxxx</p>
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
         * <p>Access user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>175xxxxxxxxx</p>
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
         * <p>Starting version number for the remaining list.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("nextVersion")
        public String nextVersion;

        /**
         * <p>Parent AddonReleaseId.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxxxx</p>
         */
        @NameInMap("parentAddonReleaseId")
        public String parentAddonReleaseId;

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxxxxxxxxxxxxx</p>
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
         * <p>Release name.</p>
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
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Sub-AddonRelease statistics.</p>
         */
        @NameInMap("subAddonRelease")
        public ListAddonReleasesResponseBodyReleasesSubAddonRelease subAddonRelease;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-04T16:10:23+08:00</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>Owner user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>175xxxxxxxxxxxxx</p>
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

        public static ListAddonReleasesResponseBodyReleases build(java.util.Map<String, ?> map) throws Exception {
            ListAddonReleasesResponseBodyReleases self = new ListAddonReleasesResponseBodyReleases();
            return TeaModel.build(map, self);
        }

        public ListAddonReleasesResponseBodyReleases setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListAddonReleasesResponseBodyReleases setAlertRuleCount(Long alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            return this;
        }
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        public ListAddonReleasesResponseBodyReleases setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListAddonReleasesResponseBodyReleases setConditions(java.util.List<ListAddonReleasesResponseBodyReleasesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListAddonReleasesResponseBodyReleasesConditions> getConditions() {
            return this.conditions;
        }

        public ListAddonReleasesResponseBodyReleases setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListAddonReleasesResponseBodyReleases setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAddonReleasesResponseBodyReleases setDashboardCount(Long dashboardCount) {
            this.dashboardCount = dashboardCount;
            return this;
        }
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        public ListAddonReleasesResponseBodyReleases setEntityRules(EntityGroupBase entityRules) {
            this.entityRules = entityRules;
            return this;
        }
        public EntityGroupBase getEntityRules() {
            return this.entityRules;
        }

        public ListAddonReleasesResponseBodyReleases setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListAddonReleasesResponseBodyReleases setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListAddonReleasesResponseBodyReleases setExporterCount(Long exporterCount) {
            this.exporterCount = exporterCount;
            return this;
        }
        public Long getExporterCount() {
            return this.exporterCount;
        }

        public ListAddonReleasesResponseBodyReleases setHaveConfig(Boolean haveConfig) {
            this.haveConfig = haveConfig;
            return this;
        }
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        public ListAddonReleasesResponseBodyReleases setInstallUserId(String installUserId) {
            this.installUserId = installUserId;
            return this;
        }
        public String getInstallUserId() {
            return this.installUserId;
        }

        public ListAddonReleasesResponseBodyReleases setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAddonReleasesResponseBodyReleases setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public ListAddonReleasesResponseBodyReleases setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
        }

        public ListAddonReleasesResponseBodyReleases setParentAddonReleaseId(String parentAddonReleaseId) {
            this.parentAddonReleaseId = parentAddonReleaseId;
            return this;
        }
        public String getParentAddonReleaseId() {
            return this.parentAddonReleaseId;
        }

        public ListAddonReleasesResponseBodyReleases setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListAddonReleasesResponseBodyReleases setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAddonReleasesResponseBodyReleases setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public ListAddonReleasesResponseBodyReleases setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public ListAddonReleasesResponseBodyReleases setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListAddonReleasesResponseBodyReleases setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAddonReleasesResponseBodyReleases setSubAddonRelease(ListAddonReleasesResponseBodyReleasesSubAddonRelease subAddonRelease) {
            this.subAddonRelease = subAddonRelease;
            return this;
        }
        public ListAddonReleasesResponseBodyReleasesSubAddonRelease getSubAddonRelease() {
            return this.subAddonRelease;
        }

        public ListAddonReleasesResponseBodyReleases setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAddonReleasesResponseBodyReleases setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAddonReleasesResponseBodyReleases setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListAddonReleasesResponseBodyReleases setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
