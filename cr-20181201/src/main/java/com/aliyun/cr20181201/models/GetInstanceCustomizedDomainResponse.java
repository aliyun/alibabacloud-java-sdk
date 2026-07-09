// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceCustomizedDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceCustomizedDomainResponseBody body;

    public static GetInstanceCustomizedDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCustomizedDomainResponse self = new GetInstanceCustomizedDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceCustomizedDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceCustomizedDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceCustomizedDomainResponse setBody(GetInstanceCustomizedDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceCustomizedDomainResponseBody getBody() {
        return this.body;
    }

}
