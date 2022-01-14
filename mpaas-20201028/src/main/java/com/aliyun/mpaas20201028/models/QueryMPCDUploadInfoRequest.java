// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMPCDUploadInfoRequest extends TeaModel {
    // 前端传来的 appid
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    // uploadTaskId
    @NameInMap("UploadTaskId")
    public Long uploadTaskId;

    // 前端传来的 workspaceId
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMPCDUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMPCDUploadInfoRequest self = new QueryMPCDUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMPCDUploadInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMPCDUploadInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMPCDUploadInfoRequest setUploadTaskId(Long uploadTaskId) {
        this.uploadTaskId = uploadTaskId;
        return this;
    }
    public Long getUploadTaskId() {
        return this.uploadTaskId;
    }

    public QueryMPCDUploadInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
