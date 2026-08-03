// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAvailabilityResponseBody body;

    public static QueryAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailabilityResponse self = new QueryAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public QueryAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAvailabilityResponse setBody(QueryAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAvailabilityResponseBody getBody() {
        return this.body;
    }

}
