// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaConnectFlowResponseBody body;

    public static DeleteMediaConnectFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowResponse self = new DeleteMediaConnectFlowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaConnectFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaConnectFlowResponse setBody(DeleteMediaConnectFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaConnectFlowResponseBody getBody() {
        return this.body;
    }

}
