// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListTrusteeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrusteeOrderResponseBody body;

    public static ListTrusteeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrusteeOrderResponse self = new ListTrusteeOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListTrusteeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrusteeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrusteeOrderResponse setBody(ListTrusteeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrusteeOrderResponseBody getBody() {
        return this.body;
    }

}
