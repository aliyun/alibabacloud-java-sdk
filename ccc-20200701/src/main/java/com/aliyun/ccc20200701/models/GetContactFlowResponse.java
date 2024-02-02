// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContactFlowResponseBody body;

    public static GetContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContactFlowResponse self = new GetContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContactFlowResponse setBody(GetContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContactFlowResponseBody getBody() {
        return this.body;
    }

}
