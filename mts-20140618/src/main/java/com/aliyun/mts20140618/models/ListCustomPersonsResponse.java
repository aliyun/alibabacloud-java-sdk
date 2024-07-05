// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomPersonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomPersonsResponseBody body;

    public static ListCustomPersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomPersonsResponse self = new ListCustomPersonsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomPersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomPersonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomPersonsResponse setBody(ListCustomPersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomPersonsResponseBody getBody() {
        return this.body;
    }

}
