// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainListResponseBody body;

    public static QueryDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainListResponse self = new QueryDomainListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainListResponse setBody(QueryDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainListResponseBody getBody() {
        return this.body;
    }

}
