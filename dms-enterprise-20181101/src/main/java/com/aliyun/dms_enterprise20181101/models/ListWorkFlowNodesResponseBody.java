// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("WorkflowNodes")
    public ListWorkFlowNodesResponseBodyWorkflowNodes workflowNodes;

    @NameInMap("Success")
    public Boolean success;

    public static ListWorkFlowNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowNodesResponseBody self = new ListWorkFlowNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListWorkFlowNodesResponseBody setWorkflowNodes(ListWorkFlowNodesResponseBodyWorkflowNodes workflowNodes) {
        this.workflowNodes = workflowNodes;
        return this;
    }
    public ListWorkFlowNodesResponseBodyWorkflowNodes getWorkflowNodes() {
        return this.workflowNodes;
    }

    public ListWorkFlowNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser extends TeaModel {
        @NameInMap("RealName")
        public String realName;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("NickName")
        public String nickName;

        public static ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser self = new ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser();
            return TeaModel.build(map, self);
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

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsersAuditUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
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
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateUserNickName")
        public String createUserNickName;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("AuditUsers")
        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers auditUsers;

        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode self = new ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setCreateUserNickName(String createUserNickName) {
            this.createUserNickName = createUserNickName;
            return this;
        }
        public String getCreateUserNickName() {
            return this.createUserNickName;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setAuditUsers(ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers auditUsers) {
            this.auditUsers = auditUsers;
            return this;
        }
        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNodeAuditUsers getAuditUsers() {
            return this.auditUsers;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListWorkFlowNodesResponseBodyWorkflowNodesWorkflowNode setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
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
