// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableSceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSceneDefensePolicyResponseBody body;

    public static EnableSceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneDefensePolicyResponse self = new EnableSceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableSceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSceneDefensePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSceneDefensePolicyResponse setBody(EnableSceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
