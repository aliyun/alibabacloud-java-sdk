// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionRequest extends TeaModel {
    @NameInMap("BlackVersionList")
    public String blackVersionList;

    @NameInMap("IsAllowNewInstall")
    public String isAllowNewInstall;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("VersionCode")
    public String versionCode;

    @NameInMap("InstallType")
    public String installType;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("IsForceUpgrade")
    public String isForceUpgrade;

    @NameInMap("IsSilentUpgrade")
    public String isSilentUpgrade;

    @NameInMap("IsNeedRestart")
    public String isNeedRestart;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("ReleaseNote")
    public String releaseNote;

    @NameInMap("WhiteVersionList")
    public String whiteVersionList;

    @NameInMap("RestartType")
    public String restartType;

    @NameInMap("RestartAppType")
    public String restartAppType;

    @NameInMap("RestartAppParam")
    public String restartAppParam;

    @NameInMap("DeviceAdapterList")
    public String deviceAdapterList;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("ApkMd5")
    public String apkMd5;

    public static UpdateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionRequest self = new UpdateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionRequest setBlackVersionList(String blackVersionList) {
        this.blackVersionList = blackVersionList;
        return this;
    }
    public String getBlackVersionList() {
        return this.blackVersionList;
    }

    public UpdateAppVersionRequest setIsAllowNewInstall(String isAllowNewInstall) {
        this.isAllowNewInstall = isAllowNewInstall;
        return this;
    }
    public String getIsAllowNewInstall() {
        return this.isAllowNewInstall;
    }

    public UpdateAppVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppVersionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppVersionRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public UpdateAppVersionRequest setInstallType(String installType) {
        this.installType = installType;
        return this;
    }
    public String getInstallType() {
        return this.installType;
    }

    public UpdateAppVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAppVersionRequest setIsForceUpgrade(String isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }
    public String getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    public UpdateAppVersionRequest setIsSilentUpgrade(String isSilentUpgrade) {
        this.isSilentUpgrade = isSilentUpgrade;
        return this;
    }
    public String getIsSilentUpgrade() {
        return this.isSilentUpgrade;
    }

    public UpdateAppVersionRequest setIsNeedRestart(String isNeedRestart) {
        this.isNeedRestart = isNeedRestart;
        return this;
    }
    public String getIsNeedRestart() {
        return this.isNeedRestart;
    }

    public UpdateAppVersionRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public UpdateAppVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public UpdateAppVersionRequest setWhiteVersionList(String whiteVersionList) {
        this.whiteVersionList = whiteVersionList;
        return this;
    }
    public String getWhiteVersionList() {
        return this.whiteVersionList;
    }

    public UpdateAppVersionRequest setRestartType(String restartType) {
        this.restartType = restartType;
        return this;
    }
    public String getRestartType() {
        return this.restartType;
    }

    public UpdateAppVersionRequest setRestartAppType(String restartAppType) {
        this.restartAppType = restartAppType;
        return this;
    }
    public String getRestartAppType() {
        return this.restartAppType;
    }

    public UpdateAppVersionRequest setRestartAppParam(String restartAppParam) {
        this.restartAppParam = restartAppParam;
        return this;
    }
    public String getRestartAppParam() {
        return this.restartAppParam;
    }

    public UpdateAppVersionRequest setDeviceAdapterList(String deviceAdapterList) {
        this.deviceAdapterList = deviceAdapterList;
        return this;
    }
    public String getDeviceAdapterList() {
        return this.deviceAdapterList;
    }

    public UpdateAppVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public UpdateAppVersionRequest setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5;
        return this;
    }
    public String getApkMd5() {
        return this.apkMd5;
    }

}
