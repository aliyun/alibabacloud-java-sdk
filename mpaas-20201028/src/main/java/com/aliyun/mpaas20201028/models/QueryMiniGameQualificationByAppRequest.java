// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMiniGameQualificationByAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
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

    public static QueryMiniGameQualificationByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniGameQualificationByAppRequest self = new QueryMiniGameQualificationByAppRequest();
        return TeaModel.build(map, self);
    }

    public QueryMiniGameQualificationByAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMiniGameQualificationByAppRequest setMiniProgramCode(String miniProgramCode) {
        this.miniProgramCode = miniProgramCode;
        return this;
    }
    public String getMiniProgramCode() {
        return this.miniProgramCode;
    }

    public QueryMiniGameQualificationByAppRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMiniGameQualificationByAppRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
