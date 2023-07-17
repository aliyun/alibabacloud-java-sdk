// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTraceAppByPageResponseBody body;

    public static SearchTraceAppByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByPageResponse self = new SearchTraceAppByPageResponse();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTraceAppByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTraceAppByPageResponse setBody(SearchTraceAppByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTraceAppByPageResponseBody getBody() {
        return this.body;
    }

}
