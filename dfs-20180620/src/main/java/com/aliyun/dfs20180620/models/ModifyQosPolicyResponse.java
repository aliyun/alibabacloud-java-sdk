// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ModifyQosPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyQosPolicyResponseBody body;

    public static ModifyQosPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosPolicyResponse self = new ModifyQosPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyQosPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyQosPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyQosPolicyResponse setBody(ModifyQosPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyQosPolicyResponseBody getBody() {
        return this.body;
    }

}
