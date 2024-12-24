// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class ApplyCoordinationWithCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyCoordinationWithCodeResponseBody body;

    public static ApplyCoordinationWithCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationWithCodeResponse self = new ApplyCoordinationWithCodeResponse();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationWithCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyCoordinationWithCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyCoordinationWithCodeResponse setBody(ApplyCoordinationWithCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyCoordinationWithCodeResponseBody getBody() {
        return this.body;
    }

}
