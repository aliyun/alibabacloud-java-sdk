// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public DescribeAddonReleaseResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the alert rule was deleted. Valid values:</p>
     * <br>
     * <p>*   `true`: The alert rule was deleted.</p>
     * <p>*   `false`: The alert rule failed to be deleted.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonReleaseResponseBody self = new DescribeAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddonReleaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAddonReleaseResponseBody setData(DescribeAddonReleaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAddonReleaseResponseBodyData getData() {
        return this.data;
    }

    public DescribeAddonReleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddonReleaseResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeAddonReleaseResponseBodyDataReleaseConditions extends TeaModel {
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
         * <p>COndition details.</p>
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

        public static DescribeAddonReleaseResponseBodyDataReleaseConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonReleaseResponseBodyDataReleaseConditions self = new DescribeAddonReleaseResponseBodyDataReleaseConditions();
            return TeaModel.build(map, self);
        }

        public DescribeAddonReleaseResponseBodyDataReleaseConditions setFirstTransitionTime(String firstTransitionTime) {
            this.firstTransitionTime = firstTransitionTime;
            return this;
        }
        public String getFirstTransitionTime() {
            return this.firstTransitionTime;
        }

        public DescribeAddonReleaseResponseBodyDataReleaseConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public DescribeAddonReleaseResponseBodyDataReleaseConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAddonReleaseResponseBodyDataReleaseConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAddonReleaseResponseBodyDataReleaseConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAddonReleaseResponseBodyDataReleaseConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAddonReleaseResponseBodyDataRelease extends TeaModel {
        /**
         * <p>Name of Addon.</p>
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
        public java.util.List<DescribeAddonReleaseResponseBodyDataReleaseConditions> conditions;

        /**
         * <p>Create time.</p>
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

        @NameInMap("Managed")
        public Boolean managed;

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
        @NameInMap("UserID")
        public String userID;

        /**
         * <p>Version of Addon.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAddonReleaseResponseBodyDataRelease build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonReleaseResponseBodyDataRelease self = new DescribeAddonReleaseResponseBodyDataRelease();
            return TeaModel.build(map, self);
        }

        public DescribeAddonReleaseResponseBodyDataRelease setAddonName(String addonName) {
            this.addonName = addonName;
            return this;
        }
        public String getAddonName() {
            return this.addonName;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setAlertRuleCount(Long alertRuleCount) {
            this.alertRuleCount = alertRuleCount;
            return this;
        }
        public Long getAlertRuleCount() {
            return this.alertRuleCount;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setConditions(java.util.List<DescribeAddonReleaseResponseBodyDataReleaseConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeAddonReleaseResponseBodyDataReleaseConditions> getConditions() {
            return this.conditions;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setDashboardCount(Long dashboardCount) {
            this.dashboardCount = dashboardCount;
            return this;
        }
        public Long getDashboardCount() {
            return this.dashboardCount;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setExporterCount(Long exporterCount) {
            this.exporterCount = exporterCount;
            return this;
        }
        public Long getExporterCount() {
            return this.exporterCount;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setHaveConfig(Boolean haveConfig) {
            this.haveConfig = haveConfig;
            return this;
        }
        public Boolean getHaveConfig() {
            return this.haveConfig;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setInstallUserId(String installUserId) {
            this.installUserId = installUserId;
            return this;
        }
        public String getInstallUserId() {
            return this.installUserId;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setUserID(String userID) {
            this.userID = userID;
            return this;
        }
        public String getUserID() {
            return this.userID;
        }

        public DescribeAddonReleaseResponseBodyDataRelease setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAddonReleaseResponseBodyData extends TeaModel {
        /**
         * <p>Config of the Release.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>Release Detail.</p>
         */
        @NameInMap("Release")
        public DescribeAddonReleaseResponseBodyDataRelease release;

        public static DescribeAddonReleaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonReleaseResponseBodyData self = new DescribeAddonReleaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAddonReleaseResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeAddonReleaseResponseBodyData setRelease(DescribeAddonReleaseResponseBodyDataRelease release) {
            this.release = release;
            return this;
        }
        public DescribeAddonReleaseResponseBodyDataRelease getRelease() {
            return this.release;
        }

    }

}
