// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public CreateVideoMergeTaskResponseBodyData data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<CreateVideoMergeTaskResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 提示
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static CreateVideoMergeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoMergeTaskResponseBody self = new CreateVideoMergeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoMergeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVideoMergeTaskResponseBody setData(CreateVideoMergeTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVideoMergeTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateVideoMergeTaskResponseBody setErrors(java.util.List<CreateVideoMergeTaskResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<CreateVideoMergeTaskResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public CreateVideoMergeTaskResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateVideoMergeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVideoMergeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoMergeTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateVideoMergeTaskResponseBodyData extends TeaModel {
        @NameInMap("ClientTraceId")
        public String clientTraceId;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("MergeFileId")
        public String mergeFileId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Width")
        public Integer width;

        public static CreateVideoMergeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskResponseBodyData self = new CreateVideoMergeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskResponseBodyData setClientTraceId(String clientTraceId) {
            this.clientTraceId = clientTraceId;
            return this;
        }
        public String getClientTraceId() {
            return this.clientTraceId;
        }

        public CreateVideoMergeTaskResponseBodyData setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateVideoMergeTaskResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CreateVideoMergeTaskResponseBodyData setMergeFileId(String mergeFileId) {
            this.mergeFileId = mergeFileId;
            return this;
        }
        public String getMergeFileId() {
            return this.mergeFileId;
        }

        public CreateVideoMergeTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateVideoMergeTaskResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class CreateVideoMergeTaskResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static CreateVideoMergeTaskResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskResponseBodyErrors self = new CreateVideoMergeTaskResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateVideoMergeTaskResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
