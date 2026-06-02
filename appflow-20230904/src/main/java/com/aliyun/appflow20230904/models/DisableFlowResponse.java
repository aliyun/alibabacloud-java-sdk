// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DisableFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableFlowResponseBody body;

    public static DisableFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowResponse self = new DisableFlowResponse();
        return TeaModel.build(map, self);
    }

    public DisableFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableFlowResponse setBody(DisableFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFlowResponseBody getBody() {
        return this.body;
    }

}
