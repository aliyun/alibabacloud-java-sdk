// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiDeleteActiveCodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiDeleteActiveCodeReqJsonStr")
    public String mpaasMqcpOpenApiDeleteActiveCodeReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiDeleteActiveCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiDeleteActiveCodeRequest self = new OpenApiDeleteActiveCodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiDeleteActiveCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiDeleteActiveCodeRequest setMpaasMqcpOpenApiDeleteActiveCodeReqJsonStr(String mpaasMqcpOpenApiDeleteActiveCodeReqJsonStr) {
        this.mpaasMqcpOpenApiDeleteActiveCodeReqJsonStr = mpaasMqcpOpenApiDeleteActiveCodeReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiDeleteActiveCodeReqJsonStr() {
        return this.mpaasMqcpOpenApiDeleteActiveCodeReqJsonStr;
    }

    public OpenApiDeleteActiveCodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiDeleteActiveCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
