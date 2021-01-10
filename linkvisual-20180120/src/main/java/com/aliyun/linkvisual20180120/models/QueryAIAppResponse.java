// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAIAppResponseBody body;

    public static QueryAIAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIAppResponse self = new QueryAIAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAIAppResponse setBody(QueryAIAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAIAppResponseBody getBody() {
        return this.body;
    }

}
