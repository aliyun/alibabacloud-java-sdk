// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchExportHttpApisResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public BatchExportHttpApisResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchExportHttpApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchExportHttpApisResponseBody self = new BatchExportHttpApisResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchExportHttpApisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchExportHttpApisResponseBody setData(BatchExportHttpApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchExportHttpApisResponseBodyData getData() {
        return this.data;
    }

    public BatchExportHttpApisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchExportHttpApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchExportHttpApisResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID. You can call the GetBatchExportTask operation to query the task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>async-task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static BatchExportHttpApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchExportHttpApisResponseBodyData self = new BatchExportHttpApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchExportHttpApisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
