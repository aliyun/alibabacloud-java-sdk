// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAccessorIpResponseBody body;

    public static QueryAccessorIpResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorIpResponse self = new QueryAccessorIpResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccessorIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccessorIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAccessorIpResponse setBody(QueryAccessorIpResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccessorIpResponseBody getBody() {
        return this.body;
    }

}
