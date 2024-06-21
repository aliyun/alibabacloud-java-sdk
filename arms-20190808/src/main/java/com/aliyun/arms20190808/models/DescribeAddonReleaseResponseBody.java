// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The release information.</p>
     */
    @NameInMap("Data")
    public DescribeAddonReleaseResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
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
        public java.util.List<DescribeAddonReleaseResponseBodyDataReleaseConditions> conditions;

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
         * <p>23810923891</p>
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
         * <p>Whether or not it is a managed component.</p>
         */
        @NameInMap("Managed")
        public Boolean managed;

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
         * <p>13818734031</p>
         */
        @NameInMap("UserID")
        public String userID;

        /**
         * <p>The version of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
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
         * <p>The configuration information of the add-on release.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;host&quot;:&quot;mysql-service.default&quot;,&quot;port&quot;:3306,&quot;username&quot;:&quot;root&quot;,&quot;password&quot;:&quot;roots&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The release information.</p>
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
