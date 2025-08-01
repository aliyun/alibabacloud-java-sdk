// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAvailableAuditNotesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAvailableAuditNotesResponseBodyData data;

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

    public static GetAvailableAuditNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableAuditNotesResponseBody self = new GetAvailableAuditNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvailableAuditNotesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAvailableAuditNotesResponseBody setData(GetAvailableAuditNotesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAvailableAuditNotesResponseBodyData getData() {
        return this.data;
    }

    public GetAvailableAuditNotesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAvailableAuditNotesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAvailableAuditNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvailableAuditNotesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAvailableAuditNotesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23333</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("NoteId")
        public String noteId;

        /**
         * <strong>example:</strong>
         * <p>错题本2025-07-07_解析结果</p>
         */
        @NameInMap("NoteName")
        public String noteName;

        /**
         * <strong>example:</strong>
         * <p>2025-07-07 11:56:30</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetAvailableAuditNotesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAvailableAuditNotesResponseBodyData self = new GetAvailableAuditNotesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAvailableAuditNotesResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetAvailableAuditNotesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAvailableAuditNotesResponseBodyData setNoteId(String noteId) {
            this.noteId = noteId;
            return this;
        }
        public String getNoteId() {
            return this.noteId;
        }

        public GetAvailableAuditNotesResponseBodyData setNoteName(String noteName) {
            this.noteName = noteName;
            return this;
        }
        public String getNoteName() {
            return this.noteName;
        }

        public GetAvailableAuditNotesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
