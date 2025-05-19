// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryStaticsAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryStaticsAvailabilityResponseBody body;

    public static QueryStaticsAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStaticsAvailabilityResponse self = new QueryStaticsAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public QueryStaticsAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStaticsAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStaticsAvailabilityResponse setBody(QueryStaticsAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStaticsAvailabilityResponseBody getBody() {
        return this.body;
    }

}
