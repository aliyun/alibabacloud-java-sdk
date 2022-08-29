// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetStepForwardLogResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetStepForwardLogResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetStepForwardLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStepForwardLogResponseBody self = new GetStepForwardLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStepForwardLogResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetStepForwardLogResponseBody setData(GetStepForwardLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStepForwardLogResponseBodyData getData() {
        return this.data;
    }

    public GetStepForwardLogResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStepForwardLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStepForwardLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStepForwardLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStepForwardLogResponseBodyDataForwardLogs extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("SdfJobId")
        public String sdfJobId;

        @NameInMap("SsJobId")
        public String ssJobId;

        @NameInMap("SsTaskName")
        public String ssTaskName;

        @NameInMap("SsTaskStep")
        public String ssTaskStep;

        @NameInMap("SsTaskType")
        public String ssTaskType;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetStepForwardLogResponseBodyDataForwardLogs build(java.util.Map<String, ?> map) throws Exception {
            GetStepForwardLogResponseBodyDataForwardLogs self = new GetStepForwardLogResponseBodyDataForwardLogs();
            return TeaModel.build(map, self);
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setSdfJobId(String sdfJobId) {
            this.sdfJobId = sdfJobId;
            return this;
        }
        public String getSdfJobId() {
            return this.sdfJobId;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setSsJobId(String ssJobId) {
            this.ssJobId = ssJobId;
            return this;
        }
        public String getSsJobId() {
            return this.ssJobId;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setSsTaskName(String ssTaskName) {
            this.ssTaskName = ssTaskName;
            return this;
        }
        public String getSsTaskName() {
            return this.ssTaskName;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setSsTaskStep(String ssTaskStep) {
            this.ssTaskStep = ssTaskStep;
            return this;
        }
        public String getSsTaskStep() {
            return this.ssTaskStep;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setSsTaskType(String ssTaskType) {
            this.ssTaskType = ssTaskType;
            return this;
        }
        public String getSsTaskType() {
            return this.ssTaskType;
        }

        public GetStepForwardLogResponseBodyDataForwardLogs setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetStepForwardLogResponseBodyData extends TeaModel {
        @NameInMap("ForwardLogs")
        public java.util.List<GetStepForwardLogResponseBodyDataForwardLogs> forwardLogs;

        public static GetStepForwardLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStepForwardLogResponseBodyData self = new GetStepForwardLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStepForwardLogResponseBodyData setForwardLogs(java.util.List<GetStepForwardLogResponseBodyDataForwardLogs> forwardLogs) {
            this.forwardLogs = forwardLogs;
            return this;
        }
        public java.util.List<GetStepForwardLogResponseBodyDataForwardLogs> getForwardLogs() {
            return this.forwardLogs;
        }

    }

}
