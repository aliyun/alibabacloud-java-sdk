// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeMiniPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMcubeMiniPackageResponseBody body;

    public static QueryMcubeMiniPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeMiniPackageResponse self = new QueryMcubeMiniPackageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcubeMiniPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMcubeMiniPackageResponse setBody(QueryMcubeMiniPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMcubeMiniPackageResponseBody getBody() {
        return this.body;
    }

}
