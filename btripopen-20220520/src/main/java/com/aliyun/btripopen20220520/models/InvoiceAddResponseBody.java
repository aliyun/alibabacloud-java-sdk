// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceAddResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static InvoiceAddResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceAddResponseBody self = new InvoiceAddResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceAddResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceAddResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public InvoiceAddResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InvoiceAddResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceAddResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
