// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOuterAdminAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOuterAdminAgentResponseBody body;

    public static CreateOuterAdminAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOuterAdminAgentResponse self = new CreateOuterAdminAgentResponse();
        return TeaModel.build(map, self);
    }

    public CreateOuterAdminAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOuterAdminAgentResponse setBody(CreateOuterAdminAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOuterAdminAgentResponseBody getBody() {
        return this.body;
    }

}
