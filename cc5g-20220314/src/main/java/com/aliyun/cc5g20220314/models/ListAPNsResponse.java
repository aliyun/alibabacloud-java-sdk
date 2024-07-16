// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListAPNsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAPNsResponseBody body;

    public static ListAPNsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAPNsResponse self = new ListAPNsResponse();
        return TeaModel.build(map, self);
    }

    public ListAPNsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAPNsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAPNsResponse setBody(ListAPNsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAPNsResponseBody getBody() {
        return this.body;
    }

}
