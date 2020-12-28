// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class FinishExperimentTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishExperimentTaskResponseBody body;

    public static FinishExperimentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishExperimentTaskResponse self = new FinishExperimentTaskResponse();
        return TeaModel.build(map, self);
    }

    public FinishExperimentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishExperimentTaskResponse setBody(FinishExperimentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishExperimentTaskResponseBody getBody() {
        return this.body;
    }

}
