// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyImageAdvancedAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyImageAdvancedAttributeResponseBody body;

    public static ModifyImageAdvancedAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageAdvancedAttributeResponse self = new ModifyImageAdvancedAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageAdvancedAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageAdvancedAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageAdvancedAttributeResponse setBody(ModifyImageAdvancedAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageAdvancedAttributeResponseBody getBody() {
        return this.body;
    }

}
