// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMgsApipageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMgsApipageResponseBody body;

    public static QueryMgsApipageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApipageResponse self = new QueryMgsApipageResponse();
        return TeaModel.build(map, self);
    }

    public QueryMgsApipageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMgsApipageResponse setBody(QueryMgsApipageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMgsApipageResponseBody getBody() {
        return this.body;
    }

}
