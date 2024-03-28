// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeployFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeployFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployFunctionResponse setBody(DeployFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployFunctionResponseBody getBody() {
        return this.body;
    }

}
