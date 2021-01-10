// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProductTopicResponseBody body;

    public static QueryProductTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductTopicResponse self = new QueryProductTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductTopicResponse setBody(QueryProductTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductTopicResponseBody getBody() {
        return this.body;
    }

}
