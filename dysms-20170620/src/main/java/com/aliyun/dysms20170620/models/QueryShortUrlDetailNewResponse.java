// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryShortUrlDetailNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryShortUrlDetailNewResponseBody body;

    public static QueryShortUrlDetailNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlDetailNewResponse self = new QueryShortUrlDetailNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlDetailNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryShortUrlDetailNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryShortUrlDetailNewResponse setBody(QueryShortUrlDetailNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryShortUrlDetailNewResponseBody getBody() {
        return this.body;
    }

}
