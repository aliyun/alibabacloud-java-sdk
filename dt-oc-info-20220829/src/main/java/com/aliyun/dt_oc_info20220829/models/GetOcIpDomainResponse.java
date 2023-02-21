// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIpDomainResponseBody body;

    public static GetOcIpDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpDomainResponse self = new GetOcIpDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIpDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIpDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIpDomainResponse setBody(GetOcIpDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIpDomainResponseBody getBody() {
        return this.body;
    }

}
