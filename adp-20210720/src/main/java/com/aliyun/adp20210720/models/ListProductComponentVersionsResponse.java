// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductComponentVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductComponentVersionsResponseBody body;

    public static ListProductComponentVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductComponentVersionsResponse self = new ListProductComponentVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductComponentVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductComponentVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductComponentVersionsResponse setBody(ListProductComponentVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductComponentVersionsResponseBody getBody() {
        return this.body;
    }

}
