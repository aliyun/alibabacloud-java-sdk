// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetFlowResponse setBody(GetFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowResponseBody getBody() {
        return this.body;
    }

}
