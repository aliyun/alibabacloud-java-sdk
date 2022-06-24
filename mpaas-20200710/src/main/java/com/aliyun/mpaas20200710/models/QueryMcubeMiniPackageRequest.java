// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniPackageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("H5Id")
    public String h5Id;

    @NameInMap("Id")
    public String id;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMcubeMiniPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniPackageRequest self = new QueryMcubeMiniPackageRequest();
        return TeaModel.build(map, self);
    }

    public QueryMcubeMiniPackageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMcubeMiniPackageRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public QueryMcubeMiniPackageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryMcubeMiniPackageRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMcubeMiniPackageRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
