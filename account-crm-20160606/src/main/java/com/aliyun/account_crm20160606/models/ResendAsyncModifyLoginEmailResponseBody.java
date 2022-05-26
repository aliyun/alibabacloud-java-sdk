// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ResendAsyncModifyLoginEmailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceNo")
    public String traceNo;

    public static ResendAsyncModifyLoginEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendAsyncModifyLoginEmailResponseBody self = new ResendAsyncModifyLoginEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendAsyncModifyLoginEmailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResendAsyncModifyLoginEmailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResendAsyncModifyLoginEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendAsyncModifyLoginEmailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ResendAsyncModifyLoginEmailResponseBody setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

}
