// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAIProtectSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebAIProtectSwitchResponseBody body;

    public static ModifyWebAIProtectSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAIProtectSwitchResponse self = new ModifyWebAIProtectSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebAIProtectSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebAIProtectSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebAIProtectSwitchResponse setBody(ModifyWebAIProtectSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebAIProtectSwitchResponseBody getBody() {
        return this.body;
    }

}
