// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryCreateAccountTraceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Traces")
    public java.util.List<BatchQueryCreateAccountTraceResponseBodyTraces> traces;

    public static BatchQueryCreateAccountTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryCreateAccountTraceResponseBody self = new BatchQueryCreateAccountTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryCreateAccountTraceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryCreateAccountTraceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchQueryCreateAccountTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryCreateAccountTraceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchQueryCreateAccountTraceResponseBody setTraces(java.util.List<BatchQueryCreateAccountTraceResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<BatchQueryCreateAccountTraceResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public static class BatchQueryCreateAccountTraceResponseBodyTraces extends TeaModel {
        @NameInMap("NowLoginEmail")
        public String nowLoginEmail;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("Status")
        public String status;

        @NameInMap("TraceNo")
        public String traceNo;

        public static BatchQueryCreateAccountTraceResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryCreateAccountTraceResponseBodyTraces self = new BatchQueryCreateAccountTraceResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public BatchQueryCreateAccountTraceResponseBodyTraces setNowLoginEmail(String nowLoginEmail) {
            this.nowLoginEmail = nowLoginEmail;
            return this;
        }
        public String getNowLoginEmail() {
            return this.nowLoginEmail;
        }

        public BatchQueryCreateAccountTraceResponseBodyTraces setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public BatchQueryCreateAccountTraceResponseBodyTraces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryCreateAccountTraceResponseBodyTraces setTraceNo(String traceNo) {
            this.traceNo = traceNo;
            return this;
        }
        public String getTraceNo() {
            return this.traceNo;
        }

    }

}
