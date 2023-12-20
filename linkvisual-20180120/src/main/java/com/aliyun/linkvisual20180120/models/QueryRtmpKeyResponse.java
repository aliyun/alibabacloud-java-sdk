// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRtmpKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRtmpKeyResponseBody body;

    public static QueryRtmpKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtmpKeyResponse self = new QueryRtmpKeyResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtmpKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRtmpKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRtmpKeyResponse setBody(QueryRtmpKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRtmpKeyResponseBody getBody() {
        return this.body;
    }

}
