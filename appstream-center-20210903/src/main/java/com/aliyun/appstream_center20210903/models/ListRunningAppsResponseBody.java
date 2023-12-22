// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class ListRunningAppsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningCloudApps")
    public java.util.List<ListRunningAppsResponseBodyRunningCloudApps> runningCloudApps;

    public static ListRunningAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunningAppsResponseBody self = new ListRunningAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunningAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRunningAppsResponseBody setRunningCloudApps(java.util.List<ListRunningAppsResponseBodyRunningCloudApps> runningCloudApps) {
        this.runningCloudApps = runningCloudApps;
        return this;
    }
    public java.util.List<ListRunningAppsResponseBodyRunningCloudApps> getRunningCloudApps() {
        return this.runningCloudApps;
    }

    public static class ListRunningAppsResponseBodyRunningCloudApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StartTime")
        public String startTime;

        public static ListRunningAppsResponseBodyRunningCloudApps build(java.util.Map<String, ?> map) throws Exception {
            ListRunningAppsResponseBodyRunningCloudApps self = new ListRunningAppsResponseBodyRunningCloudApps();
            return TeaModel.build(map, self);
        }

        public ListRunningAppsResponseBodyRunningCloudApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRunningAppsResponseBodyRunningCloudApps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
