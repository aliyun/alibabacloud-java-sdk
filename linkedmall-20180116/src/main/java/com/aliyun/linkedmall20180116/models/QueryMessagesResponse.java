// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMessagesResponseBody body;

    public static QueryMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessagesResponse self = new QueryMessagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessagesResponse setBody(QueryMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessagesResponseBody getBody() {
        return this.body;
    }

}
