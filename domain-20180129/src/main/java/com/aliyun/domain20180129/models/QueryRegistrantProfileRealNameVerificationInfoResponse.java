// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRegistrantProfileRealNameVerificationInfoResponseBody body;

    public static QueryRegistrantProfileRealNameVerificationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfileRealNameVerificationInfoResponse self = new QueryRegistrantProfileRealNameVerificationInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponse setBody(QueryRegistrantProfileRealNameVerificationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRegistrantProfileRealNameVerificationInfoResponseBody getBody() {
        return this.body;
    }

}
