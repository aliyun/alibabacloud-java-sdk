// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductVersionsResponseBody body;

    public static ListProductVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsResponse self = new ListProductVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductVersionsResponse setBody(ListProductVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductVersionsResponseBody getBody() {
        return this.body;
    }

}
