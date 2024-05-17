// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpEventAttributeByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MpaasMappcenterMcdpEventAttributeDeleteJsonStr")
    public String mpaasMappcenterMcdpEventAttributeDeleteJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMcdpEventAttributeByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpEventAttributeByIdRequest self = new DeleteMcdpEventAttributeByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpEventAttributeByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMcdpEventAttributeByIdRequest setMpaasMappcenterMcdpEventAttributeDeleteJsonStr(String mpaasMappcenterMcdpEventAttributeDeleteJsonStr) {
        this.mpaasMappcenterMcdpEventAttributeDeleteJsonStr = mpaasMappcenterMcdpEventAttributeDeleteJsonStr;
        return this;
    }
    public String getMpaasMappcenterMcdpEventAttributeDeleteJsonStr() {
        return this.mpaasMappcenterMcdpEventAttributeDeleteJsonStr;
    }

    public DeleteMcdpEventAttributeByIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMcdpEventAttributeByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
