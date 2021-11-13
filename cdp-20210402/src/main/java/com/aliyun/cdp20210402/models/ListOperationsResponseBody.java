// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListOperationsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListOperationsResponseBodyData> data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationsResponseBody self = new ListOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationsResponseBody setData(java.util.List<ListOperationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOperationsResponseBodyData> getData() {
        return this.data;
    }

    public ListOperationsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListOperationsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListOperationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOperationsResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("HasChildOperationNodes")
        public Boolean hasChildOperationNodes;

        @NameInMap("HasOperationTask")
        public Boolean hasOperationTask;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("OperationNodeId")
        public String operationNodeId;

        @NameInMap("OperationNodeName")
        public Integer operationNodeName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static ListOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationsResponseBodyData self = new ListOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationsResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListOperationsResponseBodyData setHasChildOperationNodes(Boolean hasChildOperationNodes) {
            this.hasChildOperationNodes = hasChildOperationNodes;
            return this;
        }
        public Boolean getHasChildOperationNodes() {
            return this.hasChildOperationNodes;
        }

        public ListOperationsResponseBodyData setHasOperationTask(Boolean hasOperationTask) {
            this.hasOperationTask = hasOperationTask;
            return this;
        }
        public Boolean getHasOperationTask() {
            return this.hasOperationTask;
        }

        public ListOperationsResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListOperationsResponseBodyData setOperationNodeId(String operationNodeId) {
            this.operationNodeId = operationNodeId;
            return this;
        }
        public String getOperationNodeId() {
            return this.operationNodeId;
        }

        public ListOperationsResponseBodyData setOperationNodeName(Integer operationNodeName) {
            this.operationNodeName = operationNodeName;
            return this;
        }
        public Integer getOperationNodeName() {
            return this.operationNodeName;
        }

        public ListOperationsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListOperationsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
