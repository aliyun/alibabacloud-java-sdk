// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceSubscriptionEstimateCostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceInstanceSubscriptionEstimateCostResponseBody body;

    public static GetServiceInstanceSubscriptionEstimateCostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceSubscriptionEstimateCostResponse self = new GetServiceInstanceSubscriptionEstimateCostResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceSubscriptionEstimateCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceInstanceSubscriptionEstimateCostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceInstanceSubscriptionEstimateCostResponse setBody(GetServiceInstanceSubscriptionEstimateCostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceInstanceSubscriptionEstimateCostResponseBody getBody() {
        return this.body;
    }

}
