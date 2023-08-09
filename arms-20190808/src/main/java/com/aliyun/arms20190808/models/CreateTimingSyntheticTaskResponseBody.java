// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CreateTimingSyntheticTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTimingSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTimingSyntheticTaskResponseBody self = new CreateTimingSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTimingSyntheticTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateTimingSyntheticTaskResponseBody setData(CreateTimingSyntheticTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTimingSyntheticTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateTimingSyntheticTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTimingSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTimingSyntheticTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTimingSyntheticTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static CreateTimingSyntheticTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskResponseBodyData self = new CreateTimingSyntheticTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTimingSyntheticTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
