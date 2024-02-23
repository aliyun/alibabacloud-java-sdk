// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByCallIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallDetailByCallIdResponseBody body;

    public static QueryCallDetailByCallIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByCallIdResponse self = new QueryCallDetailByCallIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByCallIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallDetailByCallIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallDetailByCallIdResponse setBody(QueryCallDetailByCallIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallDetailByCallIdResponseBody getBody() {
        return this.body;
    }

}
