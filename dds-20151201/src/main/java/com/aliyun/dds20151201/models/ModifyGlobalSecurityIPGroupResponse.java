// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGlobalSecurityIPGroupResponseBody body;

    public static ModifyGlobalSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupResponse self = new ModifyGlobalSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalSecurityIPGroupResponse setBody(ModifyGlobalSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
