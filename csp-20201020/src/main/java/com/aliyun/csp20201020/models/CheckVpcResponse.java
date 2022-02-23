// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckVpcResponseBody body;

    public static CheckVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVpcResponse self = new CheckVpcResponse();
        return TeaModel.build(map, self);
    }

    public CheckVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVpcResponse setBody(CheckVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVpcResponseBody getBody() {
        return this.body;
    }

}
