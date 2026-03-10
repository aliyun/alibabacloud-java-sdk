// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListMemoryStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMemoryStoresResponseBody body;

    public static ListMemoryStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryStoresResponse self = new ListMemoryStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListMemoryStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMemoryStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMemoryStoresResponse setBody(ListMemoryStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMemoryStoresResponseBody getBody() {
        return this.body;
    }

}
