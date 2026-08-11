// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchImportHttpApisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchImportHttpApisResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchImportHttpApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchImportHttpApisResponseBody self = new BatchImportHttpApisResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchImportHttpApisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchImportHttpApisResponseBody setData(BatchImportHttpApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchImportHttpApisResponseBodyData getData() {
        return this.data;
    }

    public BatchImportHttpApisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchImportHttpApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchImportHttpApisResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>async-task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static BatchImportHttpApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchImportHttpApisResponseBodyData self = new BatchImportHttpApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchImportHttpApisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
