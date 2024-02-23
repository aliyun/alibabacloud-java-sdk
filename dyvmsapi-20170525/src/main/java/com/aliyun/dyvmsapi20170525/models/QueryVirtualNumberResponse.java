// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVirtualNumberResponseBody body;

    public static QueryVirtualNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVirtualNumberResponse self = new QueryVirtualNumberResponse();
        return TeaModel.build(map, self);
    }

    public QueryVirtualNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVirtualNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVirtualNumberResponse setBody(QueryVirtualNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVirtualNumberResponseBody getBody() {
        return this.body;
    }

}
