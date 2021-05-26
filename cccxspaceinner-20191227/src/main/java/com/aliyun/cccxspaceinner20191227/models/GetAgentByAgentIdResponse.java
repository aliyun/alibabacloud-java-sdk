// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentByAgentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentByAgentIdResponseBody body;

    public static GetAgentByAgentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByAgentIdResponse self = new GetAgentByAgentIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentByAgentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentByAgentIdResponse setBody(GetAgentByAgentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentByAgentIdResponseBody getBody() {
        return this.body;
    }

}
