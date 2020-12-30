// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ProcessLogoAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ProcessLogoAlgorithmResponseBody body;

    public static ProcessLogoAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessLogoAlgorithmResponse self = new ProcessLogoAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ProcessLogoAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessLogoAlgorithmResponse setBody(ProcessLogoAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessLogoAlgorithmResponseBody getBody() {
        return this.body;
    }

}
