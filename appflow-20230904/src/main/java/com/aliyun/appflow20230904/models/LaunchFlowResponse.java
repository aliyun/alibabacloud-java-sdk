// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class LaunchFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LaunchFlowResponseBody body;

    public static LaunchFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchFlowResponse self = new LaunchFlowResponse();
        return TeaModel.build(map, self);
    }

    public LaunchFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LaunchFlowResponse setBody(LaunchFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchFlowResponseBody getBody() {
        return this.body;
    }

}
