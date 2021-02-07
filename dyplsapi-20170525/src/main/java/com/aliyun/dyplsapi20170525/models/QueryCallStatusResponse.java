// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCallStatusResponseBody body;

    public static QueryCallStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallStatusResponse self = new QueryCallStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallStatusResponse setBody(QueryCallStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallStatusResponseBody getBody() {
        return this.body;
    }

}
