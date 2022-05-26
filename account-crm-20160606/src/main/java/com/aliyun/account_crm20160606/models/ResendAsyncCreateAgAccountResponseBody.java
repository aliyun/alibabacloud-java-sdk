// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ResendAsyncCreateAgAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("TraceNo")
    public String traceNo;

    public static ResendAsyncCreateAgAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendAsyncCreateAgAccountResponseBody self = new ResendAsyncCreateAgAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendAsyncCreateAgAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResendAsyncCreateAgAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResendAsyncCreateAgAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendAsyncCreateAgAccountResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ResendAsyncCreateAgAccountResponseBody setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

}
