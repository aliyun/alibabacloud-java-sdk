// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListListsResponseBody body;

    public static ListListsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListsResponse self = new ListListsResponse();
        return TeaModel.build(map, self);
    }

    public ListListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListListsResponse setBody(ListListsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListsResponseBody getBody() {
        return this.body;
    }

}
