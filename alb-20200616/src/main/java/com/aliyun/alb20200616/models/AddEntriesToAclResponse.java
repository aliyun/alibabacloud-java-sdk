// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddEntriesToAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEntriesToAclResponseBody body;

    public static AddEntriesToAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEntriesToAclResponse self = new AddEntriesToAclResponse();
        return TeaModel.build(map, self);
    }

    public AddEntriesToAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEntriesToAclResponse setBody(AddEntriesToAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEntriesToAclResponseBody getBody() {
        return this.body;
    }

}
