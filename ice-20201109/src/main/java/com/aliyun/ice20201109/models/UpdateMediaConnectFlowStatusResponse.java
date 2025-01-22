// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaConnectFlowStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaConnectFlowStatusResponseBody body;

    public static UpdateMediaConnectFlowStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaConnectFlowStatusResponse self = new UpdateMediaConnectFlowStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaConnectFlowStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaConnectFlowStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaConnectFlowStatusResponse setBody(UpdateMediaConnectFlowStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaConnectFlowStatusResponseBody getBody() {
        return this.body;
    }

}
