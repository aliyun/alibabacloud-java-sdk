// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceConfigurationTimelineResponseBody body;

    public static GetResourceConfigurationTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceConfigurationTimelineResponse self = new GetResourceConfigurationTimelineResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceConfigurationTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceConfigurationTimelineResponse setBody(GetResourceConfigurationTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceConfigurationTimelineResponseBody getBody() {
        return this.body;
    }

}
