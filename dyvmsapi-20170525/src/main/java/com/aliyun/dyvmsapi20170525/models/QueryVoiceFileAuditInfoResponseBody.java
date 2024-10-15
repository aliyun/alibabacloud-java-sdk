// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoiceFileAuditInfoResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>The value OK indicates that the request was successful. For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
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
         * <ul>
         * <li><strong>AUDIT_STATE_INIT</strong>: The voice file was under review.</li>
         * <li><strong>AUDIT_STATE_PASS</strong>: The voice file was approved.</li>
         * <li><strong>AUDIT_STATE_NOT_PASS</strong>: The voice file was rejected.</li>
         * <li><strong>AUDIT_STATE_UPLOADING</strong>: The voice file was approved and is being uploaded.</li>
         * <li><strong>AUDIT_STATE_REDOING</strong>: The voice file was being reprocessed.</li>
         * <li><strong>AUDIT_SATE_CANCEL</strong>: The review of the voice file was canceled.</li>
         * <li><strong>AUDIT_PAUSE</strong>: The review of the voice file was suspended.</li>
         * <li><strong>AUDIT_ORDER_FINISHED</strong>: The voice file was approved by the ticket system and was waiting for the review of the Internet service provider (ISP).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUDIT_STATE_NOT_PASS</p>
         */
        @NameInMap("AuditState")
        public String auditState;

        /**
         * <p>The reason why the voice file was rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>This business is not supported</p>
         */
        @NameInMap("RejectInfo")
        public String rejectInfo;

        /**
         * <p>The code of the voice file.</p>
         * 
         * <strong>example:</strong>
         * <p>8501d2eb-efbb-471f-xxx8-****.wav</p>
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
