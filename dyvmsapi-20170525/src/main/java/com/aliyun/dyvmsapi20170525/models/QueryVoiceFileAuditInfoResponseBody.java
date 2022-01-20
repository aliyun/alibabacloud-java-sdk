// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoiceFileAuditInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryVoiceFileAuditInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AuditState")
        public String auditState;

        @NameInMap("RejectInfo")
        public String rejectInfo;

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
