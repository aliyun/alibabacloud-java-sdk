// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryDNAJobListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDNAJobListResponseBody body;

    public static QueryDNAJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDNAJobListResponse self = new QueryDNAJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDNAJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDNAJobListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDNAJobListResponse setBody(QueryDNAJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDNAJobListResponseBody getBody() {
        return this.body;
    }

}
