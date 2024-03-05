// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListEnterpriseSupportPlanResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListEnterpriseSupportPlanResponseBodyData> data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListEnterpriseSupportPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseSupportPlanResponseBody self = new ListEnterpriseSupportPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseSupportPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnterpriseSupportPlanResponseBody setData(java.util.List<ListEnterpriseSupportPlanResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnterpriseSupportPlanResponseBodyData> getData() {
        return this.data;
    }

    public ListEnterpriseSupportPlanResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEnterpriseSupportPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnterpriseSupportPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseSupportPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnterpriseSupportPlanResponseBodyDataDocs extends TeaModel {
        @NameInMap("docId")
        public Long docId;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("freeOrderApplyCode")
        public String freeOrderApplyCode;

        @NameInMap("name")
        public String name;

        @NameInMap("orderId")
        public String orderId;

        @NameInMap("uploadTime")
        public String uploadTime;

        @NameInMap("url")
        public String url;

        public static ListEnterpriseSupportPlanResponseBodyDataDocs build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataDocs self = new ListEnterpriseSupportPlanResponseBodyDataDocs();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setDocId(Long docId) {
            this.docId = docId;
            return this;
        }
        public Long getDocId() {
            return this.docId;
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public ListEnterpriseSupportPlanResponseBodyDataDocs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodesDocNode extends TeaModel {
        @NameInMap("docId")
        public Long docId;

        @NameInMap("docName")
        public String docName;

        @NameInMap("docSubmitTime")
        public String docSubmitTime;

        @NameInMap("fileName")
        public String fileName;

        @NameInMap("freeOrderApplyCode")
        public String freeOrderApplyCode;

        @NameInMap("orderId")
        public String orderId;

        public static ListEnterpriseSupportPlanResponseBodyDataNodesDocNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodesDocNode self = new ListEnterpriseSupportPlanResponseBodyDataNodesDocNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode setDocId(Long docId) {
            this.docId = docId;
            return this;
        }
        public Long getDocId() {
            return this.docId;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode setDocSubmitTime(String docSubmitTime) {
            this.docSubmitTime = docSubmitTime;
            return this;
        }
        public String getDocSubmitTime() {
            return this.docSubmitTime;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode extends TeaModel {
        @NameInMap("finishTime")
        public String finishTime;

        public static ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode self = new ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode extends TeaModel {
        @NameInMap("auditTime")
        public String auditTime;

        @NameInMap("status")
        public String status;

        @NameInMap("statusName")
        public String statusName;

        public static ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode self = new ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode extends TeaModel {
        @NameInMap("applyTime")
        public String applyTime;

        @NameInMap("uid")
        public Long uid;

        public static ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode self = new ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode extends TeaModel {
        @NameInMap("payTime")
        public String payTime;

        @NameInMap("uid")
        public Long uid;

        public static ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode self = new ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("startTime")
        public String startTime;

        public static ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation self = new ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataNodes extends TeaModel {
        @NameInMap("docNode")
        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode docNode;

        @NameInMap("finishNode")
        public ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode finishNode;

        @NameInMap("freeOrderAuditNode")
        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode freeOrderAuditNode;

        @NameInMap("freeOrderNode")
        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode freeOrderNode;

        @NameInMap("name")
        public String name;

        @NameInMap("orderDate")
        public Long orderDate;

        @NameInMap("orderNode")
        public ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode orderNode;

        @NameInMap("serviceImplementation")
        public ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation serviceImplementation;

        @NameInMap("status")
        public Integer status;

        public static ListEnterpriseSupportPlanResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataNodes self = new ListEnterpriseSupportPlanResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setDocNode(ListEnterpriseSupportPlanResponseBodyDataNodesDocNode docNode) {
            this.docNode = docNode;
            return this;
        }
        public ListEnterpriseSupportPlanResponseBodyDataNodesDocNode getDocNode() {
            return this.docNode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setFinishNode(ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode finishNode) {
            this.finishNode = finishNode;
            return this;
        }
        public ListEnterpriseSupportPlanResponseBodyDataNodesFinishNode getFinishNode() {
            return this.finishNode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setFreeOrderAuditNode(ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode freeOrderAuditNode) {
            this.freeOrderAuditNode = freeOrderAuditNode;
            return this;
        }
        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderAuditNode getFreeOrderAuditNode() {
            return this.freeOrderAuditNode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setFreeOrderNode(ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode freeOrderNode) {
            this.freeOrderNode = freeOrderNode;
            return this;
        }
        public ListEnterpriseSupportPlanResponseBodyDataNodesFreeOrderNode getFreeOrderNode() {
            return this.freeOrderNode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setOrderDate(Long orderDate) {
            this.orderDate = orderDate;
            return this;
        }
        public Long getOrderDate() {
            return this.orderDate;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setOrderNode(ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode orderNode) {
            this.orderNode = orderNode;
            return this;
        }
        public ListEnterpriseSupportPlanResponseBodyDataNodesOrderNode getOrderNode() {
            return this.orderNode;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setServiceImplementation(ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation serviceImplementation) {
            this.serviceImplementation = serviceImplementation;
            return this;
        }
        public ListEnterpriseSupportPlanResponseBodyDataNodesServiceImplementation getServiceImplementation() {
            return this.serviceImplementation;
        }

        public ListEnterpriseSupportPlanResponseBodyDataNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyDataOperateInfos extends TeaModel {
        @NameInMap("canClick")
        public Boolean canClick;

        @NameInMap("text")
        public String text;

        @NameInMap("url")
        public String url;

        public static ListEnterpriseSupportPlanResponseBodyDataOperateInfos build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyDataOperateInfos self = new ListEnterpriseSupportPlanResponseBodyDataOperateInfos();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyDataOperateInfos setCanClick(Boolean canClick) {
            this.canClick = canClick;
            return this;
        }
        public Boolean getCanClick() {
            return this.canClick;
        }

        public ListEnterpriseSupportPlanResponseBodyDataOperateInfos setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListEnterpriseSupportPlanResponseBodyDataOperateInfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEnterpriseSupportPlanResponseBodyData extends TeaModel {
        @NameInMap("canApplyFreeOrder")
        public Boolean canApplyFreeOrder;

        @NameInMap("customerId")
        public Long customerId;

        @NameInMap("docs")
        public java.util.List<ListEnterpriseSupportPlanResponseBodyDataDocs> docs;

        @NameInMap("endTime")
        public String endTime;

        @NameInMap("firstPayTime")
        public String firstPayTime;

        @NameInMap("freeOrderApplyCode")
        public String freeOrderApplyCode;

        @NameInMap("freeOrderApplyId")
        public Long freeOrderApplyId;

        @NameInMap("freeOrderApplyTime")
        public String freeOrderApplyTime;

        @NameInMap("freeOrderApprovedTime")
        public String freeOrderApprovedTime;

        @NameInMap("freeOrderExpectStartTime")
        public String freeOrderExpectStartTime;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("nodes")
        public java.util.List<ListEnterpriseSupportPlanResponseBodyDataNodes> nodes;

        @NameInMap("operateInfos")
        public java.util.List<ListEnterpriseSupportPlanResponseBodyDataOperateInfos> operateInfos;

        @NameInMap("orderIds")
        public java.util.List<Long> orderIds;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("serviceStatus")
        public String serviceStatus;

        @NameInMap("serviceStatusName")
        public String serviceStatusName;

        @NameInMap("serviceType")
        public String serviceType;

        @NameInMap("sortTime")
        public String sortTime;

        @NameInMap("startTime")
        public String startTime;

        @NameInMap("taskNum")
        public Long taskNum;

        public static ListEnterpriseSupportPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanResponseBodyData self = new ListEnterpriseSupportPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanResponseBodyData setCanApplyFreeOrder(Boolean canApplyFreeOrder) {
            this.canApplyFreeOrder = canApplyFreeOrder;
            return this;
        }
        public Boolean getCanApplyFreeOrder() {
            return this.canApplyFreeOrder;
        }

        public ListEnterpriseSupportPlanResponseBodyData setCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }
        public Long getCustomerId() {
            return this.customerId;
        }

        public ListEnterpriseSupportPlanResponseBodyData setDocs(java.util.List<ListEnterpriseSupportPlanResponseBodyDataDocs> docs) {
            this.docs = docs;
            return this;
        }
        public java.util.List<ListEnterpriseSupportPlanResponseBodyDataDocs> getDocs() {
            return this.docs;
        }

        public ListEnterpriseSupportPlanResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setFirstPayTime(String firstPayTime) {
            this.firstPayTime = firstPayTime;
            return this;
        }
        public String getFirstPayTime() {
            return this.firstPayTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public ListEnterpriseSupportPlanResponseBodyData setFreeOrderApplyId(Long freeOrderApplyId) {
            this.freeOrderApplyId = freeOrderApplyId;
            return this;
        }
        public Long getFreeOrderApplyId() {
            return this.freeOrderApplyId;
        }

        public ListEnterpriseSupportPlanResponseBodyData setFreeOrderApplyTime(String freeOrderApplyTime) {
            this.freeOrderApplyTime = freeOrderApplyTime;
            return this;
        }
        public String getFreeOrderApplyTime() {
            return this.freeOrderApplyTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setFreeOrderApprovedTime(String freeOrderApprovedTime) {
            this.freeOrderApprovedTime = freeOrderApprovedTime;
            return this;
        }
        public String getFreeOrderApprovedTime() {
            return this.freeOrderApprovedTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setFreeOrderExpectStartTime(String freeOrderExpectStartTime) {
            this.freeOrderExpectStartTime = freeOrderExpectStartTime;
            return this;
        }
        public String getFreeOrderExpectStartTime() {
            return this.freeOrderExpectStartTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEnterpriseSupportPlanResponseBodyData setNodes(java.util.List<ListEnterpriseSupportPlanResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListEnterpriseSupportPlanResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public ListEnterpriseSupportPlanResponseBodyData setOperateInfos(java.util.List<ListEnterpriseSupportPlanResponseBodyDataOperateInfos> operateInfos) {
            this.operateInfos = operateInfos;
            return this;
        }
        public java.util.List<ListEnterpriseSupportPlanResponseBodyDataOperateInfos> getOperateInfos() {
            return this.operateInfos;
        }

        public ListEnterpriseSupportPlanResponseBodyData setOrderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<Long> getOrderIds() {
            return this.orderIds;
        }

        public ListEnterpriseSupportPlanResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListEnterpriseSupportPlanResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListEnterpriseSupportPlanResponseBodyData setServiceStatusName(String serviceStatusName) {
            this.serviceStatusName = serviceStatusName;
            return this;
        }
        public String getServiceStatusName() {
            return this.serviceStatusName;
        }

        public ListEnterpriseSupportPlanResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListEnterpriseSupportPlanResponseBodyData setSortTime(String sortTime) {
            this.sortTime = sortTime;
            return this;
        }
        public String getSortTime() {
            return this.sortTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListEnterpriseSupportPlanResponseBodyData setTaskNum(Long taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Long getTaskNum() {
            return this.taskNum;
        }

    }

}
