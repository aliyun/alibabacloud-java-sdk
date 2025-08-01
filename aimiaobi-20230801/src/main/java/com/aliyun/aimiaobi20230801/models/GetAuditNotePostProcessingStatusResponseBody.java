// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAuditNotePostProcessingStatusResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public GetAuditNotePostProcessingStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAuditNotePostProcessingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditNotePostProcessingStatusResponseBody self = new GetAuditNotePostProcessingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditNotePostProcessingStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuditNotePostProcessingStatusResponseBody setData(GetAuditNotePostProcessingStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAuditNotePostProcessingStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAuditNotePostProcessingStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAuditNotePostProcessingStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuditNotePostProcessingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditNotePostProcessingStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAuditNotePostProcessingStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1970-01-01 23:34:45</p>
         */
        @NameInMap("CompletionTime")
        public String completionTime;

        /**
         * <strong>example:</strong>
         * <p>1970-01-01 12:34:56</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("NoteId")
        public String noteId;

        /**
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("ProcessedLines")
        public Integer processedLines;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>666</p>
         */
        @NameInMap("TotalLines")
        public Integer totalLines;

        public static GetAuditNotePostProcessingStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuditNotePostProcessingStatusResponseBodyData self = new GetAuditNotePostProcessingStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setNoteId(String noteId) {
            this.noteId = noteId;
            return this;
        }
        public String getNoteId() {
            return this.noteId;
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setProcessedLines(Integer processedLines) {
            this.processedLines = processedLines;
            return this;
        }
        public Integer getProcessedLines() {
            return this.processedLines;
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAuditNotePostProcessingStatusResponseBodyData setTotalLines(Integer totalLines) {
            this.totalLines = totalLines;
            return this;
        }
        public Integer getTotalLines() {
            return this.totalLines;
        }

    }

}
