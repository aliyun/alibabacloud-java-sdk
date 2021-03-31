// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InvokeId")
    @Validation(required = true)
    public String invokeId;

    public static SendFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponse self = new SendFileResponse();
        return TeaModel.build(map, self);
    }

    public SendFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendFileResponse setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

}
