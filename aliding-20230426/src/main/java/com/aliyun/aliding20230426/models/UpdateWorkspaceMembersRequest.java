// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<UpdateWorkspaceMembersRequestMembers> members;

    @NameInMap("TenantContext")
    public UpdateWorkspaceMembersRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceMembersRequest self = new UpdateWorkspaceMembersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceMembersRequest setMembers(java.util.List<UpdateWorkspaceMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<UpdateWorkspaceMembersRequestMembers> getMembers() {
        return this.members;
    }

    public UpdateWorkspaceMembersRequest setTenantContext(UpdateWorkspaceMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateWorkspaceMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateWorkspaceMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateWorkspaceMembersRequestMembers extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static UpdateWorkspaceMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceMembersRequestMembers self = new UpdateWorkspaceMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public UpdateWorkspaceMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public UpdateWorkspaceMembersRequestMembers setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class UpdateWorkspaceMembersRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateWorkspaceMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceMembersRequestTenantContext self = new UpdateWorkspaceMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
