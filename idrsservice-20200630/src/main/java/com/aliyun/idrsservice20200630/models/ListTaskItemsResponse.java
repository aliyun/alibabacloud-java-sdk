// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskItemsResponseBody body;

    public static ListTaskItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskItemsResponse self = new ListTaskItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskItemsResponse setBody(ListTaskItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskItemsResponseBody getBody() {
        return this.body;
    }

}
