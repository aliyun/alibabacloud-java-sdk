// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeployFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeployFunctionResponseBody body;

    public static DeployFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployFunctionResponse self = new DeployFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeployFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployFunctionResponse setBody(DeployFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployFunctionResponseBody getBody() {
        return this.body;
    }

}
