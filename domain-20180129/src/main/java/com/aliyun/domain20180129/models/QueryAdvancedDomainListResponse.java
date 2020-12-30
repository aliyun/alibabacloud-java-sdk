// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryAdvancedDomainListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAdvancedDomainListResponseBody body;

    public static QueryAdvancedDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdvancedDomainListResponse self = new QueryAdvancedDomainListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdvancedDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAdvancedDomainListResponse setBody(QueryAdvancedDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAdvancedDomainListResponseBody getBody() {
        return this.body;
    }

}
