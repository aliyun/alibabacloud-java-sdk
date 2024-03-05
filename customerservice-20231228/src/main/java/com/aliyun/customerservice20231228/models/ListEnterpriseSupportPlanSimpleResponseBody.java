// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListEnterpriseSupportPlanSimpleResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyData> data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListEnterpriseSupportPlanSimpleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseSupportPlanSimpleResponseBody self = new ListEnterpriseSupportPlanSimpleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseSupportPlanSimpleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnterpriseSupportPlanSimpleResponseBody setData(java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyData> getData() {
        return this.data;
    }

    public ListEnterpriseSupportPlanSimpleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEnterpriseSupportPlanSimpleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnterpriseSupportPlanSimpleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseSupportPlanSimpleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataDocs extends TeaModel {
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

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataDocs build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataDocs self = new ListEnterpriseSupportPlanSimpleResponseBodyDataDocs();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setDocId(Long docId) {
            this.docId = docId;
            return this;
        }
        public Long getDocId() {
            return this.docId;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataDocs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode extends TeaModel {
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

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode setDocId(Long docId) {
            this.docId = docId;
            return this;
        }
        public Long getDocId() {
            return this.docId;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode setDocSubmitTime(String docSubmitTime) {
            this.docSubmitTime = docSubmitTime;
            return this;
        }
        public String getDocSubmitTime() {
            return this.docSubmitTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode extends TeaModel {
        @NameInMap("finishTime")
        public String finishTime;

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode extends TeaModel {
        @NameInMap("auditTime")
        public String auditTime;

        @NameInMap("status")
        public String status;

        @NameInMap("statusName")
        public String statusName;

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode extends TeaModel {
        @NameInMap("applyTime")
        public String applyTime;

        @NameInMap("uid")
        public Long uid;

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode extends TeaModel {
        @NameInMap("payTime")
        public String payTime;

        @NameInMap("uid")
        public Long uid;

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("startTime")
        public String startTime;

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyDataNodes extends TeaModel {
        @NameInMap("docNode")
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode docNode;

        @NameInMap("finishNode")
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode finishNode;

        @NameInMap("freeOrderAuditNode")
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode freeOrderAuditNode;

        @NameInMap("freeOrderNode")
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode freeOrderNode;

        @NameInMap("name")
        public String name;

        @NameInMap("orderDate")
        public Long orderDate;

        @NameInMap("orderNode")
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode orderNode;

        @NameInMap("serviceImplementation")
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation serviceImplementation;

        @NameInMap("status")
        public Integer status;

        public static ListEnterpriseSupportPlanSimpleResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyDataNodes self = new ListEnterpriseSupportPlanSimpleResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setDocNode(ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode docNode) {
            this.docNode = docNode;
            return this;
        }
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesDocNode getDocNode() {
            return this.docNode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setFinishNode(ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode finishNode) {
            this.finishNode = finishNode;
            return this;
        }
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFinishNode getFinishNode() {
            return this.finishNode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setFreeOrderAuditNode(ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode freeOrderAuditNode) {
            this.freeOrderAuditNode = freeOrderAuditNode;
            return this;
        }
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderAuditNode getFreeOrderAuditNode() {
            return this.freeOrderAuditNode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setFreeOrderNode(ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode freeOrderNode) {
            this.freeOrderNode = freeOrderNode;
            return this;
        }
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesFreeOrderNode getFreeOrderNode() {
            return this.freeOrderNode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setOrderDate(Long orderDate) {
            this.orderDate = orderDate;
            return this;
        }
        public Long getOrderDate() {
            return this.orderDate;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setOrderNode(ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode orderNode) {
            this.orderNode = orderNode;
            return this;
        }
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesOrderNode getOrderNode() {
            return this.orderNode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setServiceImplementation(ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation serviceImplementation) {
            this.serviceImplementation = serviceImplementation;
            return this;
        }
        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodesServiceImplementation getServiceImplementation() {
            return this.serviceImplementation;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyDataNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListEnterpriseSupportPlanSimpleResponseBodyData extends TeaModel {
        @NameInMap("canApplyFreeOrder")
        public Boolean canApplyFreeOrder;

        @NameInMap("customerId")
        public Long customerId;

        @NameInMap("docs")
        public java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyDataDocs> docs;

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
        public java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyDataNodes> nodes;

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

        public static ListEnterpriseSupportPlanSimpleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnterpriseSupportPlanSimpleResponseBodyData self = new ListEnterpriseSupportPlanSimpleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setCanApplyFreeOrder(Boolean canApplyFreeOrder) {
            this.canApplyFreeOrder = canApplyFreeOrder;
            return this;
        }
        public Boolean getCanApplyFreeOrder() {
            return this.canApplyFreeOrder;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }
        public Long getCustomerId() {
            return this.customerId;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setDocs(java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyDataDocs> docs) {
            this.docs = docs;
            return this;
        }
        public java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyDataDocs> getDocs() {
            return this.docs;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setFirstPayTime(String firstPayTime) {
            this.firstPayTime = firstPayTime;
            return this;
        }
        public String getFirstPayTime() {
            return this.firstPayTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setFreeOrderApplyId(Long freeOrderApplyId) {
            this.freeOrderApplyId = freeOrderApplyId;
            return this;
        }
        public Long getFreeOrderApplyId() {
            return this.freeOrderApplyId;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setFreeOrderApplyTime(String freeOrderApplyTime) {
            this.freeOrderApplyTime = freeOrderApplyTime;
            return this;
        }
        public String getFreeOrderApplyTime() {
            return this.freeOrderApplyTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setFreeOrderApprovedTime(String freeOrderApprovedTime) {
            this.freeOrderApprovedTime = freeOrderApprovedTime;
            return this;
        }
        public String getFreeOrderApprovedTime() {
            return this.freeOrderApprovedTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setFreeOrderExpectStartTime(String freeOrderExpectStartTime) {
            this.freeOrderExpectStartTime = freeOrderExpectStartTime;
            return this;
        }
        public String getFreeOrderExpectStartTime() {
            return this.freeOrderExpectStartTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setNodes(java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListEnterpriseSupportPlanSimpleResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setOrderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<Long> getOrderIds() {
            return this.orderIds;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setServiceStatusName(String serviceStatusName) {
            this.serviceStatusName = serviceStatusName;
            return this;
        }
        public String getServiceStatusName() {
            return this.serviceStatusName;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setSortTime(String sortTime) {
            this.sortTime = sortTime;
            return this;
        }
        public String getSortTime() {
            return this.sortTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListEnterpriseSupportPlanSimpleResponseBodyData setTaskNum(Long taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Long getTaskNum() {
            return this.taskNum;
        }

    }

}
