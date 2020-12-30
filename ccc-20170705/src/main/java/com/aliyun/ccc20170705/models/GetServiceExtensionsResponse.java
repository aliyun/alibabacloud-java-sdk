// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetServiceExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceExtensionsResponseBody body;

    public static GetServiceExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceExtensionsResponse self = new GetServiceExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceExtensionsResponse setBody(GetServiceExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceExtensionsResponseBody getBody() {
        return this.body;
    }

}
