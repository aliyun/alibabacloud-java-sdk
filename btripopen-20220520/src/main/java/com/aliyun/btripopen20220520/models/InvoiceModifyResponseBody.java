// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceModifyResponseBody extends TeaModel {
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

    public static InvoiceModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvoiceModifyResponseBody self = new InvoiceModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public InvoiceModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvoiceModifyResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public InvoiceModifyResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InvoiceModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvoiceModifyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
