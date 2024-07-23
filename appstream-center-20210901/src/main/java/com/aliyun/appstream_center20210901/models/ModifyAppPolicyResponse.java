// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppPolicyResponseBody body;

    public static ModifyAppPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppPolicyResponse self = new ModifyAppPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppPolicyResponse setBody(ModifyAppPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppPolicyResponseBody getBody() {
        return this.body;
    }

}
