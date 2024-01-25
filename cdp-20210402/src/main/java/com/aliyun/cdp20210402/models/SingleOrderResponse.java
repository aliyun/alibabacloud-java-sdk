// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class SingleOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SingleOrderResponseBody body;

    public static SingleOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleOrderResponse self = new SingleOrderResponse();
        return TeaModel.build(map, self);
    }

    public SingleOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleOrderResponse setBody(SingleOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleOrderResponseBody getBody() {
        return this.body;
    }

}
