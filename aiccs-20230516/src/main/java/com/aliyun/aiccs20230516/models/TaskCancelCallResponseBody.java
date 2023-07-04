// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCancelCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public TaskCancelCallResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static TaskCancelCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskCancelCallResponseBody self = new TaskCancelCallResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskCancelCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TaskCancelCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskCancelCallResponseBody setModel(TaskCancelCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public TaskCancelCallResponseBodyModel getModel() {
        return this.model;
    }

    public TaskCancelCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskCancelCallResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public TaskCancelCallResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class TaskCancelCallResponseBodyModel extends TeaModel {
        /**
         * <p>错误手机号</p>
         */
        @NameInMap("UnHandleNumbers")
        public java.util.List<String> unHandleNumbers;

        public static TaskCancelCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            TaskCancelCallResponseBodyModel self = new TaskCancelCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public TaskCancelCallResponseBodyModel setUnHandleNumbers(java.util.List<String> unHandleNumbers) {
            this.unHandleNumbers = unHandleNumbers;
            return this;
        }
        public java.util.List<String> getUnHandleNumbers() {
            return this.unHandleNumbers;
        }

    }

}
