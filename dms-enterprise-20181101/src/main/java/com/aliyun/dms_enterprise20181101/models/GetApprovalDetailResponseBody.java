// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetApprovalDetailResponseBody extends TeaModel {
    /**
     * <p>The approval details of the ticket.</p>
     */
    @NameInMap("ApprovalDetail")
    public GetApprovalDetailResponseBodyApprovalDetail approvalDetail;

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
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
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
        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The nickname of the user.</p>
         */
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
        /**
         * <p>The IDs of the approvers.</p>
         */
        @NameInMap("AuditUserIdList")
        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList auditUserIdList;

        /**
         * <p>The name of the approval node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The remarks of the approval.</p>
         */
        @NameInMap("OperateComment")
        public String operateComment;

        /**
         * <p>The time when the ticket was submitted.</p>
         */
        @NameInMap("OperateTime")
        public String operateTime;

        /**
         * <p>The ID of the user who submitted the ticket.</p>
         */
        @NameInMap("OperatorId")
        public Long operatorId;

        /**
         * <p>The approval status of the ticket. Valid values:</p>
         * <br>
         * <p>*   **START**: The ticket was submitted.</p>
         * <p>*   **ERROR**: An error occurred.</p>
         * <p>*   **AUDITING**: The ticket is being reviewed.</p>
         * <p>*   **REJECT**: The ticket was rejected.</p>
         * <p>*   **CANCEL**: The ticket was revoked.</p>
         * <p>*   **APPROVED**: The ticket was approved.</p>
         */
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
        /**
         * <p>The ID of the approval process.</p>
         */
        @NameInMap("AuditId")
        public Long auditId;

        /**
         * <p>The time when the approval process was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The information about the approver.</p>
         */
        @NameInMap("CurrentHandlers")
        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers currentHandlers;

        /**
         * <p>The description of the approval process.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ticket.</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The type of the ticket. Valid values:</p>
         * <br>
         * <p>*   **NDDL**: a schema design ticket</p>
         * <p>*   **DATA_TRACK**: a data tracking ticket</p>
         * <p>*   **TABLE_SYNC**: a table synchronization ticket</p>
         * <p>*   **PERM_APPLY**: a permission application ticket</p>
         * <p>*   **DATA_EXPORT**: a data export ticket</p>
         * <p>*   **DATA_CORRECT**: a data change ticket</p>
         * <p>*   **OWNER_APPLY**: an owner role application ticket</p>
         * <p>*   **SENSITIVITY**: a column sensitivity level change ticket</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The reasons for the approval.</p>
         */
        @NameInMap("ReasonList")
        public GetApprovalDetailResponseBodyApprovalDetailReasonList reasonList;

        /**
         * <p>The ID of the workflow template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The title of the approval process.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The approval status of the ticket. Valid values:</p>
         * <br>
         * <p>*   **AUDITING**: The ticket is being reviewed.</p>
         * <p>*   **REJECT**: The ticket was rejected.</p>
         * <p>*   **CANCEL**: The ticket was revoked.</p>
         * <p>*   **APPROVED**: The ticket was approved.</p>
         * <br>
         * <p>> An approval process contains multiple approval nodes, and this parameter is returned for each approval node.</p>
         */
        @NameInMap("WorkflowInsCode")
        public String workflowInsCode;

        /**
         * <p>The details of approval nodes.</p>
         */
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
