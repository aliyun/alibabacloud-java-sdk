// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPagesResponseBody body;

    public static ListPagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPagesResponse self = new ListPagesResponse();
        return TeaModel.build(map, self);
    }

    public ListPagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPagesResponse setBody(ListPagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPagesResponseBody getBody() {
        return this.body;
    }

}
