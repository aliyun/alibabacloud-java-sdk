// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetEnterpriseSupportPlanDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnterpriseSupportPlanDetailResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetEnterpriseSupportPlanDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseSupportPlanDetailResponseBody self = new GetEnterpriseSupportPlanDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseSupportPlanDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnterpriseSupportPlanDetailResponseBody setData(GetEnterpriseSupportPlanDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseSupportPlanDetailResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseSupportPlanDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEnterpriseSupportPlanDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnterpriseSupportPlanDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEnterpriseSupportPlanDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups extends TeaModel {
        @NameInMap("mainDingDepartmentId")
        public String mainDingDepartmentId;

        @NameInMap("mainDingGroupId")
        public String mainDingGroupId;

        @NameInMap("mainDingGroupName")
        public String mainDingGroupName;

        @NameInMap("subDingDepartmentId")
        public String subDingDepartmentId;

        @NameInMap("subDingGroupId")
        public String subDingGroupId;

        @NameInMap("subDingGroupName")
        public String subDingGroupName;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups self = new GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups setMainDingDepartmentId(String mainDingDepartmentId) {
            this.mainDingDepartmentId = mainDingDepartmentId;
            return this;
        }
        public String getMainDingDepartmentId() {
            return this.mainDingDepartmentId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups setMainDingGroupId(String mainDingGroupId) {
            this.mainDingGroupId = mainDingGroupId;
            return this;
        }
        public String getMainDingGroupId() {
            return this.mainDingGroupId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups setMainDingGroupName(String mainDingGroupName) {
            this.mainDingGroupName = mainDingGroupName;
            return this;
        }
        public String getMainDingGroupName() {
            return this.mainDingGroupName;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups setSubDingDepartmentId(String subDingDepartmentId) {
            this.subDingDepartmentId = subDingDepartmentId;
            return this;
        }
        public String getSubDingDepartmentId() {
            return this.subDingDepartmentId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups setSubDingGroupId(String subDingGroupId) {
            this.subDingGroupId = subDingGroupId;
            return this;
        }
        public String getSubDingGroupId() {
            return this.subDingGroupId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups setSubDingGroupName(String subDingGroupName) {
            this.subDingGroupName = subDingGroupName;
            return this;
        }
        public String getSubDingGroupName() {
            return this.subDingGroupName;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataDocs extends TeaModel {
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

        public static GetEnterpriseSupportPlanDetailResponseBodyDataDocs build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataDocs self = new GetEnterpriseSupportPlanDetailResponseBodyDataDocs();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setDocId(Long docId) {
            this.docId = docId;
            return this;
        }
        public Long getDocId() {
            return this.docId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataDocs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode extends TeaModel {
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

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode setDocId(Long docId) {
            this.docId = docId;
            return this;
        }
        public Long getDocId() {
            return this.docId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode setDocName(String docName) {
            this.docName = docName;
            return this;
        }
        public String getDocName() {
            return this.docName;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode setDocSubmitTime(String docSubmitTime) {
            this.docSubmitTime = docSubmitTime;
            return this;
        }
        public String getDocSubmitTime() {
            return this.docSubmitTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode extends TeaModel {
        @NameInMap("finishTime")
        public String finishTime;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode extends TeaModel {
        @NameInMap("auditTime")
        public String auditTime;

        @NameInMap("status")
        public String status;

        @NameInMap("statusName")
        public String statusName;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode extends TeaModel {
        @NameInMap("applyTime")
        public String applyTime;

        @NameInMap("uid")
        public Long uid;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode extends TeaModel {
        @NameInMap("payTime")
        public String payTime;

        @NameInMap("uid")
        public Long uid;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("startTime")
        public String startTime;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataNodes extends TeaModel {
        @NameInMap("docNode")
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode docNode;

        @NameInMap("finishNode")
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode finishNode;

        @NameInMap("freeOrderAuditNode")
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode freeOrderAuditNode;

        @NameInMap("freeOrderNode")
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode freeOrderNode;

        @NameInMap("name")
        public String name;

        @NameInMap("orderDate")
        public Long orderDate;

        @NameInMap("orderNode")
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode orderNode;

        @NameInMap("serviceImplementation")
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation serviceImplementation;

        @NameInMap("status")
        public Integer status;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataNodes self = new GetEnterpriseSupportPlanDetailResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setDocNode(GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode docNode) {
            this.docNode = docNode;
            return this;
        }
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesDocNode getDocNode() {
            return this.docNode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setFinishNode(GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode finishNode) {
            this.finishNode = finishNode;
            return this;
        }
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFinishNode getFinishNode() {
            return this.finishNode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setFreeOrderAuditNode(GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode freeOrderAuditNode) {
            this.freeOrderAuditNode = freeOrderAuditNode;
            return this;
        }
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderAuditNode getFreeOrderAuditNode() {
            return this.freeOrderAuditNode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setFreeOrderNode(GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode freeOrderNode) {
            this.freeOrderNode = freeOrderNode;
            return this;
        }
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesFreeOrderNode getFreeOrderNode() {
            return this.freeOrderNode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setOrderDate(Long orderDate) {
            this.orderDate = orderDate;
            return this;
        }
        public Long getOrderDate() {
            return this.orderDate;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setOrderNode(GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode orderNode) {
            this.orderNode = orderNode;
            return this;
        }
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesOrderNode getOrderNode() {
            return this.orderNode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setServiceImplementation(GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation serviceImplementation) {
            this.serviceImplementation = serviceImplementation;
            return this;
        }
        public GetEnterpriseSupportPlanDetailResponseBodyDataNodesServiceImplementation getServiceImplementation() {
            return this.serviceImplementation;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataNodes setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("name1")
        public String name1;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList self = new GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList setName1(String name1) {
            this.name1 = name1;
            return this;
        }
        public String getName1() {
            return this.name1;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("desc")
        public String desc;

        @NameInMap("name")
        public String name;

        @NameInMap("operateList")
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList> operateList;

        public static GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems self = new GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems setOperateList(java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList> operateList) {
            this.operateList = operateList;
            return this;
        }
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataServiceItemsOperateList> getOperateList() {
            return this.operateList;
        }

    }

    public static class GetEnterpriseSupportPlanDetailResponseBodyData extends TeaModel {
        @NameInMap("canApplyFreeOrder")
        public Boolean canApplyFreeOrder;

        @NameInMap("customerId")
        public Long customerId;

        @NameInMap("dingGroups")
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups> dingGroups;

        @NameInMap("docs")
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataDocs> docs;

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
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataNodes> nodes;

        @NameInMap("orderIds")
        public java.util.List<Long> orderIds;

        @NameInMap("serviceItems")
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems> serviceItems;

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

        public static GetEnterpriseSupportPlanDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseSupportPlanDetailResponseBodyData self = new GetEnterpriseSupportPlanDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setCanApplyFreeOrder(Boolean canApplyFreeOrder) {
            this.canApplyFreeOrder = canApplyFreeOrder;
            return this;
        }
        public Boolean getCanApplyFreeOrder() {
            return this.canApplyFreeOrder;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }
        public Long getCustomerId() {
            return this.customerId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setDingGroups(java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups> dingGroups) {
            this.dingGroups = dingGroups;
            return this;
        }
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataDingGroups> getDingGroups() {
            return this.dingGroups;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setDocs(java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataDocs> docs) {
            this.docs = docs;
            return this;
        }
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataDocs> getDocs() {
            return this.docs;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setFirstPayTime(String firstPayTime) {
            this.firstPayTime = firstPayTime;
            return this;
        }
        public String getFirstPayTime() {
            return this.firstPayTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setFreeOrderApplyCode(String freeOrderApplyCode) {
            this.freeOrderApplyCode = freeOrderApplyCode;
            return this;
        }
        public String getFreeOrderApplyCode() {
            return this.freeOrderApplyCode;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setFreeOrderApplyId(Long freeOrderApplyId) {
            this.freeOrderApplyId = freeOrderApplyId;
            return this;
        }
        public Long getFreeOrderApplyId() {
            return this.freeOrderApplyId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setFreeOrderApplyTime(String freeOrderApplyTime) {
            this.freeOrderApplyTime = freeOrderApplyTime;
            return this;
        }
        public String getFreeOrderApplyTime() {
            return this.freeOrderApplyTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setFreeOrderApprovedTime(String freeOrderApprovedTime) {
            this.freeOrderApprovedTime = freeOrderApprovedTime;
            return this;
        }
        public String getFreeOrderApprovedTime() {
            return this.freeOrderApprovedTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setFreeOrderExpectStartTime(String freeOrderExpectStartTime) {
            this.freeOrderExpectStartTime = freeOrderExpectStartTime;
            return this;
        }
        public String getFreeOrderExpectStartTime() {
            return this.freeOrderExpectStartTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setNodes(java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setOrderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<Long> getOrderIds() {
            return this.orderIds;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setServiceItems(java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems> serviceItems) {
            this.serviceItems = serviceItems;
            return this;
        }
        public java.util.List<GetEnterpriseSupportPlanDetailResponseBodyDataServiceItems> getServiceItems() {
            return this.serviceItems;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setServiceStatusName(String serviceStatusName) {
            this.serviceStatusName = serviceStatusName;
            return this;
        }
        public String getServiceStatusName() {
            return this.serviceStatusName;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setSortTime(String sortTime) {
            this.sortTime = sortTime;
            return this;
        }
        public String getSortTime() {
            return this.sortTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetEnterpriseSupportPlanDetailResponseBodyData setTaskNum(Long taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Long getTaskNum() {
            return this.taskNum;
        }

    }

}
