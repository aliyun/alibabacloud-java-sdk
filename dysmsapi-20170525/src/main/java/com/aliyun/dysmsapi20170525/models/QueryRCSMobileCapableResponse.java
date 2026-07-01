// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRCSMobileCapableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRCSMobileCapableResponseBody body;

    public static QueryRCSMobileCapableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRCSMobileCapableResponse self = new QueryRCSMobileCapableResponse();
        return TeaModel.build(map, self);
    }

    public QueryRCSMobileCapableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRCSMobileCapableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRCSMobileCapableResponse setBody(QueryRCSMobileCapableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRCSMobileCapableResponseBody getBody() {
        return this.body;
    }

}
