// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceTimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAggregateResourceComplianceTimelineResponseBody body;

    public static GetAggregateResourceComplianceTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceTimelineResponse self = new GetAggregateResourceComplianceTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAggregateResourceComplianceTimelineResponse setBody(GetAggregateResourceComplianceTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceTimelineResponseBody getBody() {
        return this.body;
    }

}
