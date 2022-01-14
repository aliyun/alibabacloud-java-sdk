// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageAppMappingRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsacCreateStageAppMappingJsonStr")
    public String mpaasMappcenterMsacCreateStageAppMappingJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsacStageAppMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacStageAppMappingRequest self = new CreateMsacStageAppMappingRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsacStageAppMappingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsacStageAppMappingRequest setMpaasMappcenterMsacCreateStageAppMappingJsonStr(String mpaasMappcenterMsacCreateStageAppMappingJsonStr) {
        this.mpaasMappcenterMsacCreateStageAppMappingJsonStr = mpaasMappcenterMsacCreateStageAppMappingJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsacCreateStageAppMappingJsonStr() {
        return this.mpaasMappcenterMsacCreateStageAppMappingJsonStr;
    }

    public CreateMsacStageAppMappingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsacStageAppMappingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
