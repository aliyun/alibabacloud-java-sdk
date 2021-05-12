// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionResourceResponseBody body;

    public static GetProductVersionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResourceResponse self = new GetProductVersionResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionResourceResponse setBody(GetProductVersionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionResourceResponseBody getBody() {
        return this.body;
    }

}
