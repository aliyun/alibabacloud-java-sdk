// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListRepositoryMemberResponse setBody(ListRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
