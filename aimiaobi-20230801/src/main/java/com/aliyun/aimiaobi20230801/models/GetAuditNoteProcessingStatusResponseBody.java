// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAuditNoteProcessingStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAuditNoteProcessingStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAuditNoteProcessingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditNoteProcessingStatusResponseBody self = new GetAuditNoteProcessingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditNoteProcessingStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuditNoteProcessingStatusResponseBody setData(GetAuditNoteProcessingStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAuditNoteProcessingStatusResponseBodyData getData() {
        return this.data;
    }

    public GetAuditNoteProcessingStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAuditNoteProcessingStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuditNoteProcessingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditNoteProcessingStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAuditNoteProcessingStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://default/path/to/audit/note</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <strong>example:</strong>
         * <p>504</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>错题本2025-07-07_解析结果</p>
         */
        @NameInMap("NoteName")
        public String noteName;

        /**
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>111_Default_20250708142918</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 11:40:50</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetAuditNoteProcessingStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAuditNoteProcessingStatusResponseBodyData self = new GetAuditNoteProcessingStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAuditNoteProcessingStatusResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public GetAuditNoteProcessingStatusResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetAuditNoteProcessingStatusResponseBodyData setNoteName(String noteName) {
            this.noteName = noteName;
            return this;
        }
        public String getNoteName() {
            return this.noteName;
        }

        public GetAuditNoteProcessingStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAuditNoteProcessingStatusResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAuditNoteProcessingStatusResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
