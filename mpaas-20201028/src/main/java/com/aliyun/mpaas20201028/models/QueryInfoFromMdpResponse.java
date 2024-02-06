// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryInfoFromMdpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInfoFromMdpResponseBody body;

    public static QueryInfoFromMdpResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInfoFromMdpResponse self = new QueryInfoFromMdpResponse();
        return TeaModel.build(map, self);
    }

    public QueryInfoFromMdpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInfoFromMdpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInfoFromMdpResponse setBody(QueryInfoFromMdpResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInfoFromMdpResponseBody getBody() {
        return this.body;
    }

}
