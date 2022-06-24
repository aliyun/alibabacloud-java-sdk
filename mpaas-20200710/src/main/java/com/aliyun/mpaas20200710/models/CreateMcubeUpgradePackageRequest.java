// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradePackageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("AppstoreUrl")
    public String appstoreUrl;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("CustomDomainName")
    public String customDomainName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("IconFileUrl")
    public String iconFileUrl;

    @NameInMap("InstallAmount")
    public Integer installAmount;

    @NameInMap("IosSymbolfileUrl")
    public String iosSymbolfileUrl;

    @NameInMap("IsEnterprise")
    public Integer isEnterprise;

    @NameInMap("NeedCheck")
    public Integer needCheck;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ValidDays")
    public Integer validDays;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeUpgradePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradePackageRequest self = new CreateMcubeUpgradePackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradePackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeUpgradePackageRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateMcubeUpgradePackageRequest setAppstoreUrl(String appstoreUrl) {
        this.appstoreUrl = appstoreUrl;
        return this;
    }
    public String getAppstoreUrl() {
        return this.appstoreUrl;
    }

    public CreateMcubeUpgradePackageRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateMcubeUpgradePackageRequest setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
        return this;
    }
    public String getCustomDomainName() {
        return this.customDomainName;
    }

    public CreateMcubeUpgradePackageRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateMcubeUpgradePackageRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public CreateMcubeUpgradePackageRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateMcubeUpgradePackageRequest setIconFileUrl(String iconFileUrl) {
        this.iconFileUrl = iconFileUrl;
        return this;
    }
    public String getIconFileUrl() {
        return this.iconFileUrl;
    }

    public CreateMcubeUpgradePackageRequest setInstallAmount(Integer installAmount) {
        this.installAmount = installAmount;
        return this;
    }
    public Integer getInstallAmount() {
        return this.installAmount;
    }

    public CreateMcubeUpgradePackageRequest setIosSymbolfileUrl(String iosSymbolfileUrl) {
        this.iosSymbolfileUrl = iosSymbolfileUrl;
        return this;
    }
    public String getIosSymbolfileUrl() {
        return this.iosSymbolfileUrl;
    }

    public CreateMcubeUpgradePackageRequest setIsEnterprise(Integer isEnterprise) {
        this.isEnterprise = isEnterprise;
        return this;
    }
    public Integer getIsEnterprise() {
        return this.isEnterprise;
    }

    public CreateMcubeUpgradePackageRequest setNeedCheck(Integer needCheck) {
        this.needCheck = needCheck;
        return this;
    }
    public Integer getNeedCheck() {
        return this.needCheck;
    }

    public CreateMcubeUpgradePackageRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public CreateMcubeUpgradePackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateMcubeUpgradePackageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeUpgradePackageRequest setValidDays(Integer validDays) {
        this.validDays = validDays;
        return this;
    }
    public Integer getValidDays() {
        return this.validDays;
    }

    public CreateMcubeUpgradePackageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
