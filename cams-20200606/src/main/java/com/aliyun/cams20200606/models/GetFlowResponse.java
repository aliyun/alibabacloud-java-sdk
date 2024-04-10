// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFlowResponseBody body;

    public static GetFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowResponse self = new GetFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFlowResponse setBody(GetFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowResponseBody getBody() {
        return this.body;
    }

}
