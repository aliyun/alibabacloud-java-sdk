// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ModifyBindAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBindAccountResponseBody body;

    public static ModifyBindAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBindAccountResponse self = new ModifyBindAccountResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBindAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBindAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBindAccountResponse setBody(ModifyBindAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBindAccountResponseBody getBody() {
        return this.body;
    }

}
