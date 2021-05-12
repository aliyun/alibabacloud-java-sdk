// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyComponentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyComponentsResponseBody body;

    public static ApplyComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyComponentsResponse self = new ApplyComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ApplyComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyComponentsResponse setBody(ApplyComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyComponentsResponseBody getBody() {
        return this.body;
    }

}
