// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryCarbonTrackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCarbonTrackResponseBody body;

    public static QueryCarbonTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCarbonTrackResponse self = new QueryCarbonTrackResponse();
        return TeaModel.build(map, self);
    }

    public QueryCarbonTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCarbonTrackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCarbonTrackResponse setBody(QueryCarbonTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCarbonTrackResponseBody getBody() {
        return this.body;
    }

}
