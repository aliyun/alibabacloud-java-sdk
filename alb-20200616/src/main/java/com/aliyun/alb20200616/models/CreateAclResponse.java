// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAclResponseBody body;

    public static CreateAclResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAclResponse self = new CreateAclResponse();
        return TeaModel.build(map, self);
    }

    public CreateAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAclResponse setBody(CreateAclResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAclResponseBody getBody() {
        return this.body;
    }

}
