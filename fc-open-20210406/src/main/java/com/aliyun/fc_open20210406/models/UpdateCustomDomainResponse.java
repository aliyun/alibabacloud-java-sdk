// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomDomainResponseBody body;

    public static UpdateCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainResponse self = new UpdateCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomDomainResponse setBody(UpdateCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomDomainResponseBody getBody() {
        return this.body;
    }

}
