// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PushExperimentTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushExperimentTaskResponseBody body;

    public static PushExperimentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PushExperimentTaskResponse self = new PushExperimentTaskResponse();
        return TeaModel.build(map, self);
    }

    public PushExperimentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushExperimentTaskResponse setBody(PushExperimentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PushExperimentTaskResponseBody getBody() {
        return this.body;
    }

}
