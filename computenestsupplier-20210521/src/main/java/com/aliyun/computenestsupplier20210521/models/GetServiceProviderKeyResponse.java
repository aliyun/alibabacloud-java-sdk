// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceProviderKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceProviderKeyResponseBody body;

    public static GetServiceProviderKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProviderKeyResponse self = new GetServiceProviderKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceProviderKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceProviderKeyResponse setBody(GetServiceProviderKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceProviderKeyResponseBody getBody() {
        return this.body;
    }

}
