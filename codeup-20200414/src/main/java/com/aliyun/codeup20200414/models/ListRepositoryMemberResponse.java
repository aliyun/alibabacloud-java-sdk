// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryMemberResponseBody body;

    public static ListRepositoryMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryMemberResponse self = new ListRepositoryMemberResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryMemberResponse setBody(ListRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
