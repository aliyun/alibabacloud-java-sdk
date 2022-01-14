// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaResourceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoInstall")
    public Integer autoInstall;

    @NameInMap("ClientVersionMax")
    public String clientVersionMax;

    @NameInMap("ClientVersionMin")
    public String clientVersionMin;

    @NameInMap("CustomDomainName")
    public String customDomainName;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("H5Id")
    public String h5Id;

    @NameInMap("H5Name")
    public String h5Name;

    @NameInMap("H5Version")
    public String h5Version;

    @NameInMap("InstallType")
    public Integer installType;

    @NameInMap("MainUrl")
    public String mainUrl;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("RepeatNebula")
    public Integer repeatNebula;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("SubUrl")
    public String subUrl;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Vhost")
    public String vhost;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMcubeNebulaResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaResourceRequest self = new CreateMcubeNebulaResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMcubeNebulaResourceRequest setAutoInstall(Integer autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Integer getAutoInstall() {
        return this.autoInstall;
    }

    public CreateMcubeNebulaResourceRequest setClientVersionMax(String clientVersionMax) {
        this.clientVersionMax = clientVersionMax;
        return this;
    }
    public String getClientVersionMax() {
        return this.clientVersionMax;
    }

    public CreateMcubeNebulaResourceRequest setClientVersionMin(String clientVersionMin) {
        this.clientVersionMin = clientVersionMin;
        return this;
    }
    public String getClientVersionMin() {
        return this.clientVersionMin;
    }

    public CreateMcubeNebulaResourceRequest setCustomDomainName(String customDomainName) {
        this.customDomainName = customDomainName;
        return this;
    }
    public String getCustomDomainName() {
        return this.customDomainName;
    }

    public CreateMcubeNebulaResourceRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreateMcubeNebulaResourceRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateMcubeNebulaResourceRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public CreateMcubeNebulaResourceRequest setH5Name(String h5Name) {
        this.h5Name = h5Name;
        return this;
    }
    public String getH5Name() {
        return this.h5Name;
    }

    public CreateMcubeNebulaResourceRequest setH5Version(String h5Version) {
        this.h5Version = h5Version;
        return this;
    }
    public String getH5Version() {
        return this.h5Version;
    }

    public CreateMcubeNebulaResourceRequest setInstallType(Integer installType) {
        this.installType = installType;
        return this;
    }
    public Integer getInstallType() {
        return this.installType;
    }

    public CreateMcubeNebulaResourceRequest setMainUrl(String mainUrl) {
        this.mainUrl = mainUrl;
        return this;
    }
    public String getMainUrl() {
        return this.mainUrl;
    }

    public CreateMcubeNebulaResourceRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public CreateMcubeNebulaResourceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateMcubeNebulaResourceRequest setRepeatNebula(Integer repeatNebula) {
        this.repeatNebula = repeatNebula;
        return this;
    }
    public Integer getRepeatNebula() {
        return this.repeatNebula;
    }

    public CreateMcubeNebulaResourceRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public CreateMcubeNebulaResourceRequest setSubUrl(String subUrl) {
        this.subUrl = subUrl;
        return this;
    }
    public String getSubUrl() {
        return this.subUrl;
    }

    public CreateMcubeNebulaResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMcubeNebulaResourceRequest setVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }
    public String getVhost() {
        return this.vhost;
    }

    public CreateMcubeNebulaResourceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
