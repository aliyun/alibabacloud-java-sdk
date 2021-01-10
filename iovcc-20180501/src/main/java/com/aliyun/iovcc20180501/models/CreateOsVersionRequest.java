// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateOsVersionRequest extends TeaModel {
    @NameInMap("IsForceNightUpgrade")
    public String isForceNightUpgrade;

    @NameInMap("MaxClientVersion")
    public String maxClientVersion;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceModelId")
    public String deviceModelId;

    @NameInMap("SystemVersion")
    public String systemVersion;

    @NameInMap("ReleaseNote")
    public String releaseNote;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("BlackVersionList")
    public String blackVersionList;

    @NameInMap("IsMilestone")
    public String isMilestone;

    @NameInMap("MinClientVersion")
    public String minClientVersion;

    @NameInMap("WhiteVersionList")
    public String whiteVersionList;

    @NameInMap("IsForceUpgrade")
    public String isForceUpgrade;

    @NameInMap("NightUpgradeDownloadType")
    public String nightUpgradeDownloadType;

    @NameInMap("NightUpgradeIsShowTip")
    public String nightUpgradeIsShowTip;

    @NameInMap("NightUpgradeIsAllowedCancel")
    public String nightUpgradeIsAllowedCancel;

    @NameInMap("RomList")
    public String romList;

    @NameInMap("EnableMobileDownload")
    public String enableMobileDownload;

    @NameInMap("MobileDownloadMaxSize")
    public String mobileDownloadMaxSize;

    public static CreateOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOsVersionRequest self = new CreateOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOsVersionRequest setIsForceNightUpgrade(String isForceNightUpgrade) {
        this.isForceNightUpgrade = isForceNightUpgrade;
        return this;
    }
    public String getIsForceNightUpgrade() {
        return this.isForceNightUpgrade;
    }

    public CreateOsVersionRequest setMaxClientVersion(String maxClientVersion) {
        this.maxClientVersion = maxClientVersion;
        return this;
    }
    public String getMaxClientVersion() {
        return this.maxClientVersion;
    }

    public CreateOsVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateOsVersionRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public CreateOsVersionRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

    public CreateOsVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public CreateOsVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateOsVersionRequest setBlackVersionList(String blackVersionList) {
        this.blackVersionList = blackVersionList;
        return this;
    }
    public String getBlackVersionList() {
        return this.blackVersionList;
    }

    public CreateOsVersionRequest setIsMilestone(String isMilestone) {
        this.isMilestone = isMilestone;
        return this;
    }
    public String getIsMilestone() {
        return this.isMilestone;
    }

    public CreateOsVersionRequest setMinClientVersion(String minClientVersion) {
        this.minClientVersion = minClientVersion;
        return this;
    }
    public String getMinClientVersion() {
        return this.minClientVersion;
    }

    public CreateOsVersionRequest setWhiteVersionList(String whiteVersionList) {
        this.whiteVersionList = whiteVersionList;
        return this;
    }
    public String getWhiteVersionList() {
        return this.whiteVersionList;
    }

    public CreateOsVersionRequest setIsForceUpgrade(String isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }
    public String getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    public CreateOsVersionRequest setNightUpgradeDownloadType(String nightUpgradeDownloadType) {
        this.nightUpgradeDownloadType = nightUpgradeDownloadType;
        return this;
    }
    public String getNightUpgradeDownloadType() {
        return this.nightUpgradeDownloadType;
    }

    public CreateOsVersionRequest setNightUpgradeIsShowTip(String nightUpgradeIsShowTip) {
        this.nightUpgradeIsShowTip = nightUpgradeIsShowTip;
        return this;
    }
    public String getNightUpgradeIsShowTip() {
        return this.nightUpgradeIsShowTip;
    }

    public CreateOsVersionRequest setNightUpgradeIsAllowedCancel(String nightUpgradeIsAllowedCancel) {
        this.nightUpgradeIsAllowedCancel = nightUpgradeIsAllowedCancel;
        return this;
    }
    public String getNightUpgradeIsAllowedCancel() {
        return this.nightUpgradeIsAllowedCancel;
    }

    public CreateOsVersionRequest setRomList(String romList) {
        this.romList = romList;
        return this;
    }
    public String getRomList() {
        return this.romList;
    }

    public CreateOsVersionRequest setEnableMobileDownload(String enableMobileDownload) {
        this.enableMobileDownload = enableMobileDownload;
        return this;
    }
    public String getEnableMobileDownload() {
        return this.enableMobileDownload;
    }

    public CreateOsVersionRequest setMobileDownloadMaxSize(String mobileDownloadMaxSize) {
        this.mobileDownloadMaxSize = mobileDownloadMaxSize;
        return this;
    }
    public String getMobileDownloadMaxSize() {
        return this.mobileDownloadMaxSize;
    }

}
