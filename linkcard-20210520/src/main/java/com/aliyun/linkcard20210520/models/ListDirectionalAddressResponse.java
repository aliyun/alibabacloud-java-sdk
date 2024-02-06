// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListDirectionalAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDirectionalAddressResponseBody body;

    public static ListDirectionalAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDirectionalAddressResponse self = new ListDirectionalAddressResponse();
        return TeaModel.build(map, self);
    }

    public ListDirectionalAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDirectionalAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDirectionalAddressResponse setBody(ListDirectionalAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDirectionalAddressResponseBody getBody() {
        return this.body;
    }

}
