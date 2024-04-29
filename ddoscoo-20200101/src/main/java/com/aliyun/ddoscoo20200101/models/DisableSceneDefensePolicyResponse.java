// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableSceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSceneDefensePolicyResponseBody body;

    public static DisableSceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneDefensePolicyResponse self = new DisableSceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableSceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSceneDefensePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSceneDefensePolicyResponse setBody(DisableSceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
