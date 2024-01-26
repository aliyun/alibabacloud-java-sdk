// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateEnvCustomJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnvCustomJobResponseBody body;

    public static UpdateEnvCustomJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvCustomJobResponse self = new UpdateEnvCustomJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvCustomJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvCustomJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvCustomJobResponse setBody(UpdateEnvCustomJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvCustomJobResponseBody getBody() {
        return this.body;
    }

}
