// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsTestreqbodyautogenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Format")
    public String format;

    @NameInMap("MpaasMappcenterMgsTestreqbodyautogenQueryJsonStr")
    public String mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMgsTestreqbodyautogenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsTestreqbodyautogenRequest self = new QueryMgsTestreqbodyautogenRequest();
        return TeaModel.build(map, self);
    }

    public QueryMgsTestreqbodyautogenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMgsTestreqbodyautogenRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public QueryMgsTestreqbodyautogenRequest setMpaasMappcenterMgsTestreqbodyautogenQueryJsonStr(String mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr) {
        this.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr = mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;
        return this;
    }
    public String getMpaasMappcenterMgsTestreqbodyautogenQueryJsonStr() {
        return this.mpaasMappcenterMgsTestreqbodyautogenQueryJsonStr;
    }

    public QueryMgsTestreqbodyautogenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMgsTestreqbodyautogenRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
