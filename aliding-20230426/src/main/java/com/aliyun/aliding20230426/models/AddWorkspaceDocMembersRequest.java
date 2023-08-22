// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceDocMembersRequest extends TeaModel {
    @NameInMap("Members")
    public java.util.List<AddWorkspaceDocMembersRequestMembers> members;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TenantContext")
    public AddWorkspaceDocMembersRequestTenantContext tenantContext;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddWorkspaceDocMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceDocMembersRequest self = new AddWorkspaceDocMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceDocMembersRequest setMembers(java.util.List<AddWorkspaceDocMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<AddWorkspaceDocMembersRequestMembers> getMembers() {
        return this.members;
    }

    public AddWorkspaceDocMembersRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AddWorkspaceDocMembersRequest setTenantContext(AddWorkspaceDocMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddWorkspaceDocMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public AddWorkspaceDocMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AddWorkspaceDocMembersRequestMembers extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberType")
        public String memberType;

        @NameInMap("RoleType")
        public String roleType;

        public static AddWorkspaceDocMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceDocMembersRequestMembers self = new AddWorkspaceDocMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceDocMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public AddWorkspaceDocMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public AddWorkspaceDocMembersRequestMembers setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class AddWorkspaceDocMembersRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static AddWorkspaceDocMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceDocMembersRequestTenantContext self = new AddWorkspaceDocMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceDocMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
