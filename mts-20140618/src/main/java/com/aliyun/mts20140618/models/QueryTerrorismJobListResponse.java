// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTerrorismJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTerrorismJobListResponseBody body;

    public static QueryTerrorismJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTerrorismJobListResponse self = new QueryTerrorismJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryTerrorismJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTerrorismJobListResponse setBody(QueryTerrorismJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTerrorismJobListResponseBody getBody() {
        return this.body;
    }

}
