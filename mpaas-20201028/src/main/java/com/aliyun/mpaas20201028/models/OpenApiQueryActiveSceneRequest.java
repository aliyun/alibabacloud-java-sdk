// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiQueryActiveSceneRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMqcpOpenApiQueryActiveSceneReqJsonStr")
    public String mpaasMqcpOpenApiQueryActiveSceneReqJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static OpenApiQueryActiveSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenApiQueryActiveSceneRequest self = new OpenApiQueryActiveSceneRequest();
        return TeaModel.build(map, self);
    }

    public OpenApiQueryActiveSceneRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public OpenApiQueryActiveSceneRequest setMpaasMqcpOpenApiQueryActiveSceneReqJsonStr(String mpaasMqcpOpenApiQueryActiveSceneReqJsonStr) {
        this.mpaasMqcpOpenApiQueryActiveSceneReqJsonStr = mpaasMqcpOpenApiQueryActiveSceneReqJsonStr;
        return this;
    }
    public String getMpaasMqcpOpenApiQueryActiveSceneReqJsonStr() {
        return this.mpaasMqcpOpenApiQueryActiveSceneReqJsonStr;
    }

    public OpenApiQueryActiveSceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenApiQueryActiveSceneRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
