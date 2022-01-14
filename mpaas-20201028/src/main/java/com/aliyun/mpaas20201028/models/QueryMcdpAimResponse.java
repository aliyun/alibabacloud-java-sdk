// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcdpAimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMcdpAimResponseBody body;

    public static QueryMcdpAimResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcdpAimResponse self = new QueryMcdpAimResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcdpAimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcdpAimResponse setBody(QueryMcdpAimResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcdpAimResponseBody getBody() {
        return this.body;
    }

}
