// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListIndexVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIndexVersionsResponseBody body;

    public static ListIndexVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndexVersionsResponse self = new ListIndexVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListIndexVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndexVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndexVersionsResponse setBody(ListIndexVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndexVersionsResponseBody getBody() {
        return this.body;
    }

}
