// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainResponseBody body;

    public static UpdateDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainResponse self = new UpdateDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainResponse setBody(UpdateDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainResponseBody getBody() {
        return this.body;
    }

}
