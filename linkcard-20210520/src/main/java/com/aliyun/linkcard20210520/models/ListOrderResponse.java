// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrderResponseBody body;

    public static ListOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrderResponse self = new ListOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrderResponse setBody(ListOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrderResponseBody getBody() {
        return this.body;
    }

}
