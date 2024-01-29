// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class PassPipelineValidateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PassPipelineValidateResponseBody body;

    public static PassPipelineValidateResponse build(java.util.Map<String, ?> map) throws Exception {
        PassPipelineValidateResponse self = new PassPipelineValidateResponse();
        return TeaModel.build(map, self);
    }

    public PassPipelineValidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PassPipelineValidateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PassPipelineValidateResponse setBody(PassPipelineValidateResponseBody body) {
        this.body = body;
        return this;
    }
    public PassPipelineValidateResponseBody getBody() {
        return this.body;
    }

}
