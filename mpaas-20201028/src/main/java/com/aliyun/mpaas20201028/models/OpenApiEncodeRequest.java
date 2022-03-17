// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiEncodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiEncodeRequestJsonStr")
    public String mpaasMqcpOpenApiEncodeRequestJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiEncodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiEncodeRequest self = new OpenApiEncodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiEncodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiEncodeRequest setMpaasMqcpOpenApiEncodeRequestJsonStr(String mpaasMqcpOpenApiEncodeRequestJsonStr) {
        this.mpaasMqcpOpenApiEncodeRequestJsonStr = mpaasMqcpOpenApiEncodeRequestJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiEncodeRequestJsonStr() {
        return this.mpaasMqcpOpenApiEncodeRequestJsonStr;
    }

    public OpenApiEncodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiEncodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
