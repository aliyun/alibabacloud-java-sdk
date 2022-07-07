// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCertResponseBody body;

    public static UpdateCertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCertResponse self = new UpdateCertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCertResponse setBody(UpdateCertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCertResponseBody getBody() {
        return this.body;
    }

}
