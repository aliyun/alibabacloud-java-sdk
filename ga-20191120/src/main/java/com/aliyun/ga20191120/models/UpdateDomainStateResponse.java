// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDomainStateResponseBody body;

    public static UpdateDomainStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainStateResponse self = new UpdateDomainStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDomainStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDomainStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDomainStateResponse setBody(UpdateDomainStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDomainStateResponseBody getBody() {
        return this.body;
    }

}
