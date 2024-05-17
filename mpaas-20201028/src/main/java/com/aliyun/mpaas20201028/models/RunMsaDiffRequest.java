// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RunMsaDiffRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMsaDiffRunJsonStr")
    public String mpaasMappcenterMsaDiffRunJsonStr;

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

    public static RunMsaDiffRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMsaDiffRequest self = new RunMsaDiffRequest();
        return TeaModel.build(map, self);
    }

    public RunMsaDiffRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunMsaDiffRequest setMpaasMappcenterMsaDiffRunJsonStr(String mpaasMappcenterMsaDiffRunJsonStr) {
        this.mpaasMappcenterMsaDiffRunJsonStr = mpaasMappcenterMsaDiffRunJsonStr;
        return this;
    }
    public String getMpaasMappcenterMsaDiffRunJsonStr() {
        return this.mpaasMappcenterMsaDiffRunJsonStr;
    }

    public RunMsaDiffRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RunMsaDiffRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
