// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetRpcAppFlowRuleSummarysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRpcAppFlowRuleSummarysResponseBody body;

    public static GetRpcAppFlowRuleSummarysResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRpcAppFlowRuleSummarysResponse self = new GetRpcAppFlowRuleSummarysResponse();
        return TeaModel.build(map, self);
    }

    public GetRpcAppFlowRuleSummarysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRpcAppFlowRuleSummarysResponse setBody(GetRpcAppFlowRuleSummarysResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRpcAppFlowRuleSummarysResponseBody getBody() {
        return this.body;
    }

}
