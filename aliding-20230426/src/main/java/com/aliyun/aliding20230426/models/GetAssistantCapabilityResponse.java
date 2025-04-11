// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAssistantCapabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssistantCapabilityResponseBody body;

    public static GetAssistantCapabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssistantCapabilityResponse self = new GetAssistantCapabilityResponse();
        return TeaModel.build(map, self);
    }

    public GetAssistantCapabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssistantCapabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssistantCapabilityResponse setBody(GetAssistantCapabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssistantCapabilityResponseBody getBody() {
        return this.body;
    }

}
