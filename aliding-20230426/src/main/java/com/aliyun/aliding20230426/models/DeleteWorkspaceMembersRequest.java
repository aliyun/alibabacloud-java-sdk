// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMembersRequest extends TeaModel {
    @NameInMap("Members")
    public java.util.List<DeleteWorkspaceMembersRequestMembers> members;

    @NameInMap("TenantContext")
    public DeleteWorkspaceMembersRequestTenantContext tenantContext;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMembersRequest self = new DeleteWorkspaceMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMembersRequest setMembers(java.util.List<DeleteWorkspaceMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<DeleteWorkspaceMembersRequestMembers> getMembers() {
        return this.members;
    }

    public DeleteWorkspaceMembersRequest setTenantContext(DeleteWorkspaceMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteWorkspaceMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteWorkspaceMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class DeleteWorkspaceMembersRequestMembers extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberType")
        public String memberType;

        public static DeleteWorkspaceMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceMembersRequestMembers self = new DeleteWorkspaceMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DeleteWorkspaceMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

    public static class DeleteWorkspaceMembersRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteWorkspaceMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceMembersRequestTenantContext self = new DeleteWorkspaceMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
