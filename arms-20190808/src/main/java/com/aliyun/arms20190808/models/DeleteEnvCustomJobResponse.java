// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvCustomJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnvCustomJobResponseBody body;

    public static DeleteEnvCustomJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvCustomJobResponse self = new DeleteEnvCustomJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvCustomJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvCustomJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvCustomJobResponse setBody(DeleteEnvCustomJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvCustomJobResponseBody getBody() {
        return this.body;
    }

}
