// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySceneDefensePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySceneDefensePolicyResponseBody body;

    public static ModifySceneDefensePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySceneDefensePolicyResponse self = new ModifySceneDefensePolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySceneDefensePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySceneDefensePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySceneDefensePolicyResponse setBody(ModifySceneDefensePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

}
