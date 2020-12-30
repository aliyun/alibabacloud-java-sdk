// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCardStatusResponseBody body;

    public static QueryCardStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCardStatusResponse self = new QueryCardStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryCardStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCardStatusResponse setBody(QueryCardStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCardStatusResponseBody getBody() {
        return this.body;
    }

}
