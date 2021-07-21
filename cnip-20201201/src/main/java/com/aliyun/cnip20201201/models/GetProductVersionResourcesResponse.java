// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionResourcesResponseBody body;

    public static GetProductVersionResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResourcesResponse self = new GetProductVersionResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionResourcesResponse setBody(GetProductVersionResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionResourcesResponseBody getBody() {
        return this.body;
    }

}
