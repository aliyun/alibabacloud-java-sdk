// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryRingToneUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRingToneUrlResponseBody body;

    public static QueryRingToneUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRingToneUrlResponse self = new QueryRingToneUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRingToneUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRingToneUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRingToneUrlResponse setBody(QueryRingToneUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRingToneUrlResponseBody getBody() {
        return this.body;
    }

}
