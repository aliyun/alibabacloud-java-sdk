// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConnectFlowAllOutputNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaConnectFlowAllOutputNameResponseBody body;

    public static GetMediaConnectFlowAllOutputNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConnectFlowAllOutputNameResponse self = new GetMediaConnectFlowAllOutputNameResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaConnectFlowAllOutputNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaConnectFlowAllOutputNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaConnectFlowAllOutputNameResponse setBody(GetMediaConnectFlowAllOutputNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaConnectFlowAllOutputNameResponseBody getBody() {
        return this.body;
    }

}
