// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateTargetScanTaskResponseBody extends TeaModel {
    /**
     * <p>The creation result, which contains the TaskId of the new scan task.</p>
     */
    @NameInMap("Data")
    public CreateTargetScanTaskResponseBodyData data;

    /**
     * <p>The unique identifier of the request, which is used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTargetScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTargetScanTaskResponseBody self = new CreateTargetScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTargetScanTaskResponseBody setData(CreateTargetScanTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTargetScanTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateTargetScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTargetScanTaskResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the scan task. The initial task status is PREPARING (asynchronous preparation in progress). You can call ListScanTasksByTarget to query the task status and progress.</p>
         * 
         * <strong>example:</strong>
         * <p>task-abc123def4567</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateTargetScanTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTargetScanTaskResponseBodyData self = new CreateTargetScanTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTargetScanTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
