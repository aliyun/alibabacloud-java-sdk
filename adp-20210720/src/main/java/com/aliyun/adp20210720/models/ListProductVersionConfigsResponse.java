// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductVersionConfigsResponseBody body;

    public static ListProductVersionConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigsResponse self = new ListProductVersionConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductVersionConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductVersionConfigsResponse setBody(ListProductVersionConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductVersionConfigsResponseBody getBody() {
        return this.body;
    }

}
