// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSuffixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainSuffixResponseBody body;

    public static QueryDomainSuffixResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSuffixResponse self = new QueryDomainSuffixResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainSuffixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainSuffixResponse setBody(QueryDomainSuffixResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainSuffixResponseBody getBody() {
        return this.body;
    }

}
