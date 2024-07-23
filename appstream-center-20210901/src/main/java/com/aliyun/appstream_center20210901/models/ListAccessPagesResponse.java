// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAccessPagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessPagesResponseBody body;

    public static ListAccessPagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPagesResponse self = new ListAccessPagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessPagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessPagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessPagesResponse setBody(ListAccessPagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessPagesResponseBody getBody() {
        return this.body;
    }

}
