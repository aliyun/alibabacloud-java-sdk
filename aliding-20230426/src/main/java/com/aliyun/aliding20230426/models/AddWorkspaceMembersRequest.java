// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceMembersRequest extends TeaModel {
    @NameInMap("Members")
    public java.util.List<AddWorkspaceMembersRequestMembers> members;

    @NameInMap("TenantContext")
    public AddWorkspaceMembersRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddWorkspaceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMembersRequest self = new AddWorkspaceMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMembersRequest setMembers(java.util.List<AddWorkspaceMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<AddWorkspaceMembersRequestMembers> getMembers() {
        return this.members;
    }

    public AddWorkspaceMembersRequest setTenantContext(AddWorkspaceMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddWorkspaceMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public AddWorkspaceMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AddWorkspaceMembersRequestMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <strong>example:</strong>
         * <p>EDITOR</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static AddWorkspaceMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceMembersRequestMembers self = new AddWorkspaceMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public AddWorkspaceMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public AddWorkspaceMembersRequestMembers setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class AddWorkspaceMembersRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AddWorkspaceMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceMembersRequestTenantContext self = new AddWorkspaceMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
