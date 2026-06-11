// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetNotebookTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of Success indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The scheduling result.</p>
     */
    @NameInMap("Data")
    public GetNotebookTaskStatusResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
        /**
         * <p>The URL to preview the scheduling result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dms.aliyun.com/web-ide">https://dms.aliyun.com/web-ide</a>?***</p>
         */
        @NameInMap("NotebookSchedulePreviewUrl")
        public String notebookSchedulePreviewUrl;

        /**
         * <p>The progress of the scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>5/6</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The output of the scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the scheduling result.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
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
