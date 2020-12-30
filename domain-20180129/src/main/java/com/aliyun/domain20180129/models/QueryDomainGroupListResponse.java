// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainGroupListResponseBody body;

    public static QueryDomainGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainGroupListResponse self = new QueryDomainGroupListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainGroupListResponse setBody(QueryDomainGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainGroupListResponseBody getBody() {
        return this.body;
    }

}
