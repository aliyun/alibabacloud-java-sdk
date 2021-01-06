// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunMedQAResponseBody body;

    public static RunMedQAResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMedQAResponse self = new RunMedQAResponse();
        return TeaModel.build(map, self);
    }

    public RunMedQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMedQAResponse setBody(RunMedQAResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMedQAResponseBody getBody() {
        return this.body;
    }

}
