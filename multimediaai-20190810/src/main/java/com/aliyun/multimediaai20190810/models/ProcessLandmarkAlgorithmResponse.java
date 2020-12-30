// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessLandmarkAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessLandmarkAlgorithmResponseBody body;

    public static ProcessLandmarkAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessLandmarkAlgorithmResponse self = new ProcessLandmarkAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ProcessLandmarkAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessLandmarkAlgorithmResponse setBody(ProcessLandmarkAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessLandmarkAlgorithmResponseBody getBody() {
        return this.body;
    }

}
