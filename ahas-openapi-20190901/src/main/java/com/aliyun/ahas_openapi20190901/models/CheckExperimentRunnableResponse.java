// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CheckExperimentRunnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckExperimentRunnableResponseBody body;

    public static CheckExperimentRunnableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckExperimentRunnableResponse self = new CheckExperimentRunnableResponse();
        return TeaModel.build(map, self);
    }

    public CheckExperimentRunnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckExperimentRunnableResponse setBody(CheckExperimentRunnableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckExperimentRunnableResponseBody getBody() {
        return this.body;
    }

}
