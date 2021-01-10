// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAIActionResponseBody body;

    public static QueryAIActionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIActionResponse self = new QueryAIActionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAIActionResponse setBody(QueryAIActionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAIActionResponseBody getBody() {
        return this.body;
    }

}
