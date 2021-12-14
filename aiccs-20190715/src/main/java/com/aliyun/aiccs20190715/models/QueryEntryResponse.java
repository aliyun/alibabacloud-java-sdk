// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEntryResponseBody body;

    public static QueryEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEntryResponse self = new QueryEntryResponse();
        return TeaModel.build(map, self);
    }

    public QueryEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEntryResponse setBody(QueryEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEntryResponseBody getBody() {
        return this.body;
    }

}
