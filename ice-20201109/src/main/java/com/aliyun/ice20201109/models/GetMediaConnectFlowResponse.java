// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaConnectFlowResponseBody body;

    public static GetMediaConnectFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowResponse self = new GetMediaConnectFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaConnectFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaConnectFlowResponse setBody(GetMediaConnectFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaConnectFlowResponseBody getBody() {
        return this.body;
    }

}
