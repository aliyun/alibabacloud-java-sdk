// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListReverseOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListReverseOrderResponseBody body;

    public static ListReverseOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReverseOrderResponse self = new ListReverseOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListReverseOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReverseOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReverseOrderResponse setBody(ListReverseOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReverseOrderResponseBody getBody() {
        return this.body;
    }

}
