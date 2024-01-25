// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDomainConfigResponseBody body;

    public static GetDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainConfigResponse self = new GetDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainConfigResponse setBody(GetDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainConfigResponseBody getBody() {
        return this.body;
    }

}
