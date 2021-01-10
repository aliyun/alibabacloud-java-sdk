// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEdgeDriverResponseBody body;

    public static QueryEdgeDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverResponse self = new QueryEdgeDriverResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeDriverResponse setBody(QueryEdgeDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeDriverResponseBody getBody() {
        return this.body;
    }

}
