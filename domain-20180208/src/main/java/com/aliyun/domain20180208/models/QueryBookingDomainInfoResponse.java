// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBookingDomainInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBookingDomainInfoResponseBody body;

    public static QueryBookingDomainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBookingDomainInfoResponse self = new QueryBookingDomainInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryBookingDomainInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBookingDomainInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBookingDomainInfoResponse setBody(QueryBookingDomainInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBookingDomainInfoResponseBody getBody() {
        return this.body;
    }

}
