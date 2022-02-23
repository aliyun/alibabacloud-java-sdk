// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryControlCenterLoginInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryControlCenterLoginInfoResponseBody body;

    public static QueryControlCenterLoginInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryControlCenterLoginInfoResponse self = new QueryControlCenterLoginInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryControlCenterLoginInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryControlCenterLoginInfoResponse setBody(QueryControlCenterLoginInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryControlCenterLoginInfoResponseBody getBody() {
        return this.body;
    }

}
