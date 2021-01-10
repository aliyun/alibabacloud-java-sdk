// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionRequest extends TeaModel {
    @NameInMap("IsMilestone")
    public String isMilestone;

    @NameInMap("IsForceNightUpgrade")
    public String isForceNightUpgrade;

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

    @NameInMap("IsForceUpgrade")
    public String isForceUpgrade;

    @NameInMap("BlackVersionList")
    public String blackVersionList;

    @NameInMap("WhiteVersionList")
    public String whiteVersionList;

    @NameInMap("MaxClientVersion")
    public String maxClientVersion;

    @NameInMap("MinClientVersion")
    public String minClientVersion;

    @NameInMap("NightUpgradeDownloadType")
    public String nightUpgradeDownloadType;

    @NameInMap("NightUpgradeIsShowTip")
    public String nightUpgradeIsShowTip;

    @NameInMap("NightUpgradeIsAllowedCancel")
    public String nightUpgradeIsAllowedCancel;

    @NameInMap("RomList")
    public String romList;

    @NameInMap("Id")
    public String id;

    @NameInMap("EnableMobileDownload")
    public String enableMobileDownload;

    @NameInMap("MobileDownloadMaxSize")
    public String mobileDownloadMaxSize;

    public static UpdateOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionRequest self = new UpdateOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionRequest setIsMilestone(String isMilestone) {
        this.isMilestone = isMilestone;
        return this;
    }
    public String getIsMilestone() {
        return this.isMilestone;
    }

    public UpdateOsVersionRequest setIsForceNightUpgrade(String isForceNightUpgrade) {
        this.isForceNightUpgrade = isForceNightUpgrade;
        return this;
    }
    public String getIsForceNightUpgrade() {
        return this.isForceNightUpgrade;
    }

    public UpdateOsVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOsVersionRequest setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public String getDeviceModelId() {
        return this.deviceModelId;
    }

    public UpdateOsVersionRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

    public UpdateOsVersionRequest setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public UpdateOsVersionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateOsVersionRequest setIsForceUpgrade(String isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }
    public String getIsForceUpgrade() {
        return this.isForceUpgrade;
    }

    public UpdateOsVersionRequest setBlackVersionList(String blackVersionList) {
        this.blackVersionList = blackVersionList;
        return this;
    }
    public String getBlackVersionList() {
        return this.blackVersionList;
    }

    public UpdateOsVersionRequest setWhiteVersionList(String whiteVersionList) {
        this.whiteVersionList = whiteVersionList;
        return this;
    }
    public String getWhiteVersionList() {
        return this.whiteVersionList;
    }

    public UpdateOsVersionRequest setMaxClientVersion(String maxClientVersion) {
        this.maxClientVersion = maxClientVersion;
        return this;
    }
    public String getMaxClientVersion() {
        return this.maxClientVersion;
    }

    public UpdateOsVersionRequest setMinClientVersion(String minClientVersion) {
        this.minClientVersion = minClientVersion;
        return this;
    }
    public String getMinClientVersion() {
        return this.minClientVersion;
    }

    public UpdateOsVersionRequest setNightUpgradeDownloadType(String nightUpgradeDownloadType) {
        this.nightUpgradeDownloadType = nightUpgradeDownloadType;
        return this;
    }
    public String getNightUpgradeDownloadType() {
        return this.nightUpgradeDownloadType;
    }

    public UpdateOsVersionRequest setNightUpgradeIsShowTip(String nightUpgradeIsShowTip) {
        this.nightUpgradeIsShowTip = nightUpgradeIsShowTip;
        return this;
    }
    public String getNightUpgradeIsShowTip() {
        return this.nightUpgradeIsShowTip;
    }

    public UpdateOsVersionRequest setNightUpgradeIsAllowedCancel(String nightUpgradeIsAllowedCancel) {
        this.nightUpgradeIsAllowedCancel = nightUpgradeIsAllowedCancel;
        return this;
    }
    public String getNightUpgradeIsAllowedCancel() {
        return this.nightUpgradeIsAllowedCancel;
    }

    public UpdateOsVersionRequest setRomList(String romList) {
        this.romList = romList;
        return this;
    }
    public String getRomList() {
        return this.romList;
    }

    public UpdateOsVersionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateOsVersionRequest setEnableMobileDownload(String enableMobileDownload) {
        this.enableMobileDownload = enableMobileDownload;
        return this;
    }
    public String getEnableMobileDownload() {
        return this.enableMobileDownload;
    }

    public UpdateOsVersionRequest setMobileDownloadMaxSize(String mobileDownloadMaxSize) {
        this.mobileDownloadMaxSize = mobileDownloadMaxSize;
        return this;
    }
    public String getMobileDownloadMaxSize() {
        return this.mobileDownloadMaxSize;
    }

}
