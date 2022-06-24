// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUpdateActiveSceneRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiUpdateActiveSceneReqJsonStr")
    public String mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiUpdateActiveSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUpdateActiveSceneRequest self = new OpenApiUpdateActiveSceneRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiUpdateActiveSceneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiUpdateActiveSceneRequest setMpaasMqcpOpenApiUpdateActiveSceneReqJsonStr(String mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr) {
        this.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr = mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiUpdateActiveSceneReqJsonStr() {
        return this.mpaasMqcpOpenApiUpdateActiveSceneReqJsonStr;
    }

    public OpenApiUpdateActiveSceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiUpdateActiveSceneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
