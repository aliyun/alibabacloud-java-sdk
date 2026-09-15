// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaChunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLumaChunksResponseBody body;

    public static ListLumaChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLumaChunksResponse self = new ListLumaChunksResponse();
        return TeaModel.build(map, self);
    }

    public ListLumaChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLumaChunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLumaChunksResponse setBody(ListLumaChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLumaChunksResponseBody getBody() {
        return this.body;
    }

}
