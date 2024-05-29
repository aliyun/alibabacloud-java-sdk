// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCGlobalSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebCCGlobalSwitchResponseBody body;

    public static ModifyWebCCGlobalSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCGlobalSwitchResponse self = new ModifyWebCCGlobalSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCGlobalSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebCCGlobalSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebCCGlobalSwitchResponse setBody(ModifyWebCCGlobalSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebCCGlobalSwitchResponseBody getBody() {
        return this.body;
    }

}
