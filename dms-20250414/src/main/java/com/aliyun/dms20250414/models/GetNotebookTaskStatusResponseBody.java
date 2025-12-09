// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetNotebookTaskStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetNotebookTaskStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNotebookTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNotebookTaskStatusResponseBody self = new GetNotebookTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNotebookTaskStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNotebookTaskStatusResponseBody setData(GetNotebookTaskStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNotebookTaskStatusResponseBodyData getData() {
        return this.data;
    }

    public GetNotebookTaskStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNotebookTaskStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNotebookTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNotebookTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNotebookTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNotebookTaskStatusResponseBodyData extends TeaModel {
        @NameInMap("NotebookSchedulePreviewUrl")
        public String notebookSchedulePreviewUrl;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Result")
        public String result;

        @NameInMap("Status")
        public String status;

        public static GetNotebookTaskStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNotebookTaskStatusResponseBodyData self = new GetNotebookTaskStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNotebookTaskStatusResponseBodyData setNotebookSchedulePreviewUrl(String notebookSchedulePreviewUrl) {
            this.notebookSchedulePreviewUrl = notebookSchedulePreviewUrl;
            return this;
        }
        public String getNotebookSchedulePreviewUrl() {
            return this.notebookSchedulePreviewUrl;
        }

        public GetNotebookTaskStatusResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetNotebookTaskStatusResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetNotebookTaskStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
