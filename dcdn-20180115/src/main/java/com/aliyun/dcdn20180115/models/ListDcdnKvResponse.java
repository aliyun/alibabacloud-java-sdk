// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDcdnKvResponseBody body;

    public static ListDcdnKvResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnKvResponse self = new ListDcdnKvResponse();
        return TeaModel.build(map, self);
    }

    public ListDcdnKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDcdnKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDcdnKvResponse setBody(ListDcdnKvResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDcdnKvResponseBody getBody() {
        return this.body;
    }

}
