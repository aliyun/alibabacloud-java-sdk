// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRcsSignMenuByVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRcsSignMenuByVersionResponseBody body;

    public static QueryRcsSignMenuByVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRcsSignMenuByVersionResponse self = new QueryRcsSignMenuByVersionResponse();
        return TeaModel.build(map, self);
    }

    public QueryRcsSignMenuByVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRcsSignMenuByVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRcsSignMenuByVersionResponse setBody(QueryRcsSignMenuByVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRcsSignMenuByVersionResponseBody getBody() {
        return this.body;
    }

}
