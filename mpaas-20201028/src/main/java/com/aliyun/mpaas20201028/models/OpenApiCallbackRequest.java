// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiCallbackRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiCallbackRequestJsonStr")
    public String mpaasMqcpOpenApiCallbackRequestJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiCallbackRequest self = new OpenApiCallbackRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiCallbackRequest setMpaasMqcpOpenApiCallbackRequestJsonStr(String mpaasMqcpOpenApiCallbackRequestJsonStr) {
        this.mpaasMqcpOpenApiCallbackRequestJsonStr = mpaasMqcpOpenApiCallbackRequestJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiCallbackRequestJsonStr() {
        return this.mpaasMqcpOpenApiCallbackRequestJsonStr;
    }

    public OpenApiCallbackRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiCallbackRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
