// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiQueryActiveCodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiQueryActiveCodeReqJsonStr")
    public String mpaasMqcpOpenApiQueryActiveCodeReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiQueryActiveCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiQueryActiveCodeRequest self = new OpenApiQueryActiveCodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiQueryActiveCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiQueryActiveCodeRequest setMpaasMqcpOpenApiQueryActiveCodeReqJsonStr(String mpaasMqcpOpenApiQueryActiveCodeReqJsonStr) {
        this.mpaasMqcpOpenApiQueryActiveCodeReqJsonStr = mpaasMqcpOpenApiQueryActiveCodeReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiQueryActiveCodeReqJsonStr() {
        return this.mpaasMqcpOpenApiQueryActiveCodeReqJsonStr;
    }

    public OpenApiQueryActiveCodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiQueryActiveCodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
