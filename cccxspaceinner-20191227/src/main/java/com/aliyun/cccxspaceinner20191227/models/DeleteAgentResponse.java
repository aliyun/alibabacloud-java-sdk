// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class DeleteAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAgentResponseBody body;

    public static DeleteAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentResponse self = new DeleteAgentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentResponse setBody(DeleteAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentResponseBody getBody() {
        return this.body;
    }

}
