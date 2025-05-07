// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class UpdateSecurityEventStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSecurityEventStatusResponseBody body;

    public static UpdateSecurityEventStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityEventStatusResponse self = new UpdateSecurityEventStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityEventStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSecurityEventStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSecurityEventStatusResponse setBody(UpdateSecurityEventStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSecurityEventStatusResponseBody getBody() {
        return this.body;
    }

}
