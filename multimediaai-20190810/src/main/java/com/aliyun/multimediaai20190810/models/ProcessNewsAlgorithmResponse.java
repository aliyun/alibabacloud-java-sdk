// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessNewsAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessNewsAlgorithmResponseBody body;

    public static ProcessNewsAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessNewsAlgorithmResponse self = new ProcessNewsAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ProcessNewsAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessNewsAlgorithmResponse setBody(ProcessNewsAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessNewsAlgorithmResponseBody getBody() {
        return this.body;
    }

}
