// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySingleActivityInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySingleActivityInfoResponseBody body;

    public static QuerySingleActivityInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleActivityInfoResponse self = new QuerySingleActivityInfoResponse();
        return TeaModel.build(map, self);
    }

    public QuerySingleActivityInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySingleActivityInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySingleActivityInfoResponse setBody(QuerySingleActivityInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySingleActivityInfoResponseBody getBody() {
        return this.body;
    }

}
