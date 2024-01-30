// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceVpcAuthModeResponseBody body;

    public static ModifyInstanceVpcAuthModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeResponse self = new ModifyInstanceVpcAuthModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVpcAuthModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceVpcAuthModeResponse setBody(ModifyInstanceVpcAuthModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVpcAuthModeResponseBody getBody() {
        return this.body;
    }

}
