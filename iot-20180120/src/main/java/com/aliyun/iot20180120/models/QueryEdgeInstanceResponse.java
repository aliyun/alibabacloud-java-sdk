// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEdgeInstanceResponseBody body;

    public static QueryEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceResponse self = new QueryEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeInstanceResponse setBody(QueryEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
