// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableSmbAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSmbAclResponseBody body;

    public static DisableSmbAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSmbAclResponse self = new DisableSmbAclResponse();
        return TeaModel.build(map, self);
    }

    public DisableSmbAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSmbAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSmbAclResponse setBody(DisableSmbAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSmbAclResponseBody getBody() {
        return this.body;
    }

}
