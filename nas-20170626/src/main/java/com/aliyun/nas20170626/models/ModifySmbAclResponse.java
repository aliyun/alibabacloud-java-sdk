// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifySmbAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySmbAclResponseBody body;

    public static ModifySmbAclResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySmbAclResponse self = new ModifySmbAclResponse();
        return TeaModel.build(map, self);
    }

    public ModifySmbAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySmbAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySmbAclResponse setBody(ModifySmbAclResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySmbAclResponseBody getBody() {
        return this.body;
    }

}
