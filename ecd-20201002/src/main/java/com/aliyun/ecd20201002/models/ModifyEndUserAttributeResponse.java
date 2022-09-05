// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ModifyEndUserAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEndUserAttributeResponseBody body;

    public static ModifyEndUserAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEndUserAttributeResponse self = new ModifyEndUserAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEndUserAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEndUserAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEndUserAttributeResponse setBody(ModifyEndUserAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEndUserAttributeResponseBody getBody() {
        return this.body;
    }

}
