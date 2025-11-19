// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySecurityIPGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityIPGroupRelationResponseBody body;

    public static ModifySecurityIPGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPGroupRelationResponse self = new ModifySecurityIPGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityIPGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityIPGroupRelationResponse setBody(ModifySecurityIPGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityIPGroupRelationResponseBody getBody() {
        return this.body;
    }

}
