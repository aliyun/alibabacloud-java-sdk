// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductVersionEnvironmentResponseBody body;

    public static ListProductVersionEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionEnvironmentResponse self = new ListProductVersionEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public ListProductVersionEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductVersionEnvironmentResponse setBody(ListProductVersionEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductVersionEnvironmentResponseBody getBody() {
        return this.body;
    }

}
