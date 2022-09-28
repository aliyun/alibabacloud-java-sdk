// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class ResendEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResendEmailResponseBody body;

    public static ResendEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendEmailResponse self = new ResendEmailResponse();
        return TeaModel.build(map, self);
    }

    public ResendEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResendEmailResponse setBody(ResendEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendEmailResponseBody getBody() {
        return this.body;
    }

}
