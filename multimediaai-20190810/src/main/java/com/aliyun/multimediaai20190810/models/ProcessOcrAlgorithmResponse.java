// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessOcrAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessOcrAlgorithmResponseBody body;

    public static ProcessOcrAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessOcrAlgorithmResponse self = new ProcessOcrAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ProcessOcrAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessOcrAlgorithmResponse setBody(ProcessOcrAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessOcrAlgorithmResponseBody getBody() {
        return this.body;
    }

}
