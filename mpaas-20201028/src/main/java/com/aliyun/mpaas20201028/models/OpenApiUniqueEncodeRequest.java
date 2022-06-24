// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUniqueEncodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiUniqueEncodeRequestJsonStr")
    public String mpaasMqcpOpenApiUniqueEncodeRequestJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiUniqueEncodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUniqueEncodeRequest self = new OpenApiUniqueEncodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiUniqueEncodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiUniqueEncodeRequest setMpaasMqcpOpenApiUniqueEncodeRequestJsonStr(String mpaasMqcpOpenApiUniqueEncodeRequestJsonStr) {
        this.mpaasMqcpOpenApiUniqueEncodeRequestJsonStr = mpaasMqcpOpenApiUniqueEncodeRequestJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiUniqueEncodeRequestJsonStr() {
        return this.mpaasMqcpOpenApiUniqueEncodeRequestJsonStr;
    }

    public OpenApiUniqueEncodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiUniqueEncodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
