// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableSmbAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSmbAclResponseBody body;

    public static EnableSmbAclResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSmbAclResponse self = new EnableSmbAclResponse();
        return TeaModel.build(map, self);
    }

    public EnableSmbAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSmbAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSmbAclResponse setBody(EnableSmbAclResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSmbAclResponseBody getBody() {
        return this.body;
    }

}
