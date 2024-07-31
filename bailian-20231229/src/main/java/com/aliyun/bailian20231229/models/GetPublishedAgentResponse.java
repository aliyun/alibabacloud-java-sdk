// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetPublishedAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublishedAgentResponseBody body;

    public static GetPublishedAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishedAgentResponse self = new GetPublishedAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishedAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishedAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublishedAgentResponse setBody(GetPublishedAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishedAgentResponseBody getBody() {
        return this.body;
    }

}
