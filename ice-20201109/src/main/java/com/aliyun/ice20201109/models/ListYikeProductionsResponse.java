// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListYikeProductionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListYikeProductionsResponseBody body;

    public static ListYikeProductionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListYikeProductionsResponse self = new ListYikeProductionsResponse();
        return TeaModel.build(map, self);
    }

    public ListYikeProductionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListYikeProductionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListYikeProductionsResponse setBody(ListYikeProductionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListYikeProductionsResponseBody getBody() {
        return this.body;
    }

}
