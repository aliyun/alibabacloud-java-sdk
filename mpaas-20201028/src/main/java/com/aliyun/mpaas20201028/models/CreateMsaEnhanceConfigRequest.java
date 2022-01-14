// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsaEnhanceConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("MpaasMappcenterMsaProtectconfigSaveJsonStr")
    public String mpaasMappcenterMsaProtectconfigSaveJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsaEnhanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsaEnhanceConfigRequest self = new CreateMsaEnhanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsaEnhanceConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsaEnhanceConfigRequest setMpaasMappcenterMsaProtectconfigSaveJsonStr(String mpaasMappcenterMsaProtectconfigSaveJsonStr) {
        this.mpaasMappcenterMsaProtectconfigSaveJsonStr = mpaasMappcenterMsaProtectconfigSaveJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsaProtectconfigSaveJsonStr() {
        return this.mpaasMappcenterMsaProtectconfigSaveJsonStr;
    }

    public CreateMsaEnhanceConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsaEnhanceConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
