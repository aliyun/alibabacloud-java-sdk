// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class PassReleaseStagePipelineValidateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PassReleaseStagePipelineValidateResponseBody body;

    public static PassReleaseStagePipelineValidateResponse build(java.util.Map<String, ?> map) throws Exception {
        PassReleaseStagePipelineValidateResponse self = new PassReleaseStagePipelineValidateResponse();
        return TeaModel.build(map, self);
    }

    public PassReleaseStagePipelineValidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PassReleaseStagePipelineValidateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PassReleaseStagePipelineValidateResponse setBody(PassReleaseStagePipelineValidateResponseBody body) {
        this.body = body;
        return this;
    }
    public PassReleaseStagePipelineValidateResponseBody getBody() {
        return this.body;
    }

}
