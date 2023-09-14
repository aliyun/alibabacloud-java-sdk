// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateAScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAScriptsResponseBody body;

    public static UpdateAScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAScriptsResponse self = new UpdateAScriptsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAScriptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAScriptsResponse setBody(UpdateAScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAScriptsResponseBody getBody() {
        return this.body;
    }

}
