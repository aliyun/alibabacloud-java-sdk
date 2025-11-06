// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateLogDeliverySLRResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLogDeliverySLRResponseBody body;

    public static CreateLogDeliverySLRResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogDeliverySLRResponse self = new CreateLogDeliverySLRResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogDeliverySLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogDeliverySLRResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogDeliverySLRResponse setBody(CreateLogDeliverySLRResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogDeliverySLRResponseBody getBody() {
        return this.body;
    }

}
