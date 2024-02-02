// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcAttributeResponseBody body;

    public static ModifyVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAttributeResponse self = new ModifyVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcAttributeResponse setBody(ModifyVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
