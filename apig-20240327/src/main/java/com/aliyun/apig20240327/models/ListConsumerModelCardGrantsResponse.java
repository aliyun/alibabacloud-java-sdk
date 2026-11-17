// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerModelCardGrantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerModelCardGrantsResponseBody body;

    public static ListConsumerModelCardGrantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerModelCardGrantsResponse self = new ListConsumerModelCardGrantsResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerModelCardGrantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerModelCardGrantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerModelCardGrantsResponse setBody(ListConsumerModelCardGrantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerModelCardGrantsResponseBody getBody() {
        return this.body;
    }

}
