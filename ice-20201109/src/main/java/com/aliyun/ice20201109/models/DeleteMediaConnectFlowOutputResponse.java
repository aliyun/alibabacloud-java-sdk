// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaConnectFlowOutputResponseBody body;

    public static DeleteMediaConnectFlowOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowOutputResponse self = new DeleteMediaConnectFlowOutputResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaConnectFlowOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaConnectFlowOutputResponse setBody(DeleteMediaConnectFlowOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaConnectFlowOutputResponseBody getBody() {
        return this.body;
    }

}
