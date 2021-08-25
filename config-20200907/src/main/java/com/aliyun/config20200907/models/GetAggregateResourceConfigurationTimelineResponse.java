// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceConfigurationTimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAggregateResourceConfigurationTimelineResponse setBody(GetAggregateResourceConfigurationTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceConfigurationTimelineResponseBody getBody() {
        return this.body;
    }

}
