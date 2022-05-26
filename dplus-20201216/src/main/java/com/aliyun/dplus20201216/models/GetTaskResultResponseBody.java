// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class GetTaskResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTaskResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static GetTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponseBody self = new GetTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTaskResultResponseBody setData(GetTaskResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskResultResponseBodyData getData() {
        return this.data;
    }

    public GetTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResultResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static class GetTaskResultResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TaskId")
        public Long taskId;

        public static GetTaskResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResultResponseBodyData self = new GetTaskResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetTaskResultResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetTaskResultResponseBodyData setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetTaskResultResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
