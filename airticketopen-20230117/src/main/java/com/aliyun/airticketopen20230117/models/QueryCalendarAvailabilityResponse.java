// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryCalendarAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCalendarAvailabilityResponseBody body;

    public static QueryCalendarAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCalendarAvailabilityResponse self = new QueryCalendarAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public QueryCalendarAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCalendarAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCalendarAvailabilityResponse setBody(QueryCalendarAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCalendarAvailabilityResponseBody getBody() {
        return this.body;
    }

}
