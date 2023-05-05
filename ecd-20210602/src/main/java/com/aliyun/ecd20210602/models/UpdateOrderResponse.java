// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOrderResponseBody body;

    public static UpdateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrderResponse self = new UpdateOrderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOrderResponse setBody(UpdateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOrderResponseBody getBody() {
        return this.body;
    }

}
