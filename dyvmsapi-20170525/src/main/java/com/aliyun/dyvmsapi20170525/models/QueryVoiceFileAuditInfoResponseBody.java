// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoiceFileAuditInfoResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>The value OK indicates that the request was successful. For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryVoiceFileAuditInfoResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryVoiceFileAuditInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceFileAuditInfoResponseBody self = new QueryVoiceFileAuditInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVoiceFileAuditInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVoiceFileAuditInfoResponseBody setData(java.util.List<QueryVoiceFileAuditInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryVoiceFileAuditInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryVoiceFileAuditInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVoiceFileAuditInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryVoiceFileAuditInfoResponseBodyData extends TeaModel {
        /**
         * <p>The review state of the voice file. Valid values:</p>
         * <br>
         * <p>*   **AUDIT_STATE_INIT**: The voice file was under review.</p>
         * <p>*   **AUDIT_STATE_PASS**: The voice file was approved.</p>
         * <p>*   **AUDIT_STATE_NOT_PASS**: The voice file was rejected.</p>
         * <p>*   **AUDIT_STATE_UPLOADING**: The voice file was approved and is being uploaded.</p>
         * <p>*   **AUDIT_STATE_REDOING**: The voice file was being reprocessed.</p>
         * <p>*   **AUDIT_SATE_CANCEL**: The review of the voice file was canceled.</p>
         * <p>*   **AUDIT_PAUSE**: The review of the voice file was suspended.</p>
         * <p>*   **AUDIT_ORDER_FINISHED**: The voice file was approved by the ticket system and was waiting for the review of the Internet service provider (ISP).</p>
         */
        @NameInMap("AuditState")
        public String auditState;

        /**
         * <p>The reason why the voice file was rejected.</p>
         */
        @NameInMap("RejectInfo")
        public String rejectInfo;

        /**
         * <p>The code of the voice file.</p>
         */
        @NameInMap("VoiceCode")
        public String voiceCode;

        public static QueryVoiceFileAuditInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVoiceFileAuditInfoResponseBodyData self = new QueryVoiceFileAuditInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVoiceFileAuditInfoResponseBodyData setAuditState(String auditState) {
            this.auditState = auditState;
            return this;
        }
        public String getAuditState() {
            return this.auditState;
        }

        public QueryVoiceFileAuditInfoResponseBodyData setRejectInfo(String rejectInfo) {
            this.rejectInfo = rejectInfo;
            return this;
        }
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        public QueryVoiceFileAuditInfoResponseBodyData setVoiceCode(String voiceCode) {
            this.voiceCode = voiceCode;
            return this;
        }
        public String getVoiceCode() {
            return this.voiceCode;
        }

    }

}
