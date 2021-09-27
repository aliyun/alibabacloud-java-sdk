// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class InitEnvironmentResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitEnvironmentResourceResponseBody body;

    public static InitEnvironmentResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentResourceResponse self = new InitEnvironmentResourceResponse();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitEnvironmentResourceResponse setBody(InitEnvironmentResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitEnvironmentResourceResponseBody getBody() {
        return this.body;
    }

}
