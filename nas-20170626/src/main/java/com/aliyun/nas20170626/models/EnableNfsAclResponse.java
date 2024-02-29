// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableNfsAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableNfsAclResponseBody body;

    public static EnableNfsAclResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableNfsAclResponse self = new EnableNfsAclResponse();
        return TeaModel.build(map, self);
    }

    public EnableNfsAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableNfsAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableNfsAclResponse setBody(EnableNfsAclResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableNfsAclResponseBody getBody() {
        return this.body;
    }

}
