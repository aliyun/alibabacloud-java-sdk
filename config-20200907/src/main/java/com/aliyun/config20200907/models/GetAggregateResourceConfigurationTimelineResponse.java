// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceConfigurationTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAggregateResourceConfigurationTimelineResponseBody body;

    public static GetAggregateResourceConfigurationTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceConfigurationTimelineResponse self = new GetAggregateResourceConfigurationTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceConfigurationTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceConfigurationTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceConfigurationTimelineResponse setBody(GetAggregateResourceConfigurationTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceConfigurationTimelineResponseBody getBody() {
        return this.body;
    }

}
