// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEnvironmentVersionResponseBody body;

    public static UpdateEnvironmentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentVersionResponse self = new UpdateEnvironmentVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvironmentVersionResponse setBody(UpdateEnvironmentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvironmentVersionResponseBody getBody() {
        return this.body;
    }

}
