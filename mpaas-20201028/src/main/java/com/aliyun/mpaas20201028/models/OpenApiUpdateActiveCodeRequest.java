// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUpdateActiveCodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiUpdateActiveCodeReqJsonStr")
    public String mpaasMqcpOpenApiUpdateActiveCodeReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiUpdateActiveCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUpdateActiveCodeRequest self = new OpenApiUpdateActiveCodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiUpdateActiveCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiUpdateActiveCodeRequest setMpaasMqcpOpenApiUpdateActiveCodeReqJsonStr(String mpaasMqcpOpenApiUpdateActiveCodeReqJsonStr) {
        this.mpaasMqcpOpenApiUpdateActiveCodeReqJsonStr = mpaasMqcpOpenApiUpdateActiveCodeReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiUpdateActiveCodeReqJsonStr() {
        return this.mpaasMqcpOpenApiUpdateActiveCodeReqJsonStr;
    }

    public OpenApiUpdateActiveCodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiUpdateActiveCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
