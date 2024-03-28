// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AddEntriesToAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddEntriesToAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEntriesToAclResponse setBody(AddEntriesToAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEntriesToAclResponseBody getBody() {
        return this.body;
    }

}
