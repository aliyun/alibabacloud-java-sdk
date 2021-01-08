// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class PushInterventionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushInterventionResponseBody body;

    public static PushInterventionResponse build(java.util.Map<String, ?> map) throws Exception {
        PushInterventionResponse self = new PushInterventionResponse();
        return TeaModel.build(map, self);
    }

    public PushInterventionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushInterventionResponse setBody(PushInterventionResponseBody body) {
        this.body = body;
        return this;
    }
    public PushInterventionResponseBody getBody() {
        return this.body;
    }

}
