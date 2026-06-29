// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetSubscriptionStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubscriptionStatsResponseBody body;

    public static GetSubscriptionStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionStatsResponse self = new GetSubscriptionStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionStatsResponse setBody(GetSubscriptionStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionStatsResponseBody getBody() {
        return this.body;
    }

}
