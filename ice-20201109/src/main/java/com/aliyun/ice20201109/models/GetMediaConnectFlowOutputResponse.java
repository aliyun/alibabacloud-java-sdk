// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaConnectFlowOutputResponseBody body;

    public static GetMediaConnectFlowOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowOutputResponse self = new GetMediaConnectFlowOutputResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaConnectFlowOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaConnectFlowOutputResponse setBody(GetMediaConnectFlowOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaConnectFlowOutputResponseBody getBody() {
        return this.body;
    }

}
