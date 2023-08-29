// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Option")
    public AddWorkspaceRequestOption option;

    @NameInMap("TenantContext")
    public AddWorkspaceRequestTenantContext tenantContext;

    public static AddWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceRequest self = new AddWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWorkspaceRequest setOption(AddWorkspaceRequestOption option) {
        this.option = option;
        return this;
    }
    public AddWorkspaceRequestOption getOption() {
        return this.option;
    }

    public AddWorkspaceRequest setTenantContext(AddWorkspaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddWorkspaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class AddWorkspaceRequestOption extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("TeamId")
        public String teamId;

        public static AddWorkspaceRequestOption build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceRequestOption self = new AddWorkspaceRequestOption();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceRequestOption setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddWorkspaceRequestOption setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

    }

    public static class AddWorkspaceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static AddWorkspaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceRequestTenantContext self = new AddWorkspaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
