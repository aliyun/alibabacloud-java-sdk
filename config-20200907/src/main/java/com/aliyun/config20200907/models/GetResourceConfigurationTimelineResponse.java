// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceConfigurationTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetResourceConfigurationTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceConfigurationTimelineResponse setBody(GetResourceConfigurationTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceConfigurationTimelineResponseBody getBody() {
        return this.body;
    }

}
