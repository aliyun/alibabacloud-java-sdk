// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTraceAppByNameResponseBody body;

    public static SearchTraceAppByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameResponse self = new SearchTraceAppByNameResponse();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTraceAppByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTraceAppByNameResponse setBody(SearchTraceAppByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTraceAppByNameResponseBody getBody() {
        return this.body;
    }

}
