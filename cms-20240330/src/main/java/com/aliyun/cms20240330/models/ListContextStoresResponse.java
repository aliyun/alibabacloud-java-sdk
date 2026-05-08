// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContextStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextStoresResponseBody body;

    public static ListContextStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextStoresResponse self = new ListContextStoresResponse();
        return TeaModel.build(map, self);
    }

    public ListContextStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextStoresResponse setBody(ListContextStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextStoresResponseBody getBody() {
        return this.body;
    }

}
