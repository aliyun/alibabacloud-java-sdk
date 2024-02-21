// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListTagValuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagValuesResponseBody body;

    public static ListTagValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesResponse self = new ListTagValuesResponse();
        return TeaModel.build(map, self);
    }

    public ListTagValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagValuesResponse setBody(ListTagValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagValuesResponseBody getBody() {
        return this.body;
    }

}
