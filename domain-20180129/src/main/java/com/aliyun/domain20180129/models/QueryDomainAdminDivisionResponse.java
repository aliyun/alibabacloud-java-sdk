// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainAdminDivisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainAdminDivisionResponseBody body;

    public static QueryDomainAdminDivisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainAdminDivisionResponse self = new QueryDomainAdminDivisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainAdminDivisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainAdminDivisionResponse setBody(QueryDomainAdminDivisionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainAdminDivisionResponseBody getBody() {
        return this.body;
    }

}
