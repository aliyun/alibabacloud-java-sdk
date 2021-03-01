// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceProvidersPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceProvidersPageResponseBody body;

    public static GetServiceProvidersPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvidersPageResponse self = new GetServiceProvidersPageResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceProvidersPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceProvidersPageResponse setBody(GetServiceProvidersPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceProvidersPageResponseBody getBody() {
        return this.body;
    }

}
