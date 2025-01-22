// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaConnectFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaConnectFlowResponseBody body;

    public static CreateMediaConnectFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConnectFlowResponse self = new CreateMediaConnectFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaConnectFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaConnectFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaConnectFlowResponse setBody(CreateMediaConnectFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaConnectFlowResponseBody getBody() {
        return this.body;
    }

}
