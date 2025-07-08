// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPhoneWhiteListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPhoneWhiteListNewResponseBody body;

    public static QueryPhoneWhiteListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneWhiteListNewResponse self = new QueryPhoneWhiteListNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryPhoneWhiteListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPhoneWhiteListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPhoneWhiteListNewResponse setBody(QueryPhoneWhiteListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPhoneWhiteListNewResponseBody getBody() {
        return this.body;
    }

}
