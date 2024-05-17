// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsaEnhanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMsaEnhanceCreateJsonStr")
    public String mpaasMappcenterMsaEnhanceCreateJsonStr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateMsaEnhanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMsaEnhanceRequest self = new CreateMsaEnhanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateMsaEnhanceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMsaEnhanceRequest setMpaasMappcenterMsaEnhanceCreateJsonStr(String mpaasMappcenterMsaEnhanceCreateJsonStr) {
        this.mpaasMappcenterMsaEnhanceCreateJsonStr = mpaasMappcenterMsaEnhanceCreateJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsaEnhanceCreateJsonStr() {
        return this.mpaasMappcenterMsaEnhanceCreateJsonStr;
    }

    public CreateMsaEnhanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateMsaEnhanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
