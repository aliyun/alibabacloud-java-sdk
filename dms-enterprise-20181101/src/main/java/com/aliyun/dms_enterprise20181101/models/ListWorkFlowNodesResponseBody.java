// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowNodesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of approval nodes.</p>
     */
    @NameInMap("WorkflowNodes")
    public ListWorkFlowNodesResponseBodyWorkflowNodes workflowNodes;

    public static ListWorkFlowNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowNodesResponseBody self = new ListWorkFlowNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowNodesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkFlowNodesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListWorkFlowNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkFlowNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkFlowNodesResponseBody setWorkflowNodes(ListWorkFlowNodesResponseBodyWorkflowNodes workflowNodes) {
        this.workflowNodes = workflowNodes;
        return this;
    }
    public ListWorkFlowNodesResponseBodyWorkflowNodes getWorkflowNodes() {
        return this.workflowNodes;
    }

    public static class ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser extends TeaModel {
        /**
         * <p>The nickname of the approver.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The real name of the approver.</p>
         */
        @NameInMap("RealName")
        public String realName;

        /**
         * <p>The ID of the approver. The ID is different from the ID of the Alibaba Cloud account of the approver.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser self = new ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers extends TeaModel {
        @NameInMap("AuditUser")
        public java.util.List<ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser> auditUser;

        public static ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers self = new ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers setAuditUser(java.util.List<ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser> auditUser) {
            this.auditUser = auditUser;
            return this;
        }
        public java.util.List<ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser> getAuditUser() {
            return this.auditUser;
        }

    }

    public static class ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode extends TeaModel {
        /**
         * <p>The details about approvers.</p>
         */
        @NameInMap("AuditUsers")
        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers auditUsers;

        /**
         * <p>The description of the approval template.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the creator. This ID is different from the ID of the Alibaba Cloud account of the creator.</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <p>The name of the user who creates the approval node.</p>
         */
        @NameInMap("CreateUserNickName")
        public String createUserNickName;

        /**
         * <p>The ID of the approval node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the approval node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The type of the approval node. Valid values:</p>
         * <br>
         * <p>*   SYS: The approval node is predefined by the system.</p>
         * <p>*   USER_LIST: The approval node is created by a user.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode self = new ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setAuditUsers(ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers auditUsers) {
            this.auditUsers = auditUsers;
            return this;
        }
        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers getAuditUsers() {
            return this.auditUsers;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setCreateUserNickName(String createUserNickName) {
            this.createUserNickName = createUserNickName;
            return this;
        }
        public String getCreateUserNickName() {
            return this.createUserNickName;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class ListWorkFlowNodesResponseBodyWorkflowNodes extends TeaModel {
        @NameInMap("WorkflowNode")
        public java.util.List<ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode> workflowNode;

        public static ListWorkFlowNodesResponseBodyWorkflowNodes build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowNodesResponseBodyWorkflowNodes self = new ListWorkFlowNodesResponseBodyWorkflowNodes();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodes setWorkflowNode(java.util.List<ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode> workflowNode) {
            this.workflowNode = workflowNode;
            return this;
        }
        public java.util.List<ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

    }

}
