// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class KickOutAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KickOutAgentResponseBody body;

    public static KickOutAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        KickOutAgentResponse self = new KickOutAgentResponse();
        return TeaModel.build(map, self);
    }

    public KickOutAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KickOutAgentResponse setBody(KickOutAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public KickOutAgentResponseBody getBody() {
        return this.body;
    }

}
