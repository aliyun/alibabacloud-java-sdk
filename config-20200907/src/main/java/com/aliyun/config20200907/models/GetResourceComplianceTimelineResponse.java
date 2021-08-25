// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceTimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceComplianceTimelineResponseBody body;

    public static GetResourceComplianceTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceTimelineResponse self = new GetResourceComplianceTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceComplianceTimelineResponse setBody(GetResourceComplianceTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceComplianceTimelineResponseBody getBody() {
        return this.body;
    }

}
