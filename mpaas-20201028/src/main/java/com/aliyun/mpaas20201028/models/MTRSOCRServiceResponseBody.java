// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class MTRSOCRServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("TraceId")
    public String traceId;

    public static MTRSOCRServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MTRSOCRServiceResponseBody self = new MTRSOCRServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public MTRSOCRServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MTRSOCRServiceResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public MTRSOCRServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MTRSOCRServiceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public MTRSOCRServiceResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public MTRSOCRServiceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
