// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForbidMediaConnectFlowOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForbidMediaConnectFlowOutputResponseBody body;

    public static ForbidMediaConnectFlowOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ForbidMediaConnectFlowOutputResponse self = new ForbidMediaConnectFlowOutputResponse();
        return TeaModel.build(map, self);
    }

    public ForbidMediaConnectFlowOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForbidMediaConnectFlowOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForbidMediaConnectFlowOutputResponse setBody(ForbidMediaConnectFlowOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public ForbidMediaConnectFlowOutputResponseBody getBody() {
        return this.body;
    }

}
