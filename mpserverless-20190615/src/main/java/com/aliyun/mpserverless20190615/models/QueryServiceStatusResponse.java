// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryServiceStatusResponseBody body;

    public static QueryServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceStatusResponse self = new QueryServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServiceStatusResponse setBody(QueryServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServiceStatusResponseBody getBody() {
        return this.body;
    }

}
