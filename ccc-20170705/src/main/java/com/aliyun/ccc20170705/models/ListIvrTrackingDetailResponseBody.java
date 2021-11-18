// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("IvrTrackingDetails")
    public ListIvrTrackingDetailResponseBodyIvrTrackingDetails ivrTrackingDetails;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListIvrTrackingDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailResponseBody self = new ListIvrTrackingDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIvrTrackingDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIvrTrackingDetailResponseBody setIvrTrackingDetails(ListIvrTrackingDetailResponseBodyIvrTrackingDetails ivrTrackingDetails) {
        this.ivrTrackingDetails = ivrTrackingDetails;
        return this;
    }
    public ListIvrTrackingDetailResponseBodyIvrTrackingDetails getIvrTrackingDetails() {
        return this.ivrTrackingDetails;
    }

    public ListIvrTrackingDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIvrTrackingDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIvrTrackingDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail extends TeaModel {
        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceID")
        public String deviceID;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("InputData")
        public String inputData;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("OutputData")
        public String outputData;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StopTime")
        public Long stopTime;

        @NameInMap("TenantId")
        public String tenantId;

        public static ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail self = new ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }
        public String getDeviceID() {
            return this.deviceID;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setStopTime(Long stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public Long getStopTime() {
            return this.stopTime;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList extends TeaModel {
        @NameInMap("IvrTrackingDetail")
        public java.util.List<ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail> ivrTrackingDetail;

        public static ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList self = new ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList setIvrTrackingDetail(java.util.List<ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail> ivrTrackingDetail) {
            this.ivrTrackingDetail = ivrTrackingDetail;
            return this;
        }
        public java.util.List<ListIvrTrackingDetailResponseBodyIvrTrackingDetailsListIvrTrackingDetail> getIvrTrackingDetail() {
            return this.ivrTrackingDetail;
        }

    }

    public static class ListIvrTrackingDetailResponseBodyIvrTrackingDetails extends TeaModel {
        @NameInMap("List")
        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListIvrTrackingDetailResponseBodyIvrTrackingDetails build(java.util.Map<String, ?> map) throws Exception {
            ListIvrTrackingDetailResponseBodyIvrTrackingDetails self = new ListIvrTrackingDetailResponseBodyIvrTrackingDetails();
            return TeaModel.build(map, self);
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetails setList(ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList list) {
            this.list = list;
            return this;
        }
        public ListIvrTrackingDetailResponseBodyIvrTrackingDetailsList getList() {
            return this.list;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetails setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetails setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIvrTrackingDetailResponseBodyIvrTrackingDetails setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
