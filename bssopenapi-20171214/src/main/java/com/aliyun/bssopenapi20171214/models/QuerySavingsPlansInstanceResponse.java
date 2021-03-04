// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySavingsPlansInstanceResponseBody body;

    public static QuerySavingsPlansInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansInstanceResponse self = new QuerySavingsPlansInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySavingsPlansInstanceResponse setBody(QuerySavingsPlansInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySavingsPlansInstanceResponseBody getBody() {
        return this.body;
    }

}
