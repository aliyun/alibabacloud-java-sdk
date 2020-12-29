// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public SearchTraceAppByPageResponse setBody(SearchTraceAppByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTraceAppByPageResponseBody getBody() {
        return this.body;
    }

}
