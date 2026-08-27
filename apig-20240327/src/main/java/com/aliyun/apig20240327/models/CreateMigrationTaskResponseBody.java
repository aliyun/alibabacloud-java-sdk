// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateMigrationTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateMigrationTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019FD4D8-8A86-5FDE-B79F-357C69677DFB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationTaskResponseBody self = new CreateMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrationTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMigrationTaskResponseBody setData(CreateMigrationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMigrationTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateMigrationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMigrationTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>async-task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateMigrationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMigrationTaskResponseBodyData self = new CreateMigrationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMigrationTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
