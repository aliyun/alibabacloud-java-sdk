// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaConnectFlowOutputResponseBody body;

    public static UpdateMediaConnectFlowOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowOutputResponse self = new UpdateMediaConnectFlowOutputResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaConnectFlowOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaConnectFlowOutputResponse setBody(UpdateMediaConnectFlowOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaConnectFlowOutputResponseBody getBody() {
        return this.body;
    }

}
