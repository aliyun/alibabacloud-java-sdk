// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOriginPoolsResponseBody body;

    public static ListOriginPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOriginPoolsResponse self = new ListOriginPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListOriginPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOriginPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOriginPoolsResponse setBody(ListOriginPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOriginPoolsResponseBody getBody() {
        return this.body;
    }

}
