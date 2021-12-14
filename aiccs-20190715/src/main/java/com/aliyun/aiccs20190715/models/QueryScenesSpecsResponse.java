// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryScenesSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryScenesSpecsResponseBody body;

    public static QueryScenesSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScenesSpecsResponse self = new QueryScenesSpecsResponse();
        return TeaModel.build(map, self);
    }

    public QueryScenesSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScenesSpecsResponse setBody(QueryScenesSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScenesSpecsResponseBody getBody() {
        return this.body;
    }

}
