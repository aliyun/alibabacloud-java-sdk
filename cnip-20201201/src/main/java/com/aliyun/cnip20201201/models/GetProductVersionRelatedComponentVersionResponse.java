// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionRelatedComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionRelatedComponentVersionResponseBody body;

    public static GetProductVersionRelatedComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionRelatedComponentVersionResponse self = new GetProductVersionRelatedComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionRelatedComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionRelatedComponentVersionResponse setBody(GetProductVersionRelatedComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionRelatedComponentVersionResponseBody getBody() {
        return this.body;
    }

}
