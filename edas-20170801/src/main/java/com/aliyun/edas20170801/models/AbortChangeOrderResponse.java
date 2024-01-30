// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AbortChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortChangeOrderResponseBody body;

    public static AbortChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderResponse self = new AbortChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortChangeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortChangeOrderResponse setBody(AbortChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortChangeOrderResponseBody getBody() {
        return this.body;
    }

}
