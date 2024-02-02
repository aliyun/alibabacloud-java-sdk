// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityGroupAttributeResponseBody body;

    public static ModifySecurityGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupAttributeResponse self = new ModifySecurityGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityGroupAttributeResponse setBody(ModifySecurityGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
