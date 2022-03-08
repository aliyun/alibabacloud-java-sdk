// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetRealtimeTaskResponseBody extends TeaModel {
    // 请求任务结果
    @NameInMap("InspectionTask")
    public GetRealtimeTaskResponseBodyInspectionTask inspectionTask;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetRealtimeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeTaskResponseBody self = new GetRealtimeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeTaskResponseBody setInspectionTask(GetRealtimeTaskResponseBodyInspectionTask inspectionTask) {
        this.inspectionTask = inspectionTask;
        return this;
    }
    public GetRealtimeTaskResponseBodyInspectionTask getInspectionTask() {
        return this.inspectionTask;
    }

    public GetRealtimeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealtimeTaskResponseBodyInspectionTask extends TeaModel {
        // 巡检错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 巡检错误信息
        @NameInMap("InspectionMessage")
        public String inspectionMessage;

        // 巡检输出
        @NameInMap("InspectionResult")
        public String inspectionResult;

        // 巡检状态
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetRealtimeTaskResponseBodyInspectionTask build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeTaskResponseBodyInspectionTask self = new GetRealtimeTaskResponseBodyInspectionTask();
            return TeaModel.build(map, self);
        }

        public GetRealtimeTaskResponseBodyInspectionTask setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetRealtimeTaskResponseBodyInspectionTask setInspectionMessage(String inspectionMessage) {
            this.inspectionMessage = inspectionMessage;
            return this;
        }
        public String getInspectionMessage() {
            return this.inspectionMessage;
        }

        public GetRealtimeTaskResponseBodyInspectionTask setInspectionResult(String inspectionResult) {
            this.inspectionResult = inspectionResult;
            return this;
        }
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        public GetRealtimeTaskResponseBodyInspectionTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
