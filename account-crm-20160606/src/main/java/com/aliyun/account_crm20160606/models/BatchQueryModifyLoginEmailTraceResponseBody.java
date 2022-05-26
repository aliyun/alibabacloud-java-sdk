// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryModifyLoginEmailTraceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Traces")
    public java.util.List<BatchQueryModifyLoginEmailTraceResponseBodyTraces> traces;

    public static BatchQueryModifyLoginEmailTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryModifyLoginEmailTraceResponseBody self = new BatchQueryModifyLoginEmailTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryModifyLoginEmailTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryModifyLoginEmailTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchQueryModifyLoginEmailTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryModifyLoginEmailTraceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public BatchQueryModifyLoginEmailTraceResponseBody setTraces(java.util.List<BatchQueryModifyLoginEmailTraceResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<BatchQueryModifyLoginEmailTraceResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public static class BatchQueryModifyLoginEmailTraceResponseBodyTraces extends TeaModel {
        @NameInMap("NewLoginEmail")
        public String newLoginEmail;

        @NameInMap("NowLoginEmail")
        public String nowLoginEmail;

        @NameInMap("OldLoginEmail")
        public String oldLoginEmail;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Status")
        public String status;

        @NameInMap("TraceNo")
        public String traceNo;

        public static BatchQueryModifyLoginEmailTraceResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryModifyLoginEmailTraceResponseBodyTraces self = new BatchQueryModifyLoginEmailTraceResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public BatchQueryModifyLoginEmailTraceResponseBodyTraces setNewLoginEmail(String newLoginEmail) {
            this.newLoginEmail = newLoginEmail;
            return this;
        }
        public String getNewLoginEmail() {
            return this.newLoginEmail;
        }

        public BatchQueryModifyLoginEmailTraceResponseBodyTraces setNowLoginEmail(String nowLoginEmail) {
            this.nowLoginEmail = nowLoginEmail;
            return this;
        }
        public String getNowLoginEmail() {
            return this.nowLoginEmail;
        }

        public BatchQueryModifyLoginEmailTraceResponseBodyTraces setOldLoginEmail(String oldLoginEmail) {
            this.oldLoginEmail = oldLoginEmail;
            return this;
        }
        public String getOldLoginEmail() {
            return this.oldLoginEmail;
        }

        public BatchQueryModifyLoginEmailTraceResponseBodyTraces setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public BatchQueryModifyLoginEmailTraceResponseBodyTraces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryModifyLoginEmailTraceResponseBodyTraces setTraceNo(String traceNo) {
            this.traceNo = traceNo;
            return this;
        }
        public String getTraceNo() {
            return this.traceNo;
        }

    }

}
