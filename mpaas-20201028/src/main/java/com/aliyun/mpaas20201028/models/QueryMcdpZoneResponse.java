// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcdpZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMcdpZoneResponseBody body;

    public static QueryMcdpZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcdpZoneResponse self = new QueryMcdpZoneResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcdpZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcdpZoneResponse setBody(QueryMcdpZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcdpZoneResponseBody getBody() {
        return this.body;
    }

}
