// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageListLabsResponseBody body;

    public static PageListLabsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageListLabsResponse self = new PageListLabsResponse();
        return TeaModel.build(map, self);
    }

    public PageListLabsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageListLabsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageListLabsResponse setBody(PageListLabsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageListLabsResponseBody getBody() {
        return this.body;
    }

}
