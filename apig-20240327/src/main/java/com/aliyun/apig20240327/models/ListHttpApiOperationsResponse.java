// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHttpApiOperationsResponseBody body;

    public static ListHttpApiOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiOperationsResponse self = new ListHttpApiOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListHttpApiOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHttpApiOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHttpApiOperationsResponse setBody(ListHttpApiOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHttpApiOperationsResponseBody getBody() {
        return this.body;
    }

}
