// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMiniGameInfoByAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MiniProgramCode")
    public String miniProgramCode;

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

    public static QueryMiniGameInfoByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniGameInfoByAppRequest self = new QueryMiniGameInfoByAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryMiniGameInfoByAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMiniGameInfoByAppRequest setMiniProgramCode(String miniProgramCode) {
        this.miniProgramCode = miniProgramCode;
        return this;
    }
    public String getMiniProgramCode() {
        return this.miniProgramCode;
    }

    public QueryMiniGameInfoByAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMiniGameInfoByAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
