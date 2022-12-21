// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetApprovalDetailResponseBody extends TeaModel {
    // The approval details of the ticket.
    @NameInMap("ApprovalDetail")
    public GetApprovalDetailResponseBodyApprovalDetail approvalDetail;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request fails.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetApprovalDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalDetailResponseBody self = new GetApprovalDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApprovalDetailResponseBody setApprovalDetail(GetApprovalDetailResponseBodyApprovalDetail approvalDetail) {
        this.approvalDetail = approvalDetail;
        return this;
    }
    public GetApprovalDetailResponseBodyApprovalDetail getApprovalDetail() {
        return this.approvalDetail;
    }

    public GetApprovalDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetApprovalDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetApprovalDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApprovalDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler extends TeaModel {
        // The ID of the user.
        @NameInMap("Id")
        public Long id;

        // The nickname of the user.
        @NameInMap("NickName")
        public String nickName;

        public static GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler self = new GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers extends TeaModel {
        @NameInMap("CurrentHandler")
        public java.util.List<GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler> currentHandler;

        public static GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers self = new GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers setCurrentHandler(java.util.List<GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler> currentHandler) {
            this.currentHandler = currentHandler;
            return this;
        }
        public java.util.List<GetApprovalDetailResponseBodyApprovalDetailCurrentHandlersCurrentHandler> getCurrentHandler() {
            return this.currentHandler;
        }

    }

    public static class GetApprovalDetailResponseBodyApprovalDetailReasonList extends TeaModel {
        @NameInMap("Reasons")
        public java.util.List<String> reasons;

        public static GetApprovalDetailResponseBodyApprovalDetailReasonList build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetailReasonList self = new GetApprovalDetailResponseBodyApprovalDetailReasonList();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetailReasonList setReasons(java.util.List<String> reasons) {
            this.reasons = reasons;
            return this;
        }
        public java.util.List<String> getReasons() {
            return this.reasons;
        }

    }

    public static class GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList extends TeaModel {
        @NameInMap("AuditUserIds")
        public java.util.List<String> auditUserIds;

        public static GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList self = new GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList setAuditUserIds(java.util.List<String> auditUserIds) {
            this.auditUserIds = auditUserIds;
            return this;
        }
        public java.util.List<String> getAuditUserIds() {
            return this.auditUserIds;
        }

    }

    public static class GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode extends TeaModel {
        // The IDs of the approvers.
        @NameInMap("AuditUserIdList")
        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList auditUserIdList;

        // The name of the approval node.
        @NameInMap("NodeName")
        public String nodeName;

        // The remarks of the approval.
        @NameInMap("OperateComment")
        public String operateComment;

        // The time when the ticket was submitted.
        @NameInMap("OperateTime")
        public String operateTime;

        // The ID of the user who submitted the ticket.
        @NameInMap("OperatorId")
        public Long operatorId;

        // The approval status of the ticket. Valid values:
        // 
        // *   **AUDITING**: The ticket is being processed.
        // *   **REJECT**: The ticket was rejected.
        // *   **CANCEL**: The ticket was revoked.
        // *   **APPROVED**: The ticket was approved.
        @NameInMap("WorkflowInsCode")
        public String workflowInsCode;

        public static GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode self = new GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode setAuditUserIdList(GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList auditUserIdList) {
            this.auditUserIdList = auditUserIdList;
            return this;
        }
        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList getAuditUserIdList() {
            return this.auditUserIdList;
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode setOperateComment(String operateComment) {
            this.operateComment = operateComment;
            return this;
        }
        public String getOperateComment() {
            return this.operateComment;
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode setOperatorId(Long operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public Long getOperatorId() {
            return this.operatorId;
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode setWorkflowInsCode(String workflowInsCode) {
            this.workflowInsCode = workflowInsCode;
            return this;
        }
        public String getWorkflowInsCode() {
            return this.workflowInsCode;
        }

    }

    public static class GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes extends TeaModel {
        @NameInMap("WorkflowNode")
        public java.util.List<GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode> workflowNode;

        public static GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes self = new GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes setWorkflowNode(java.util.List<GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode> workflowNode) {
            this.workflowNode = workflowNode;
            return this;
        }
        public java.util.List<GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

    }

    public static class GetApprovalDetailResponseBodyApprovalDetail extends TeaModel {
        // The ID of the approval process.
        @NameInMap("AuditId")
        public Long auditId;

        // The time when the approval process was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The information about the approver.
        @NameInMap("CurrentHandlers")
        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers currentHandlers;

        // The description of the approval process.
        @NameInMap("Description")
        public String description;

        // The ID of the ticket.
        @NameInMap("OrderId")
        public Long orderId;

        // The type of the ticket. Valid values:
        // 
        // - **NDDL**: The ticket is used to change the schema design.
        // - **DATA_TRACK**: The ticket is used to track data.
        // - **TABLE_SYNC**: The ticket is used to synchronize databases and tables.
        // - **PERM_APPLY**: The ticket is used to apply for permissions.
        // - **DATA_EXPORT**: The ticket is used to export data.
        // - **DATA_CORRECT**: The ticket is used to change data.
        // - **OWNER_APPLY**: The ticket is used to apply for the owner role of a resource.
        // - **SENSITIVITY**: The ticket is used to change column sensitivity levels.
        @NameInMap("OrderType")
        public String orderType;

        // The reason for the approval.
        @NameInMap("ReasonList")
        public GetApprovalDetailResponseBodyApprovalDetailReasonList reasonList;

        // The ID of the approval template.
        @NameInMap("TemplateId")
        public Long templateId;

        // The title of the approval process.
        @NameInMap("Title")
        public String title;

        // The approval status of the ticket. Valid values:
        // 
        // - **AUDITING**: The ticket is being processed.
        // - **REJECT**: The ticket was rejected.
        // - **CANCEL**: The ticket was revoked.
        // - **APPROVED**: The ticket was approved.
        // 
        // >  If an approval process contains multiple approval nodes, this parameter is returned for each approval node.
        @NameInMap("WorkflowInsCode")
        public String workflowInsCode;

        // The details of approval nodes.
        @NameInMap("WorkflowNodes")
        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes workflowNodes;

        public static GetApprovalDetailResponseBodyApprovalDetail build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalDetailResponseBodyApprovalDetail self = new GetApprovalDetailResponseBodyApprovalDetail();
            return TeaModel.build(map, self);
        }

        public GetApprovalDetailResponseBodyApprovalDetail setAuditId(Long auditId) {
            this.auditId = auditId;
            return this;
        }
        public Long getAuditId() {
            return this.auditId;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setCurrentHandlers(GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers currentHandlers) {
            this.currentHandlers = currentHandlers;
            return this;
        }
        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers getCurrentHandlers() {
            return this.currentHandlers;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setReasonList(GetApprovalDetailResponseBodyApprovalDetailReasonList reasonList) {
            this.reasonList = reasonList;
            return this;
        }
        public GetApprovalDetailResponseBodyApprovalDetailReasonList getReasonList() {
            return this.reasonList;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setWorkflowInsCode(String workflowInsCode) {
            this.workflowInsCode = workflowInsCode;
            return this;
        }
        public String getWorkflowInsCode() {
            return this.workflowInsCode;
        }

        public GetApprovalDetailResponseBodyApprovalDetail setWorkflowNodes(GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes workflowNodes) {
            this.workflowNodes = workflowNodes;
            return this;
        }
        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodes getWorkflowNodes() {
            return this.workflowNodes;
        }

    }

}
