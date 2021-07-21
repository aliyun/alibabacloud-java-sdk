// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProductVersionResourcesResponseBody body;

    public static UpdateProductVersionResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionResourcesResponse self = new UpdateProductVersionResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductVersionResourcesResponse setBody(UpdateProductVersionResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductVersionResourcesResponseBody getBody() {
        return this.body;
    }

}
