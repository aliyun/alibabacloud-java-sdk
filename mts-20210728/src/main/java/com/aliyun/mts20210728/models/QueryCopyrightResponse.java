// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCopyrightResponseBody body;

    public static QueryCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightResponse self = new QueryCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightResponse setBody(QueryCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightResponseBody getBody() {
        return this.body;
    }

}
