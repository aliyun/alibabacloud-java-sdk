// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateWorkspaceDocRequest extends TeaModel {
    @NameInMap("DocType")
    public String docType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentNodeId")
    public String parentNodeId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("TenantContext")
    public CreateWorkspaceDocRequestTenantContext tenantContext;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateWorkspaceDocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceDocRequest self = new CreateWorkspaceDocRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceDocRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public CreateWorkspaceDocRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkspaceDocRequest setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public CreateWorkspaceDocRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateWorkspaceDocRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CreateWorkspaceDocRequest setTenantContext(CreateWorkspaceDocRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateWorkspaceDocRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateWorkspaceDocRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateWorkspaceDocRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateWorkspaceDocRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceDocRequestTenantContext self = new CreateWorkspaceDocRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceDocRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
