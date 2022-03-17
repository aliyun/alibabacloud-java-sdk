// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiDecodeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiDecodeRequestJsonStr")
    public String mpaasMqcpOpenApiDecodeRequestJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiDecodeRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiDecodeRequest self = new OpenApiDecodeRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiDecodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiDecodeRequest setMpaasMqcpOpenApiDecodeRequestJsonStr(String mpaasMqcpOpenApiDecodeRequestJsonStr) {
        this.mpaasMqcpOpenApiDecodeRequestJsonStr = mpaasMqcpOpenApiDecodeRequestJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiDecodeRequestJsonStr() {
        return this.mpaasMqcpOpenApiDecodeRequestJsonStr;
    }

    public OpenApiDecodeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiDecodeRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
