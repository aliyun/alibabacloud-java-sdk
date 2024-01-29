// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetAggregateResourceComplianceTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAggregateResourceComplianceTimelineResponse setBody(GetAggregateResourceComplianceTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAggregateResourceComplianceTimelineResponseBody getBody() {
        return this.body;
    }

}
