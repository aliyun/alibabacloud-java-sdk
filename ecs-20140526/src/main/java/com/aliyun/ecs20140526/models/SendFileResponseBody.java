// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the command task.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponseBody self = new SendFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SendFileResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public SendFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
