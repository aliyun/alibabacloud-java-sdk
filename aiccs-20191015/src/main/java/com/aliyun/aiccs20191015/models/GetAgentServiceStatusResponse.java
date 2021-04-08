// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentServiceStatusResponseBody body;

    public static GetAgentServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentServiceStatusResponse self = new GetAgentServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentServiceStatusResponse setBody(GetAgentServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentServiceStatusResponseBody getBody() {
        return this.body;
    }

}
