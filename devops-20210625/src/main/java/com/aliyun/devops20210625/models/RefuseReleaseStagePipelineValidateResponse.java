// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RefuseReleaseStagePipelineValidateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefuseReleaseStagePipelineValidateResponseBody body;

    public static RefuseReleaseStagePipelineValidateResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseReleaseStagePipelineValidateResponse self = new RefuseReleaseStagePipelineValidateResponse();
        return TeaModel.build(map, self);
    }

    public RefuseReleaseStagePipelineValidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseReleaseStagePipelineValidateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefuseReleaseStagePipelineValidateResponse setBody(RefuseReleaseStagePipelineValidateResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseReleaseStagePipelineValidateResponseBody getBody() {
        return this.body;
    }

}
