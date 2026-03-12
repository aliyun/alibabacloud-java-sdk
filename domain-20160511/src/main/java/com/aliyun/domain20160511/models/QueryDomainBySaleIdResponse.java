// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryDomainBySaleIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainBySaleIdResponseBody body;

    public static QueryDomainBySaleIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainBySaleIdResponse self = new QueryDomainBySaleIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainBySaleIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainBySaleIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainBySaleIdResponse setBody(QueryDomainBySaleIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainBySaleIdResponseBody getBody() {
        return this.body;
    }

}
