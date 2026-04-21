// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListVoicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVoicesResponseBody body;

    public static ListVoicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoicesResponse self = new ListVoicesResponse();
        return TeaModel.build(map, self);
    }

    public ListVoicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoicesResponse setBody(ListVoicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoicesResponseBody getBody() {
        return this.body;
    }

}
