// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallDetailByTaskIdResponseBody body;

    public static QueryCallDetailByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByTaskIdResponse self = new QueryCallDetailByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallDetailByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallDetailByTaskIdResponse setBody(QueryCallDetailByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallDetailByTaskIdResponseBody getBody() {
        return this.body;
    }

}
