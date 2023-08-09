// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateTimingSyntheticTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public UpdateTimingSyntheticTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateTimingSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimingSyntheticTaskResponseBody self = new UpdateTimingSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTimingSyntheticTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateTimingSyntheticTaskResponseBody setData(UpdateTimingSyntheticTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateTimingSyntheticTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateTimingSyntheticTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateTimingSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTimingSyntheticTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateTimingSyntheticTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateTimingSyntheticTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskResponseBodyData self = new UpdateTimingSyntheticTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
