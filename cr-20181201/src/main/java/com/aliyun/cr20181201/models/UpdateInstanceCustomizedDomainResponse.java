// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceCustomizedDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceCustomizedDomainResponseBody body;

    public static UpdateInstanceCustomizedDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceCustomizedDomainResponse self = new UpdateInstanceCustomizedDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceCustomizedDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceCustomizedDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceCustomizedDomainResponse setBody(UpdateInstanceCustomizedDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceCustomizedDomainResponseBody getBody() {
        return this.body;
    }

}
