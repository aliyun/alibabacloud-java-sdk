// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallAddonResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public InstallAddonResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InstallAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAddonResponseBody self = new InstallAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAddonResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InstallAddonResponseBody setData(InstallAddonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstallAddonResponseBodyData getData() {
        return this.data;
    }

    public InstallAddonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallAddonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InstallAddonResponseBodyDataConditions extends TeaModel {
        /**
         * <p>First transition time.</p>
         */
        @NameInMap("FirstTransitionTime")
        public String firstTransitionTime;

        /**
         * <p>Last transition time.</p>
         */
        @NameInMap("LastTransitionTime")
        public String lastTransitionTime;

        /**
         * <p>Details.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Reason of failure.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Condition status.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Condition type.</p>
         */
        @NameInMap("Type")
        public String type;

        public static InstallAddonResponseBodyDataConditions build(java.util.Map<String, ?> map) throws Exception {
            InstallAddonResponseBodyDataConditions self = new InstallAddonResponseBodyDataConditions();
            return TeaModel.build(map, self);
        }

        public InstallAddonResponseBodyDataConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public InstallAddonResponseBodyDataConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public InstallAddonResponseBodyDataConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InstallAddonResponseBodyDataConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public InstallAddonResponseBodyDataConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InstallAddonResponseBodyDataConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InstallAddonResponseBodyData extends TeaModel {
        /**
         * <p>Addon name.</p>
         */
        @NameInMap("AddonName")
        public String addonName;

        /**
         * <p>Number of alarm groups.</p>
         */
        @NameInMap("AlertRuleCount")
        public Long alertRuleCount;

        /**
         * <p>Condition list.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<InstallAddonResponseBodyDataConditions> conditions;

        /**
         * <p>Created time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Number of dashboard.</p>
         */
        @NameInMap("DashboardCount")
        public Long dashboardCount;

        /**
         * <p>Environment ID.</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>Number of Exporter.</p>
         */
        @NameInMap("ExporterCount")
        public Long exporterCount;

        /**
         * <p>Whether there is configuration.</p>
         */
        @NameInMap("HaveConfig")
        public Boolean haveConfig;

        /**
         * <p>User ID of the installation.</p>
         */
        @NameInMap("InstallUserId")
        public String installUserId;

        /**
         * <p>Language.</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Release ID.</p>
         */
        @NameInMap("ReleaseId")
        public String releaseId;

        /**
         * <p>Name of Release.</p>
         */
        @NameInMap("ReleaseName")
        public String releaseName;

        /**
         * <p>Scene.</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Status of Release.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Update time.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>User ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The version number.</p>
         */
        @NameInMap("Version")
        public String version;

        public static InstallAddonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstallAddonResponseBodyData self = new InstallAddonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstallAddonResponseBodyData setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public InstallAddonResponseBodyData setAlertRuleCount(Long alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            return this;
        }
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        public InstallAddonResponseBodyData setConditions(java.util.List<InstallAddonResponseBodyDataConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<InstallAddonResponseBodyDataConditions> getConditions() {
            return this.conditions;
        }

        public InstallAddonResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public InstallAddonResponseBodyData setDashboardCount(Long dashboardCount) {
            this.dashboardCount = dashboardCount;
            return this;
        }
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        public InstallAddonResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public InstallAddonResponseBodyData setExporterCount(Long exporterCount) {
            this.exporterCount = exporterCount;
            return this;
        }
        public Long getExporterCount() {
            return this.exporterCount;
        }

        public InstallAddonResponseBodyData setHaveConfig(Boolean haveConfig) {
            this.haveConfig = haveConfig;
            return this;
        }
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        public InstallAddonResponseBodyData setInstallUserId(String installUserId) {
            this.installUserId = installUserId;
            return this;
        }
        public String getInstallUserId() {
            return this.installUserId;
        }

        public InstallAddonResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public InstallAddonResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public InstallAddonResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public InstallAddonResponseBodyData setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public InstallAddonResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public InstallAddonResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InstallAddonResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public InstallAddonResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public InstallAddonResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
