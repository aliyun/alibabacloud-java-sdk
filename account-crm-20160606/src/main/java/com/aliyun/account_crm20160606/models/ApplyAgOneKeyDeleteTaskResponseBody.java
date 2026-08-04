// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ApplyAgOneKeyDeleteTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("NeedAbandonSpAfterPay")
    public Boolean needAbandonSpAfterPay;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplyAgOneKeyDeleteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyAgOneKeyDeleteTaskResponseBody self = new ApplyAgOneKeyDeleteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyAgOneKeyDeleteTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyAgOneKeyDeleteTaskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ApplyAgOneKeyDeleteTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyAgOneKeyDeleteTaskResponseBody setNeedAbandonSpAfterPay(Boolean needAbandonSpAfterPay) {
        this.needAbandonSpAfterPay = needAbandonSpAfterPay;
        return this;
    }
    public Boolean getNeedAbandonSpAfterPay() {
        return this.needAbandonSpAfterPay;
    }

    public ApplyAgOneKeyDeleteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyAgOneKeyDeleteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
