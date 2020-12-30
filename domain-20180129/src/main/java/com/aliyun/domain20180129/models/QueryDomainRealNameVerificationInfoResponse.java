// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealNameVerificationInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDomainRealNameVerificationInfoResponseBody body;

    public static QueryDomainRealNameVerificationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealNameVerificationInfoResponse self = new QueryDomainRealNameVerificationInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealNameVerificationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDomainRealNameVerificationInfoResponse setBody(QueryDomainRealNameVerificationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDomainRealNameVerificationInfoResponseBody getBody() {
        return this.body;
    }

}
