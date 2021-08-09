// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDomainsResponseBody body;

    public static GetDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainsResponse self = new GetDomainsResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainsResponse setBody(GetDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainsResponseBody getBody() {
        return this.body;
    }

}
