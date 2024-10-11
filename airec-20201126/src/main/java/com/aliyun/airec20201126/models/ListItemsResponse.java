// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListItemsResponseBody body;

    public static ListItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListItemsResponse self = new ListItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListItemsResponse setBody(ListItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListItemsResponseBody getBody() {
        return this.body;
    }

}
