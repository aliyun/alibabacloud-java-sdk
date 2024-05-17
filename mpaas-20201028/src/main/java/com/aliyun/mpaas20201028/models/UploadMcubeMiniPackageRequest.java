// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UploadMcubeMiniPackageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AutoInstall")
    public Long autoInstall;

    @NameInMap("ClientVersionMax")
    public String clientVersionMax;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientVersionMin")
    public String clientVersionMin;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableKeepAlive")
    public String enableKeepAlive;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableOptionMenu")
    public String enableOptionMenu;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnableTabBar")
    public Long enableTabBar;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("H5Id")
    public String h5Id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("H5Name")
    public String h5Name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("H5Version")
    public String h5Version;

    @NameInMap("IconFileUrl")
    public String iconFileUrl;

    @NameInMap("IconUrl")
    public String iconUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstallType")
    public Long installType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MainUrl")
    public String mainUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageType")
    public Long packageType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceFileUrl")
    public String resourceFileUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public Long resourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Vhost")
    public String vhost;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UploadMcubeMiniPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeMiniPackageRequest self = new UploadMcubeMiniPackageRequest();
        return TeaModel.build(map, self);
    }

    public UploadMcubeMiniPackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadMcubeMiniPackageRequest setAutoInstall(Long autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Long getAutoInstall() {
        return this.autoInstall;
    }

    public UploadMcubeMiniPackageRequest setClientVersionMax(String clientVersionMax) {
        this.clientVersionMax = clientVersionMax;
        return this;
    }
    public String getClientVersionMax() {
        return this.clientVersionMax;
    }

    public UploadMcubeMiniPackageRequest setClientVersionMin(String clientVersionMin) {
        this.clientVersionMin = clientVersionMin;
        return this;
    }
    public String getClientVersionMin() {
        return this.clientVersionMin;
    }

    public UploadMcubeMiniPackageRequest setEnableKeepAlive(String enableKeepAlive) {
        this.enableKeepAlive = enableKeepAlive;
        return this;
    }
    public String getEnableKeepAlive() {
        return this.enableKeepAlive;
    }

    public UploadMcubeMiniPackageRequest setEnableOptionMenu(String enableOptionMenu) {
        this.enableOptionMenu = enableOptionMenu;
        return this;
    }
    public String getEnableOptionMenu() {
        return this.enableOptionMenu;
    }

    public UploadMcubeMiniPackageRequest setEnableTabBar(Long enableTabBar) {
        this.enableTabBar = enableTabBar;
        return this;
    }
    public Long getEnableTabBar() {
        return this.enableTabBar;
    }

    public UploadMcubeMiniPackageRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public UploadMcubeMiniPackageRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public UploadMcubeMiniPackageRequest setH5Name(String h5Name) {
        this.h5Name = h5Name;
        return this;
    }
    public String getH5Name() {
        return this.h5Name;
    }

    public UploadMcubeMiniPackageRequest setH5Version(String h5Version) {
        this.h5Version = h5Version;
        return this;
    }
    public String getH5Version() {
        return this.h5Version;
    }

    public UploadMcubeMiniPackageRequest setIconFileUrl(String iconFileUrl) {
        this.iconFileUrl = iconFileUrl;
        return this;
    }
    public String getIconFileUrl() {
        return this.iconFileUrl;
    }

    public UploadMcubeMiniPackageRequest setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public UploadMcubeMiniPackageRequest setInstallType(Long installType) {
        this.installType = installType;
        return this;
    }
    public Long getInstallType() {
        return this.installType;
    }

    public UploadMcubeMiniPackageRequest setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
        return this;
    }
    public String getMainUrl() {
        return this.mainUrl;
    }

    public UploadMcubeMiniPackageRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public UploadMcubeMiniPackageRequest setPackageType(Long packageType) {
        this.packageType = packageType;
        return this;
    }
    public Long getPackageType() {
        return this.packageType;
    }

    public UploadMcubeMiniPackageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public UploadMcubeMiniPackageRequest setResourceFileUrl(String resourceFileUrl) {
        this.resourceFileUrl = resourceFileUrl;
        return this;
    }
    public String getResourceFileUrl() {
        return this.resourceFileUrl;
    }

    public UploadMcubeMiniPackageRequest setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public UploadMcubeMiniPackageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UploadMcubeMiniPackageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UploadMcubeMiniPackageRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UploadMcubeMiniPackageRequest setVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }
    public String getVhost() {
        return this.vhost;
    }

    public UploadMcubeMiniPackageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
