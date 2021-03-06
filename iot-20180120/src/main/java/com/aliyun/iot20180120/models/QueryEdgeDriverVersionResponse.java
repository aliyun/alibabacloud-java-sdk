// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEdgeDriverVersionResponseBody body;

    public static QueryEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverVersionResponse self = new QueryEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEdgeDriverVersionResponse setBody(QueryEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
