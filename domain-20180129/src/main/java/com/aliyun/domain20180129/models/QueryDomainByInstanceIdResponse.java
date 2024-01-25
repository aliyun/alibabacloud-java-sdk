// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByInstanceIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDomainByInstanceIdResponseBody body;

    public static QueryDomainByInstanceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByInstanceIdResponse self = new QueryDomainByInstanceIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainByInstanceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainByInstanceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDomainByInstanceIdResponse setBody(QueryDomainByInstanceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainByInstanceIdResponseBody getBody() {
        return this.body;
    }

}
