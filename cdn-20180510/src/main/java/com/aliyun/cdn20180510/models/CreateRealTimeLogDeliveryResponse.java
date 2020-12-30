// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateRealTimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRealTimeLogDeliveryResponseBody body;

    public static CreateRealTimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealTimeLogDeliveryResponse self = new CreateRealTimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealTimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRealTimeLogDeliveryResponse setBody(CreateRealTimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRealTimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
