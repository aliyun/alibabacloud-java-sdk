// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowInputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaConnectFlowInputResponseBody body;

    public static GetMediaConnectFlowInputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowInputResponse self = new GetMediaConnectFlowInputResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowInputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaConnectFlowInputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaConnectFlowInputResponse setBody(GetMediaConnectFlowInputResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaConnectFlowInputResponseBody getBody() {
        return this.body;
    }

}
