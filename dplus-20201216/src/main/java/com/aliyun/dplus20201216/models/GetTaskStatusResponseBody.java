// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTaskStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponseBody self = new GetTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTaskStatusResponseBody setData(GetTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public GetTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskStatusResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTaskStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TaskId")
        public Long taskId;

        public static GetTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskStatusResponseBodyData self = new GetTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskStatusResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetTaskStatusResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetTaskStatusResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
