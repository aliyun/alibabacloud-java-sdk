// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class SetupAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetupAgentResponseBody body;

    public static SetupAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupAgentResponse self = new SetupAgentResponse();
        return TeaModel.build(map, self);
    }

    public SetupAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupAgentResponse setBody(SetupAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupAgentResponseBody getBody() {
        return this.body;
    }

}
