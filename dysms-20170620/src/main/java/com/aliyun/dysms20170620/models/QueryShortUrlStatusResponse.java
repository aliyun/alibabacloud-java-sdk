// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryShortUrlStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryShortUrlStatusResponseBody body;

    public static QueryShortUrlStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlStatusResponse self = new QueryShortUrlStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShortUrlStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShortUrlStatusResponse setBody(QueryShortUrlStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShortUrlStatusResponseBody getBody() {
        return this.body;
    }

}
