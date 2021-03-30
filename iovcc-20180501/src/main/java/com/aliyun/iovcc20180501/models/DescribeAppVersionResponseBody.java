// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAppVersionResponseBody extends TeaModel {
    @NameInMap("AppVersion")
    public DescribeAppVersionResponseBodyAppVersion appVersion;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppVersionResponseBody self = new DescribeAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppVersionResponseBody setAppVersion(DescribeAppVersionResponseBodyAppVersion appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public DescribeAppVersionResponseBodyAppVersion getAppVersion() {
        return this.appVersion;
    }

    public DescribeAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppVersionResponseBodyAppVersionAdapters extends TeaModel {
        @NameInMap("DeviceModelId")
        public String deviceModelId;

        @NameInMap("MaxOsVersion")
        public String maxOsVersion;

        @NameInMap("MinOsVersion")
        public String minOsVersion;

        @NameInMap("VersionId")
        public Long versionId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("DeviceModelName")
        public String deviceModelName;

        public static DescribeAppVersionResponseBodyAppVersionAdapters build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppVersionResponseBodyAppVersionAdapters self = new DescribeAppVersionResponseBodyAppVersionAdapters();
            return TeaModel.build(map, self);
        }

        public DescribeAppVersionResponseBodyAppVersionAdapters setDeviceModelId(String deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public String getDeviceModelId() {
            return this.deviceModelId;
        }

        public DescribeAppVersionResponseBodyAppVersionAdapters setMaxOsVersion(String maxOsVersion) {
            this.maxOsVersion = maxOsVersion;
            return this;
        }
        public String getMaxOsVersion() {
            return this.maxOsVersion;
        }

        public DescribeAppVersionResponseBodyAppVersionAdapters setMinOsVersion(String minOsVersion) {
            this.minOsVersion = minOsVersion;
            return this;
        }
        public String getMinOsVersion() {
            return this.minOsVersion;
        }

        public DescribeAppVersionResponseBodyAppVersionAdapters setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public DescribeAppVersionResponseBodyAppVersionAdapters setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAppVersionResponseBodyAppVersionAdapters setDeviceModelName(String deviceModelName) {
            this.deviceModelName = deviceModelName;
            return this;
        }
        public String getDeviceModelName() {
            return this.deviceModelName;
        }

    }

    public static class DescribeAppVersionResponseBodyAppVersion extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("IsAllowNewInstall")
        public String isAllowNewInstall;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("ApkMd5")
        public String apkMd5;

        @NameInMap("RestartAppParam")
        public String restartAppParam;

        @NameInMap("WhiteVersionList")
        public String whiteVersionList;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("RestartAppType")
        public String restartAppType;

        @NameInMap("VersionCode")
        public Long versionCode;

        @NameInMap("BlackVersionList")
        public String blackVersionList;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("Adapters")
        public java.util.List<DescribeAppVersionResponseBodyAppVersionAdapters> adapters;

        @NameInMap("IsSilentUpgrade")
        public String isSilentUpgrade;

        @NameInMap("InstallType")
        public String installType;

        @NameInMap("IsNeedRestart")
        public String isNeedRestart;

        @NameInMap("Size")
        public String size;

        @NameInMap("RestartType")
        public String restartType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("IsForceUpgrade")
        public String isForceUpgrade;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OriginalUrl")
        public String originalUrl;

        public static DescribeAppVersionResponseBodyAppVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppVersionResponseBodyAppVersion self = new DescribeAppVersionResponseBodyAppVersion();
            return TeaModel.build(map, self);
        }

        public DescribeAppVersionResponseBodyAppVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAppVersionResponseBodyAppVersion setIsAllowNewInstall(String isAllowNewInstall) {
            this.isAllowNewInstall = isAllowNewInstall;
            return this;
        }
        public String getIsAllowNewInstall() {
            return this.isAllowNewInstall;
        }

        public DescribeAppVersionResponseBodyAppVersion setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeAppVersionResponseBodyAppVersion setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeAppVersionResponseBodyAppVersion setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeAppVersionResponseBodyAppVersion setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public DescribeAppVersionResponseBodyAppVersion setApkMd5(String apkMd5) {
            this.apkMd5 = apkMd5;
            return this;
        }
        public String getApkMd5() {
            return this.apkMd5;
        }

        public DescribeAppVersionResponseBodyAppVersion setRestartAppParam(String restartAppParam) {
            this.restartAppParam = restartAppParam;
            return this;
        }
        public String getRestartAppParam() {
            return this.restartAppParam;
        }

        public DescribeAppVersionResponseBodyAppVersion setWhiteVersionList(String whiteVersionList) {
            this.whiteVersionList = whiteVersionList;
            return this;
        }
        public String getWhiteVersionList() {
            return this.whiteVersionList;
        }

        public DescribeAppVersionResponseBodyAppVersion setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppVersionResponseBodyAppVersion setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppVersionResponseBodyAppVersion setRestartAppType(String restartAppType) {
            this.restartAppType = restartAppType;
            return this;
        }
        public String getRestartAppType() {
            return this.restartAppType;
        }

        public DescribeAppVersionResponseBodyAppVersion setVersionCode(Long versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public Long getVersionCode() {
            return this.versionCode;
        }

        public DescribeAppVersionResponseBodyAppVersion setBlackVersionList(String blackVersionList) {
            this.blackVersionList = blackVersionList;
            return this;
        }
        public String getBlackVersionList() {
            return this.blackVersionList;
        }

        public DescribeAppVersionResponseBodyAppVersion setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeAppVersionResponseBodyAppVersion setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeAppVersionResponseBodyAppVersion setAdapters(java.util.List<DescribeAppVersionResponseBodyAppVersionAdapters> adapters) {
            this.adapters = adapters;
            return this;
        }
        public java.util.List<DescribeAppVersionResponseBodyAppVersionAdapters> getAdapters() {
            return this.adapters;
        }

        public DescribeAppVersionResponseBodyAppVersion setIsSilentUpgrade(String isSilentUpgrade) {
            this.isSilentUpgrade = isSilentUpgrade;
            return this;
        }
        public String getIsSilentUpgrade() {
            return this.isSilentUpgrade;
        }

        public DescribeAppVersionResponseBodyAppVersion setInstallType(String installType) {
            this.installType = installType;
            return this;
        }
        public String getInstallType() {
            return this.installType;
        }

        public DescribeAppVersionResponseBodyAppVersion setIsNeedRestart(String isNeedRestart) {
            this.isNeedRestart = isNeedRestart;
            return this;
        }
        public String getIsNeedRestart() {
            return this.isNeedRestart;
        }

        public DescribeAppVersionResponseBodyAppVersion setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeAppVersionResponseBodyAppVersion setRestartType(String restartType) {
            this.restartType = restartType;
            return this;
        }
        public String getRestartType() {
            return this.restartType;
        }

        public DescribeAppVersionResponseBodyAppVersion setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAppVersionResponseBodyAppVersion setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeAppVersionResponseBodyAppVersion setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeAppVersionResponseBodyAppVersion setIsForceUpgrade(String isForceUpgrade) {
            this.isForceUpgrade = isForceUpgrade;
            return this;
        }
        public String getIsForceUpgrade() {
            return this.isForceUpgrade;
        }

        public DescribeAppVersionResponseBodyAppVersion setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAppVersionResponseBodyAppVersion setOriginalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
            return this;
        }
        public String getOriginalUrl() {
            return this.originalUrl;
        }

    }

}
