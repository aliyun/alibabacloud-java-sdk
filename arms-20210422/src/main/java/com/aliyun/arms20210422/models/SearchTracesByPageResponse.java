// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchTracesByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTracesByPageResponseBody body;

    public static SearchTracesByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageResponse self = new SearchTracesByPageResponse();
        return TeaModel.build(map, self);
    }

    public SearchTracesByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTracesByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTracesByPageResponse setBody(SearchTracesByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTracesByPageResponseBody getBody() {
        return this.body;
    }

}
