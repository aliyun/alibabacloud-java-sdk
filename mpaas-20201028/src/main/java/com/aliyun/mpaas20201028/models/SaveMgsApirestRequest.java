// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveMgsApirestRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMgsApirestSaveJsonStr")
    public String mpaasMappcenterMgsApirestSaveJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SaveMgsApirestRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMgsApirestRequest self = new SaveMgsApirestRequest();
        return TeaModel.build(map, self);
    }

    public SaveMgsApirestRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveMgsApirestRequest setMpaasMappcenterMgsApirestSaveJsonStr(String mpaasMappcenterMgsApirestSaveJsonStr) {
        this.mpaasMappcenterMgsApirestSaveJsonStr = mpaasMappcenterMgsApirestSaveJsonStr;
        return this;
    }
    public String getMpaasMappcenterMgsApirestSaveJsonStr() {
        return this.mpaasMappcenterMgsApirestSaveJsonStr;
    }

    public SaveMgsApirestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveMgsApirestRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
