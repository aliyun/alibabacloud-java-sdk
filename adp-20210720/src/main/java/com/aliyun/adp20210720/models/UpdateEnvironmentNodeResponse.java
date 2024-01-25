// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnvironmentNodeResponseBody body;

    public static UpdateEnvironmentNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentNodeResponse self = new UpdateEnvironmentNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvironmentNodeResponse setBody(UpdateEnvironmentNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvironmentNodeResponseBody getBody() {
        return this.body;
    }

}
