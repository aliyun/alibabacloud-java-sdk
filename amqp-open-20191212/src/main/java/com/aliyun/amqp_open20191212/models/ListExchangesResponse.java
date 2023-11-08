// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListExchangesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExchangesResponseBody body;

    public static ListExchangesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExchangesResponse self = new ListExchangesResponse();
        return TeaModel.build(map, self);
    }

    public ListExchangesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExchangesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExchangesResponse setBody(ListExchangesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExchangesResponseBody getBody() {
        return this.body;
    }

}
