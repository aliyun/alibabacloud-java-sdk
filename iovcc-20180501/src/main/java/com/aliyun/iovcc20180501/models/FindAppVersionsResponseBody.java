// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindAppVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppVersionList")
    public FindAppVersionsResponseBodyAppVersionList appVersionList;

    public static FindAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindAppVersionsResponseBody self = new FindAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public FindAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindAppVersionsResponseBody setAppVersionList(FindAppVersionsResponseBodyAppVersionList appVersionList) {
        this.appVersionList = appVersionList;
        return this;
    }
    public FindAppVersionsResponseBodyAppVersionList getAppVersionList() {
        return this.appVersionList;
    }

    public static class FindAppVersionsResponseBodyAppVersionListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("IsNeedRestart")
        public String isNeedRestart;

        @NameInMap("IsForceUpgrade")
        public String isForceUpgrade;

        @NameInMap("IsSilentUpgrade")
        public String isSilentUpgrade;

        @NameInMap("IsAllowNewInstall")
        public String isAllowNewInstall;

        @NameInMap("RestartType")
        public String restartType;

        @NameInMap("RestartAppType")
        public String restartAppType;

        @NameInMap("RestartAppParam")
        public String restartAppParam;

        @NameInMap("InstallType")
        public String installType;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppPackageName")
        public String appPackageName;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindAppVersionsResponseBodyAppVersionListItems build(java.util.Map<String, ?> map) throws Exception {
            FindAppVersionsResponseBodyAppVersionListItems self = new FindAppVersionsResponseBodyAppVersionListItems();
            return TeaModel.build(map, self);
        }

        public FindAppVersionsResponseBodyAppVersionListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setIsNeedRestart(String isNeedRestart) {
            this.isNeedRestart = isNeedRestart;
            return this;
        }
        public String getIsNeedRestart() {
            return this.isNeedRestart;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setIsForceUpgrade(String isForceUpgrade) {
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }
        public String getIsForceUpgrade() {
            return this.isForceUpgrade;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setIsSilentUpgrade(String isSilentUpgrade) {
            this.isSilentUpgrade = isSilentUpgrade;
            return this;
        }
        public String getIsSilentUpgrade() {
            return this.isSilentUpgrade;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setIsAllowNewInstall(String isAllowNewInstall) {
            this.isAllowNewInstall = isAllowNewInstall;
            return this;
        }
        public String getIsAllowNewInstall() {
            return this.isAllowNewInstall;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setRestartType(String restartType) {
            this.restartType = restartType;
            return this;
        }
        public String getRestartType() {
            return this.restartType;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setRestartAppType(String restartAppType) {
            this.restartAppType = restartAppType;
            return this;
        }
        public String getRestartAppType() {
            return this.restartAppType;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setRestartAppParam(String restartAppParam) {
            this.restartAppParam = restartAppParam;
            return this;
        }
        public String getRestartAppParam() {
            return this.restartAppParam;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setInstallType(String installType) {
            this.installType = installType;
            return this;
        }
        public String getInstallType() {
            return this.installType;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setAppPackageName(String appPackageName) {
            this.appPackageName = appPackageName;
            return this;
        }
        public String getAppPackageName() {
            return this.appPackageName;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindAppVersionsResponseBodyAppVersionListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

    public static class FindAppVersionsResponseBodyAppVersionList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindAppVersionsResponseBodyAppVersionListItems> items;

        public static FindAppVersionsResponseBodyAppVersionList build(java.util.Map<String, ?> map) throws Exception {
            FindAppVersionsResponseBodyAppVersionList self = new FindAppVersionsResponseBodyAppVersionList();
            return TeaModel.build(map, self);
        }

        public FindAppVersionsResponseBodyAppVersionList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindAppVersionsResponseBodyAppVersionList setItems(java.util.List<FindAppVersionsResponseBodyAppVersionListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindAppVersionsResponseBodyAppVersionListItems> getItems() {
            return this.items;
        }

    }

}
