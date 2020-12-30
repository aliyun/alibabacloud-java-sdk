// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessNlpAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessNlpAlgorithmResponseBody body;

    public static ProcessNlpAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessNlpAlgorithmResponse self = new ProcessNlpAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ProcessNlpAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessNlpAlgorithmResponse setBody(ProcessNlpAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessNlpAlgorithmResponseBody getBody() {
        return this.body;
    }

}
