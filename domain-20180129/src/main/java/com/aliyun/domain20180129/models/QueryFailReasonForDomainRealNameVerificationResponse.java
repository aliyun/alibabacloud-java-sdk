// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFailReasonForDomainRealNameVerificationResponseBody body;

    public static QueryFailReasonForDomainRealNameVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForDomainRealNameVerificationResponse self = new QueryFailReasonForDomainRealNameVerificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForDomainRealNameVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFailReasonForDomainRealNameVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFailReasonForDomainRealNameVerificationResponse setBody(QueryFailReasonForDomainRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailReasonForDomainRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
