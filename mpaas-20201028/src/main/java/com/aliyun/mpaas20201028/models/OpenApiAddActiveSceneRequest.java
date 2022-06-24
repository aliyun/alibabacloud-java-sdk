// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiAddActiveSceneRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiAddActiveSceneReqJsonStr")
    public String mpaasMqcpOpenApiAddActiveSceneReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiAddActiveSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiAddActiveSceneRequest self = new OpenApiAddActiveSceneRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiAddActiveSceneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiAddActiveSceneRequest setMpaasMqcpOpenApiAddActiveSceneReqJsonStr(String mpaasMqcpOpenApiAddActiveSceneReqJsonStr) {
        this.mpaasMqcpOpenApiAddActiveSceneReqJsonStr = mpaasMqcpOpenApiAddActiveSceneReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiAddActiveSceneReqJsonStr() {
        return this.mpaasMqcpOpenApiAddActiveSceneReqJsonStr;
    }

    public OpenApiAddActiveSceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiAddActiveSceneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
