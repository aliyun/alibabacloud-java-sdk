// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class GetBackFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBackFlowResponseBody body;

    public static GetBackFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackFlowResponse self = new GetBackFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetBackFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackFlowResponse setBody(GetBackFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackFlowResponseBody getBody() {
        return this.body;
    }

}
