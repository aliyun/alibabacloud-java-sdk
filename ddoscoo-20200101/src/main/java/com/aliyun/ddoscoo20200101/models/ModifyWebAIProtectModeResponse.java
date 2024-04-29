// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebAIProtectModeResponseBody body;

    public static ModifyWebAIProtectModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectModeResponse self = new ModifyWebAIProtectModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebAIProtectModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebAIProtectModeResponse setBody(ModifyWebAIProtectModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebAIProtectModeResponseBody getBody() {
        return this.body;
    }

}
