// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DisposeServiceWorkOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisposeServiceWorkOrderResponseBody body;

    public static DisposeServiceWorkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DisposeServiceWorkOrderResponse self = new DisposeServiceWorkOrderResponse();
        return TeaModel.build(map, self);
    }

    public DisposeServiceWorkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisposeServiceWorkOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisposeServiceWorkOrderResponse setBody(DisposeServiceWorkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DisposeServiceWorkOrderResponseBody getBody() {
        return this.body;
    }

}
