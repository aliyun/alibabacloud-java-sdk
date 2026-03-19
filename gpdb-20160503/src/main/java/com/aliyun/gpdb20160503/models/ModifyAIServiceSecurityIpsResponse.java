// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyAIServiceSecurityIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAIServiceSecurityIpsResponseBody body;

    public static ModifyAIServiceSecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAIServiceSecurityIpsResponse self = new ModifyAIServiceSecurityIpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAIServiceSecurityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAIServiceSecurityIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAIServiceSecurityIpsResponse setBody(ModifyAIServiceSecurityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAIServiceSecurityIpsResponseBody getBody() {
        return this.body;
    }

}
