// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessFaceAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessFaceAlgorithmResponseBody body;

    public static ProcessFaceAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessFaceAlgorithmResponse self = new ProcessFaceAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ProcessFaceAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessFaceAlgorithmResponse setBody(ProcessFaceAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessFaceAlgorithmResponseBody getBody() {
        return this.body;
    }

}
