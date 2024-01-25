// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ConfirmAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmAuthorizationResponseBody body;

    public static ConfirmAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAuthorizationResponse self = new ConfirmAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmAuthorizationResponse setBody(ConfirmAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAuthorizationResponseBody getBody() {
        return this.body;
    }

}
