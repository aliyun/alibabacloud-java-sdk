// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCorpsSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCorpsSpecsResponseBody body;

    public static QueryCorpsSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpsSpecsResponse self = new QueryCorpsSpecsResponse();
        return TeaModel.build(map, self);
    }

    public QueryCorpsSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCorpsSpecsResponse setBody(QueryCorpsSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCorpsSpecsResponseBody getBody() {
        return this.body;
    }

}
