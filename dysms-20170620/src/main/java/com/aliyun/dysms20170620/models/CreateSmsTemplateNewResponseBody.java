// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateNewResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSmsTemplateNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateNewResponseBody self = new CreateSmsTemplateNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateNewResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSmsTemplateNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
