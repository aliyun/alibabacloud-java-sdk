// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniPackagesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("H5Id")
    public String h5Id;

    @NameInMap("PackageTypes")
    public String packageTypes;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMcubeMiniPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniPackagesRequest self = new ListMcubeMiniPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniPackagesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMcubeMiniPackagesRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public ListMcubeMiniPackagesRequest setPackageTypes(String packageTypes) {
        this.packageTypes = packageTypes;
        return this;
    }
    public String getPackageTypes() {
        return this.packageTypes;
    }

    public ListMcubeMiniPackagesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListMcubeMiniPackagesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
