// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaConnectFlowInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaConnectFlowInputResponseBody body;

    public static DeleteMediaConnectFlowInputResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaConnectFlowInputResponse self = new DeleteMediaConnectFlowInputResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaConnectFlowInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaConnectFlowInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaConnectFlowInputResponse setBody(DeleteMediaConnectFlowInputResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaConnectFlowInputResponseBody getBody() {
        return this.body;
    }

}
