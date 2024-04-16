// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishesResponseBody body;

    public static ListPublishesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishesResponse self = new ListPublishesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishesResponse setBody(ListPublishesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishesResponseBody getBody() {
        return this.body;
    }

}
