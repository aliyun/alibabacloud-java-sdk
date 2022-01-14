// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMasFileOperationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OnexFlag")
    public Boolean onexFlag;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMasFileOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMasFileOperationRequest self = new QueryMasFileOperationRequest();
        return TeaModel.build(map, self);
    }

    public QueryMasFileOperationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMasFileOperationRequest setOnexFlag(Boolean onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    public QueryMasFileOperationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMasFileOperationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
