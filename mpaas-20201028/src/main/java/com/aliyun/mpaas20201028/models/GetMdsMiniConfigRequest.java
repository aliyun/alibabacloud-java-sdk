// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMdsMiniConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("H5Id")
    public String h5Id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetMdsMiniConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMdsMiniConfigRequest self = new GetMdsMiniConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetMdsMiniConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetMdsMiniConfigRequest setH5Id(String h5Id) {
        this.h5Id = h5Id;
        return this;
    }
    public String getH5Id() {
        return this.h5Id;
    }

    public GetMdsMiniConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetMdsMiniConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
