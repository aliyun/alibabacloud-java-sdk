// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetVideoMergeTaskResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVideoMergeTaskResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<GetVideoMergeTaskResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetVideoMergeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoMergeTaskResponseBody self = new GetVideoMergeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoMergeTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoMergeTaskResponseBody setData(GetVideoMergeTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoMergeTaskResponseBodyData getData() {
        return this.data;
    }

    public GetVideoMergeTaskResponseBody setErrors(java.util.List<GetVideoMergeTaskResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetVideoMergeTaskResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetVideoMergeTaskResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetVideoMergeTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoMergeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoMergeTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoMergeTaskResponseBodyData extends TeaModel {
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

        public static GetVideoMergeTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoMergeTaskResponseBodyData self = new GetVideoMergeTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoMergeTaskResponseBodyData setClientTraceId(String clientTraceId) {
            this.clientTraceId = clientTraceId;
            return this;
        }
        public String getClientTraceId() {
            return this.clientTraceId;
        }

        public GetVideoMergeTaskResponseBodyData setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoMergeTaskResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetVideoMergeTaskResponseBodyData setMergeFileId(String mergeFileId) {
            this.mergeFileId = mergeFileId;
            return this;
        }
        public String getMergeFileId() {
            return this.mergeFileId;
        }

        public GetVideoMergeTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetVideoMergeTaskResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetVideoMergeTaskResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static GetVideoMergeTaskResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetVideoMergeTaskResponseBodyErrors self = new GetVideoMergeTaskResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetVideoMergeTaskResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetVideoMergeTaskResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
