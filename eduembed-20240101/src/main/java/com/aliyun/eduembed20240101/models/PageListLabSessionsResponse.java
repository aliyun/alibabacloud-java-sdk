// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageListLabSessionsResponseBody body;

    public static PageListLabSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageListLabSessionsResponse self = new PageListLabSessionsResponse();
        return TeaModel.build(map, self);
    }

    public PageListLabSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageListLabSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageListLabSessionsResponse setBody(PageListLabSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageListLabSessionsResponseBody getBody() {
        return this.body;
    }

}
