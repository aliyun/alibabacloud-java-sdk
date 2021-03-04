// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCostUnitResponseBody body;

    public static QueryCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResponse self = new QueryCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public QueryCostUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCostUnitResponse setBody(QueryCostUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCostUnitResponseBody getBody() {
        return this.body;
    }

}
