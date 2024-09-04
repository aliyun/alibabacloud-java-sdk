// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryAllActivityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAllActivityInfoResponseBody body;

    public static QueryAllActivityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllActivityInfoResponse self = new QueryAllActivityInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllActivityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllActivityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAllActivityInfoResponse setBody(QueryAllActivityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllActivityInfoResponseBody getBody() {
        return this.body;
    }

}
