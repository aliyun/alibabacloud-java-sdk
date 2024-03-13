// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ModifyAccountRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountRelationResponseBody body;

    public static ModifyAccountRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountRelationResponse self = new ModifyAccountRelationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountRelationResponse setBody(ModifyAccountRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountRelationResponseBody getBody() {
        return this.body;
    }

}
