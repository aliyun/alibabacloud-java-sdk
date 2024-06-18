// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceDocMembersRequest extends TeaModel {
    @NameInMap("Members")
    public java.util.List<UpdateWorkspaceDocMembersRequestMembers> members;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>node_feb8fea0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TenantContext")
    public UpdateWorkspaceDocMembersRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xb8bkxxxxxrXJNaL</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceDocMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceDocMembersRequest self = new UpdateWorkspaceDocMembersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceDocMembersRequest setMembers(java.util.List<UpdateWorkspaceDocMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<UpdateWorkspaceDocMembersRequestMembers> getMembers() {
        return this.members;
    }

    public UpdateWorkspaceDocMembersRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateWorkspaceDocMembersRequest setTenantContext(UpdateWorkspaceDocMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateWorkspaceDocMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateWorkspaceDocMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateWorkspaceDocMembersRequestMembers extends TeaModel {
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
         * <p>ONLY_VIEWER</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static UpdateWorkspaceDocMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceDocMembersRequestMembers self = new UpdateWorkspaceDocMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceDocMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public UpdateWorkspaceDocMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public UpdateWorkspaceDocMembersRequestMembers setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class UpdateWorkspaceDocMembersRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateWorkspaceDocMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceDocMembersRequestTenantContext self = new UpdateWorkspaceDocMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceDocMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
