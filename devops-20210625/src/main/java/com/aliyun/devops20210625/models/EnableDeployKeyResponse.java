// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class EnableDeployKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDeployKeyResponseBody body;

    public static EnableDeployKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDeployKeyResponse self = new EnableDeployKeyResponse();
        return TeaModel.build(map, self);
    }

    public EnableDeployKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDeployKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDeployKeyResponse setBody(EnableDeployKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDeployKeyResponseBody getBody() {
        return this.body;
    }

}
