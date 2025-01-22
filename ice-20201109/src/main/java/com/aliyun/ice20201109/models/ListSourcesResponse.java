// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSourcesResponseBody body;

    public static ListSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourcesResponse self = new ListSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSourcesResponse setBody(ListSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSourcesResponseBody getBody() {
        return this.body;
    }

}
