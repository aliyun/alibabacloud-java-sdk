// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMainDomainNameResponseBody body;

    public static GetMainDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameResponse self = new GetMainDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public GetMainDomainNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMainDomainNameResponse setBody(GetMainDomainNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMainDomainNameResponseBody getBody() {
        return this.body;
    }

}
