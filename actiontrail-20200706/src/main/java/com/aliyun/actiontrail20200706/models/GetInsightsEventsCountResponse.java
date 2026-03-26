// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightsEventsCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInsightsEventsCountResponseBody body;

    public static GetInsightsEventsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInsightsEventsCountResponse self = new GetInsightsEventsCountResponse();
        return TeaModel.build(map, self);
    }

    public GetInsightsEventsCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInsightsEventsCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInsightsEventsCountResponse setBody(GetInsightsEventsCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInsightsEventsCountResponseBody getBody() {
        return this.body;
    }

}
