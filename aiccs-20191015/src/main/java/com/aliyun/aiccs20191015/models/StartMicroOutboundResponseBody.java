// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartMicroOutboundResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;caseId\&quot;:2323****}</p>
     */
    @NameInMap("CustomerInfo")
    public String customerInfo;

    /**
     * <strong>example:</strong>
     * <p>8883f165-4a0d-4da2-a2d2</p>
     */
    @NameInMap("InvokeCmdId")
    public String invokeCmdId;

    /**
     * <strong>example:</strong>
     * <p>2019-05-23 17:30:32.525</p>
     */
    @NameInMap("InvokeCreateTime")
    public String invokeCreateTime;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartMicroOutboundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundResponseBody self = new StartMicroOutboundResponseBody();
        return TeaModel.build(map, self);
    }

    public StartMicroOutboundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartMicroOutboundResponseBody setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
        return this;
    }
    public String getCustomerInfo() {
        return this.customerInfo;
    }

    public StartMicroOutboundResponseBody setInvokeCmdId(String invokeCmdId) {
        this.invokeCmdId = invokeCmdId;
        return this;
    }
    public String getInvokeCmdId() {
        return this.invokeCmdId;
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

    public StartMicroOutboundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
