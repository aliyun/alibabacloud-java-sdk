// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubsIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySubsIdResponseBody body;

    public static QuerySubsIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubsIdResponse self = new QuerySubsIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubsIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySubsIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySubsIdResponse setBody(QuerySubsIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySubsIdResponseBody getBody() {
        return this.body;
    }

}
