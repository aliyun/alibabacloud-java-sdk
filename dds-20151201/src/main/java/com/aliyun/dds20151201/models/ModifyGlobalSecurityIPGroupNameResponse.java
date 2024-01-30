// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGlobalSecurityIPGroupNameResponseBody body;

    public static ModifyGlobalSecurityIPGroupNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupNameResponse self = new ModifyGlobalSecurityIPGroupNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalSecurityIPGroupNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalSecurityIPGroupNameResponse setBody(ModifyGlobalSecurityIPGroupNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalSecurityIPGroupNameResponseBody getBody() {
        return this.body;
    }

}
