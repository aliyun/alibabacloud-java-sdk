// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class SearchTlogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTlogResponseBody body;

    public static SearchTlogResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTlogResponse self = new SearchTlogResponse();
        return TeaModel.build(map, self);
    }

    public SearchTlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTlogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTlogResponse setBody(SearchTlogResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTlogResponseBody getBody() {
        return this.body;
    }

}
