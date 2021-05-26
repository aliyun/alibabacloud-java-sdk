// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateOuterAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOuterAgentResponseBody body;

    public static UpdateOuterAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOuterAgentResponse self = new UpdateOuterAgentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOuterAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOuterAgentResponse setBody(UpdateOuterAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOuterAgentResponseBody getBody() {
        return this.body;
    }

}
