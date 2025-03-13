// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAddonReleasesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The result returned.</p>
     */
    @NameInMap("Data")
    public ListAddonReleasesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAddonReleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddonReleasesResponseBody self = new ListAddonReleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddonReleasesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAddonReleasesResponseBody setData(ListAddonReleasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAddonReleasesResponseBodyData getData() {
        return this.data;
    }

    public ListAddonReleasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAddonReleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAddonReleasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAddonReleasesResponseBodyDataReleasesConditions extends TeaModel {
        /**
         * <p>The first transition time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-31T14:32:19Z</p>
         */
        @NameInMap("FirstTransitionTime")
        public String firstTransitionTime;

        /**
         * <p>The last transition time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-31T14:32:19Z</p>
         */
        @NameInMap("LastTransitionTime")
        public String lastTransitionTime;

        /**
         * <p>The detailed information.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the phase.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the phase.</p>
         * 
         * <strong>example:</strong>
         * <p>Loaded</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAddonReleasesResponseBodyDataReleasesConditions build(java.util.Map<String, ?> map) throws Exception {
            ListAddonReleasesResponseBodyDataReleasesConditions self = new ListAddonReleasesResponseBodyDataReleasesConditions();
            return TeaModel.build(map, self);
        }

        public ListAddonReleasesResponseBodyDataReleasesConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public ListAddonReleasesResponseBodyDataReleasesConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public ListAddonReleasesResponseBodyDataReleasesConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAddonReleasesResponseBodyDataReleasesConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListAddonReleasesResponseBodyDataReleasesConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAddonReleasesResponseBodyDataReleasesConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAddonReleasesResponseBodyDataReleases extends TeaModel {
        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("AddonName")
        public String addonName;

        /**
         * <p>The number of alert rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertRuleCount")
        public Long alertRuleCount;

        /**
         * <p>The installation phase.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<ListAddonReleasesResponseBodyDataReleasesConditions> conditions;

        /**
         * <p>The configuration information of the add-on release.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;port&quot;:&quot;9379&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The time when the add-on was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-22T16:56:29+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of dashboards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DashboardCount")
        public Long dashboardCount;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxx</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The number of exporters.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ExporterCount")
        public Long exporterCount;

        /**
         * <p>Indicates whether the configuration is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HaveConfig")
        public Boolean haveConfig;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1268790592387</p>
         */
        @NameInMap("InstallUserId")
        public String installUserId;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>Indicates whether the component is fully managed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Managed")
        public Boolean managed;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.4</p>
         */
        @NameInMap("NextVersion")
        public String nextVersion;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The release ID after installation.</p>
         * 
         * <strong>example:</strong>
         * <p>be29c093-3fd6-4fb6-9430-797030cc183a</p>
         */
        @NameInMap("ReleaseId")
        public String releaseId;

        /**
         * <p>The name of the release.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql-1695372983039</p>
         */
        @NameInMap("ReleaseName")
        public String releaseName;

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the add-on was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-22T16:56:29+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The version of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAddonReleasesResponseBodyDataReleases build(java.util.Map<String, ?> map) throws Exception {
            ListAddonReleasesResponseBodyDataReleases self = new ListAddonReleasesResponseBodyDataReleases();
            return TeaModel.build(map, self);
        }

        public ListAddonReleasesResponseBodyDataReleases setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public ListAddonReleasesResponseBodyDataReleases setAlertRuleCount(Long alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            return this;
        }
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        public ListAddonReleasesResponseBodyDataReleases setConditions(java.util.List<ListAddonReleasesResponseBodyDataReleasesConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<ListAddonReleasesResponseBodyDataReleasesConditions> getConditions() {
            return this.conditions;
        }

        public ListAddonReleasesResponseBodyDataReleases setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListAddonReleasesResponseBodyDataReleases setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAddonReleasesResponseBodyDataReleases setDashboardCount(Long dashboardCount) {
            this.dashboardCount = dashboardCount;
            return this;
        }
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        public ListAddonReleasesResponseBodyDataReleases setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public ListAddonReleasesResponseBodyDataReleases setExporterCount(Long exporterCount) {
            this.exporterCount = exporterCount;
            return this;
        }
        public Long getExporterCount() {
            return this.exporterCount;
        }

        public ListAddonReleasesResponseBodyDataReleases setHaveConfig(Boolean haveConfig) {
            this.haveConfig = haveConfig;
            return this;
        }
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        public ListAddonReleasesResponseBodyDataReleases setInstallUserId(String installUserId) {
            this.installUserId = installUserId;
            return this;
        }
        public String getInstallUserId() {
            return this.installUserId;
        }

        public ListAddonReleasesResponseBodyDataReleases setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListAddonReleasesResponseBodyDataReleases setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public ListAddonReleasesResponseBodyDataReleases setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
        }

        public ListAddonReleasesResponseBodyDataReleases setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAddonReleasesResponseBodyDataReleases setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public ListAddonReleasesResponseBodyDataReleases setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public ListAddonReleasesResponseBodyDataReleases setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListAddonReleasesResponseBodyDataReleases setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAddonReleasesResponseBodyDataReleases setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAddonReleasesResponseBodyDataReleases setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAddonReleasesResponseBodyDataReleases setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAddonReleasesResponseBodyData extends TeaModel {
        /**
         * <p>The queried add-ons.</p>
         */
        @NameInMap("Releases")
        public java.util.List<ListAddonReleasesResponseBodyDataReleases> releases;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListAddonReleasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAddonReleasesResponseBodyData self = new ListAddonReleasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAddonReleasesResponseBodyData setReleases(java.util.List<ListAddonReleasesResponseBodyDataReleases> releases) {
            this.releases = releases;
            return this;
        }
        public java.util.List<ListAddonReleasesResponseBodyDataReleases> getReleases() {
            return this.releases;
        }

        public ListAddonReleasesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
