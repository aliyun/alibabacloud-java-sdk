// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QueryDataMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDataMessageResponseBody body;

    public static QueryDataMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataMessageResponse self = new QueryDataMessageResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataMessageResponse setBody(QueryDataMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataMessageResponseBody getBody() {
        return this.body;
    }

}
