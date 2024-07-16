// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChunksResponseBody body;

    public static ListChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChunksResponse self = new ListChunksResponse();
        return TeaModel.build(map, self);
    }

    public ListChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChunksResponse setBody(ListChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChunksResponseBody getBody() {
        return this.body;
    }

}
