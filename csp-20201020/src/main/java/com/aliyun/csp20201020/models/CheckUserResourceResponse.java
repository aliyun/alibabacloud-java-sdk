// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckUserResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUserResourceResponseBody body;

    public static CheckUserResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserResourceResponse self = new CheckUserResourceResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserResourceResponse setBody(CheckUserResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserResourceResponseBody getBody() {
        return this.body;
    }

}
