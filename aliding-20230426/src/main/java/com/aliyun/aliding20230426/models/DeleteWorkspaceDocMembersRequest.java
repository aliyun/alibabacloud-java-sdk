// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceDocMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<DeleteWorkspaceDocMembersRequestMembers> members;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YRBGv0xxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TenantContext")
    public DeleteWorkspaceDocMembersRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YRBGvyxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceDocMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceDocMembersRequest self = new DeleteWorkspaceDocMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceDocMembersRequest setMembers(java.util.List<DeleteWorkspaceDocMembersRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<DeleteWorkspaceDocMembersRequestMembers> getMembers() {
        return this.members;
    }

    public DeleteWorkspaceDocMembersRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DeleteWorkspaceDocMembersRequest setTenantContext(DeleteWorkspaceDocMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteWorkspaceDocMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public DeleteWorkspaceDocMembersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class DeleteWorkspaceDocMembersRequestMembers extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        public static DeleteWorkspaceDocMembersRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceDocMembersRequestMembers self = new DeleteWorkspaceDocMembersRequestMembers();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceDocMembersRequestMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DeleteWorkspaceDocMembersRequestMembers setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

    }

    public static class DeleteWorkspaceDocMembersRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteWorkspaceDocMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteWorkspaceDocMembersRequestTenantContext self = new DeleteWorkspaceDocMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteWorkspaceDocMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
