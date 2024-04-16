// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishVersionsResponseBody body;

    public static ListPublishVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishVersionsResponse self = new ListPublishVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishVersionsResponse setBody(ListPublishVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishVersionsResponseBody getBody() {
        return this.body;
    }

}
