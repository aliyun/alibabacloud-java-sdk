// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class FixServiceDependencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FixServiceDependencyResponseBody body;

    public static FixServiceDependencyResponse build(java.util.Map<String, ?> map) throws Exception {
        FixServiceDependencyResponse self = new FixServiceDependencyResponse();
        return TeaModel.build(map, self);
    }

    public FixServiceDependencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FixServiceDependencyResponse setBody(FixServiceDependencyResponseBody body) {
        this.body = body;
        return this;
    }
    public FixServiceDependencyResponseBody getBody() {
        return this.body;
    }

}
