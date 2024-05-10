// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public CreateWorkspaceRequestTenantContext tenantContext;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkspaceRequest setTenantContext(CreateWorkspaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateWorkspaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CreateWorkspaceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateWorkspaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestTenantContext self = new CreateWorkspaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
