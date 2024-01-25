// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryRegistrantProfileRealNameVerificationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponse setBody(QueryRegistrantProfileRealNameVerificationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRegistrantProfileRealNameVerificationInfoResponseBody getBody() {
        return this.body;
    }

}
