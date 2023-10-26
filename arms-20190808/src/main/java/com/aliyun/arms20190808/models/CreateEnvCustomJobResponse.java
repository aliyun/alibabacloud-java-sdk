// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvCustomJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEnvCustomJobResponseBody body;

    public static CreateEnvCustomJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvCustomJobResponse self = new CreateEnvCustomJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvCustomJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvCustomJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnvCustomJobResponse setBody(CreateEnvCustomJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvCustomJobResponseBody getBody() {
        return this.body;
    }

}
