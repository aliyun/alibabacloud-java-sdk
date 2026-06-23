// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsCubeTemplateRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteMdsCubeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsCubeTemplateRequest self = new DeleteMdsCubeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMdsCubeTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteMdsCubeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DeleteMdsCubeTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteMdsCubeTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
