// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchTracesByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SearchTracesByPageResponse setBody(SearchTracesByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTracesByPageResponseBody getBody() {
        return this.body;
    }

}
