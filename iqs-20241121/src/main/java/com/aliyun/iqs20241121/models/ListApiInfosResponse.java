// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiInfosResponseBody body;

    public static ListApiInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiInfosResponse self = new ListApiInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListApiInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiInfosResponse setBody(ListApiInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiInfosResponseBody getBody() {
        return this.body;
    }

}
