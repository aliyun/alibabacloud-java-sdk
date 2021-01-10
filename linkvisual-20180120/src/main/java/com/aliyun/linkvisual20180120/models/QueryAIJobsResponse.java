// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAIJobsResponseBody body;

    public static QueryAIJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIJobsResponse self = new QueryAIJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAIJobsResponse setBody(QueryAIJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAIJobsResponseBody getBody() {
        return this.body;
    }

}
