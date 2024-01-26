// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyImageAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImageAttributeResponseBody body;

    public static ModifyImageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAttributeResponse self = new ModifyImageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageAttributeResponse setBody(ModifyImageAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageAttributeResponseBody getBody() {
        return this.body;
    }

}
