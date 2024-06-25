// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryShortUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryShortUrlResponseBody body;

    public static QueryShortUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlResponse self = new QueryShortUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShortUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShortUrlResponse setBody(QueryShortUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShortUrlResponseBody getBody() {
        return this.body;
    }

}
