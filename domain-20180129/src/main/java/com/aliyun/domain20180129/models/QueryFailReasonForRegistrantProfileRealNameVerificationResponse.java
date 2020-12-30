// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForRegistrantProfileRealNameVerificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFailReasonForRegistrantProfileRealNameVerificationResponse setBody(QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

}
