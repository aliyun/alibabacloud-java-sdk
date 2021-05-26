// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOuterAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOuterAgentResponseBody body;

    public static CreateOuterAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOuterAgentResponse self = new CreateOuterAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateOuterAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOuterAgentResponse setBody(CreateOuterAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOuterAgentResponseBody getBody() {
        return this.body;
    }

}
