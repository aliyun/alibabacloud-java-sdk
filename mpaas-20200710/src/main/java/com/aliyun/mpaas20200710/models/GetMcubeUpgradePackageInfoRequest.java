// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class GetMcubeUpgradePackageInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMcubeUpgradePackageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMcubeUpgradePackageInfoRequest self = new GetMcubeUpgradePackageInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMcubeUpgradePackageInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMcubeUpgradePackageInfoRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public GetMcubeUpgradePackageInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMcubeUpgradePackageInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
