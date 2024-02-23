// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAclResponseBody body;

    public static DeleteAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclResponse self = new DeleteAclResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAclResponse setBody(DeleteAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAclResponseBody getBody() {
        return this.body;
    }

}
