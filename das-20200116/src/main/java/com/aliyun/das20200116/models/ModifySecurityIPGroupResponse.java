// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityIPGroupResponseBody body;

    public static ModifySecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPGroupResponse self = new ModifySecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityIPGroupResponse setBody(ModifySecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
