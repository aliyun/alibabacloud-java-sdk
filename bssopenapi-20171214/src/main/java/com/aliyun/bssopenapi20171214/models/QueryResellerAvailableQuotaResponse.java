// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResellerAvailableQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryResellerAvailableQuotaResponseBody body;

    public static QueryResellerAvailableQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResellerAvailableQuotaResponse self = new QueryResellerAvailableQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryResellerAvailableQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResellerAvailableQuotaResponse setBody(QueryResellerAvailableQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResellerAvailableQuotaResponseBody getBody() {
        return this.body;
    }

}
