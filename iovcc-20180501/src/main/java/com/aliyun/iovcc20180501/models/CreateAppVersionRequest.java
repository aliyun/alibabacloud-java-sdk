// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateAppVersionRequest extends TeaModel {
    @NameInMap("IsForceUpgrade")
    public String isForceUpgrade;

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

    @NameInMap("ReleaseNote")
    public String releaseNote;

    @NameInMap("IsSilentUpgrade")
    public String isSilentUpgrade;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("IsNeedRestart")
    public String isNeedRestart;

    @NameInMap("BlackVersionList")
    public String blackVersionList;

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

    @NameInMap("ApkMd5")
    public String apkMd5;

    public static CreateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionRequest self = new CreateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionRequest setIsForceUpgrade(String isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }
    public String getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    public CreateAppVersionRequest setIsAllowNewInstall(String isAllowNewInstall) {
        this.isAllowNewInstall = isAllowNewInstall;
        return this;
    }
    public String getIsAllowNewInstall() {
        return this.isAllowNewInstall;
    }

    public CreateAppVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppVersionRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppVersionRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public CreateAppVersionRequest setInstallType(String installType) {
        this.installType = installType;
        return this;
    }
    public String getInstallType() {
        return this.installType;
    }

    public CreateAppVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAppVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public CreateAppVersionRequest setIsSilentUpgrade(String isSilentUpgrade) {
        this.isSilentUpgrade = isSilentUpgrade;
        return this;
    }
    public String getIsSilentUpgrade() {
        return this.isSilentUpgrade;
    }

    public CreateAppVersionRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public CreateAppVersionRequest setIsNeedRestart(String isNeedRestart) {
        this.isNeedRestart = isNeedRestart;
        return this;
    }
    public String getIsNeedRestart() {
        return this.isNeedRestart;
    }

    public CreateAppVersionRequest setBlackVersionList(String blackVersionList) {
        this.blackVersionList = blackVersionList;
        return this;
    }
    public String getBlackVersionList() {
        return this.blackVersionList;
    }

    public CreateAppVersionRequest setWhiteVersionList(String whiteVersionList) {
        this.whiteVersionList = whiteVersionList;
        return this;
    }
    public String getWhiteVersionList() {
        return this.whiteVersionList;
    }

    public CreateAppVersionRequest setRestartType(String restartType) {
        this.restartType = restartType;
        return this;
    }
    public String getRestartType() {
        return this.restartType;
    }

    public CreateAppVersionRequest setRestartAppType(String restartAppType) {
        this.restartAppType = restartAppType;
        return this;
    }
    public String getRestartAppType() {
        return this.restartAppType;
    }

    public CreateAppVersionRequest setRestartAppParam(String restartAppParam) {
        this.restartAppParam = restartAppParam;
        return this;
    }
    public String getRestartAppParam() {
        return this.restartAppParam;
    }

    public CreateAppVersionRequest setDeviceAdapterList(String deviceAdapterList) {
        this.deviceAdapterList = deviceAdapterList;
        return this;
    }
    public String getDeviceAdapterList() {
        return this.deviceAdapterList;
    }

    public CreateAppVersionRequest setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5;
        return this;
    }
    public String getApkMd5() {
        return this.apkMd5;
    }

}
