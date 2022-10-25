// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberWithInheritedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryMemberWithInheritedResponseBody body;

    public static ListRepositoryMemberWithInheritedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberWithInheritedResponse self = new ListRepositoryMemberWithInheritedResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberWithInheritedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryMemberWithInheritedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryMemberWithInheritedResponse setBody(ListRepositoryMemberWithInheritedResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryMemberWithInheritedResponseBody getBody() {
        return this.body;
    }

}
