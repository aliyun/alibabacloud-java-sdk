// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchBodyTraceResponseBody body;

    public static SearchBodyTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyTraceResponse self = new SearchBodyTraceResponse();
        return TeaModel.build(map, self);
    }

    public SearchBodyTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchBodyTraceResponse setBody(SearchBodyTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchBodyTraceResponseBody getBody() {
        return this.body;
    }

}
