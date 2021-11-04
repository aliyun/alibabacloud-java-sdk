// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetApprovalDetailResponseBody extends TeaModel {
    @NameInMap("ApprovalDetail")
    public GetApprovalDetailResponseBodyApprovalDetail approvalDetail;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("AuditUserIdList")
        public GetApprovalDetailResponseBodyApprovalDetailWorkflowNodesWorkflowNodeAuditUserIdList auditUserIdList;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("OperateComment")
        public String operateComment;

        @NameInMap("OperateTime")
        public String operateTime;

        @NameInMap("OperatorId")
        public Long operatorId;

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
        @NameInMap("AuditId")
        public Long auditId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CurrentHandlers")
        public GetApprovalDetailResponseBodyApprovalDetailCurrentHandlers currentHandlers;

        @NameInMap("Description")
        public String description;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("ReasonList")
        public GetApprovalDetailResponseBodyApprovalDetailReasonList reasonList;

        @NameInMap("Title")
        public String title;

        @NameInMap("WorkflowInsCode")
        public String workflowInsCode;

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
