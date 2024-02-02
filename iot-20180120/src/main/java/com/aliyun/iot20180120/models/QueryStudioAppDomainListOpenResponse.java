// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppDomainListOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStudioAppDomainListOpenResponseBody body;

    public static QueryStudioAppDomainListOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppDomainListOpenResponse self = new QueryStudioAppDomainListOpenResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppDomainListOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStudioAppDomainListOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStudioAppDomainListOpenResponse setBody(QueryStudioAppDomainListOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStudioAppDomainListOpenResponseBody getBody() {
        return this.body;
    }

}
