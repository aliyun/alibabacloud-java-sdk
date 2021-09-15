// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainCnameResponseBody body;

    public static GetDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainCnameResponse self = new GetDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainCnameResponse setBody(GetDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainCnameResponseBody getBody() {
        return this.body;
    }

}
