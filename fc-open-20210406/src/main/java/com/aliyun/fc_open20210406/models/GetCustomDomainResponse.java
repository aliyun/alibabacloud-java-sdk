// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomDomainResponseBody body;

    public static GetCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomDomainResponse self = new GetCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomDomainResponse setBody(GetCustomDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomDomainResponseBody getBody() {
        return this.body;
    }

}
