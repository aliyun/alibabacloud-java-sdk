// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartMicroOutboundResponseBody extends TeaModel {
    @NameInMap("CustomerInfo")
    public String customerInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InvokeCmdId")
    public String invokeCmdId;

    @NameInMap("Code")
    public String code;

    @NameInMap("InvokeCreateTime")
    public String invokeCreateTime;

    @NameInMap("Message")
    public String message;

    public static StartMicroOutboundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundResponseBody self = new StartMicroOutboundResponseBody();
        return TeaModel.build(map, self);
    }

    public StartMicroOutboundResponseBody setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
        return this;
    }
    public String getCustomerInfo() {
        return this.customerInfo;
    }

    public StartMicroOutboundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartMicroOutboundResponseBody setInvokeCmdId(String invokeCmdId) {
        this.invokeCmdId = invokeCmdId;
        return this;
    }
    public String getInvokeCmdId() {
        return this.invokeCmdId;
    }

    public StartMicroOutboundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartMicroOutboundResponseBody setInvokeCreateTime(String invokeCreateTime) {
        this.invokeCreateTime = invokeCreateTime;
        return this;
    }
    public String getInvokeCreateTime() {
        return this.invokeCreateTime;
    }

    public StartMicroOutboundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
