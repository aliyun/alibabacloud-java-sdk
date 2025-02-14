// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaConnectFlowInputResponseBody body;

    public static UpdateMediaConnectFlowInputResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowInputResponse self = new UpdateMediaConnectFlowInputResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaConnectFlowInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaConnectFlowInputResponse setBody(UpdateMediaConnectFlowInputResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaConnectFlowInputResponseBody getBody() {
        return this.body;
    }

}
