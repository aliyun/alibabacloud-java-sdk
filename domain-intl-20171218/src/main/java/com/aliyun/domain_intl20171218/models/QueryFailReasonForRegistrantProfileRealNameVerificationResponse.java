// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryFailReasonForRegistrantProfileRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody body;

    public static QueryFailReasonForRegistrantProfileRealNameVerificationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForRegistrantProfileRealNameVerificationResponse self = new QueryFailReasonForRegistrantProfileRealNameVerificationResponse();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse setBody(QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
