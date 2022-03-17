// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiAddActiveCodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiAddActiveCodeReqJsonStr")
    public String mpaasMqcpOpenApiAddActiveCodeReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiAddActiveCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiAddActiveCodeRequest self = new OpenApiAddActiveCodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiAddActiveCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiAddActiveCodeRequest setMpaasMqcpOpenApiAddActiveCodeReqJsonStr(String mpaasMqcpOpenApiAddActiveCodeReqJsonStr) {
        this.mpaasMqcpOpenApiAddActiveCodeReqJsonStr = mpaasMqcpOpenApiAddActiveCodeReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiAddActiveCodeReqJsonStr() {
        return this.mpaasMqcpOpenApiAddActiveCodeReqJsonStr;
    }

    public OpenApiAddActiveCodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiAddActiveCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
