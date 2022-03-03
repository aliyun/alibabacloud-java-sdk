// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardFlowInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCardFlowInfoResponseBody body;

    public static GetCardFlowInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardFlowInfoResponse self = new GetCardFlowInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCardFlowInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardFlowInfoResponse setBody(GetCardFlowInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardFlowInfoResponseBody getBody() {
        return this.body;
    }

}
