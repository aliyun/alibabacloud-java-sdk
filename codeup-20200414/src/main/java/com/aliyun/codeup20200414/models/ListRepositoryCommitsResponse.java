// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryCommitsResponseBody body;

    public static ListRepositoryCommitsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitsResponse self = new ListRepositoryCommitsResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryCommitsResponse setBody(ListRepositoryCommitsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryCommitsResponseBody getBody() {
        return this.body;
    }

}
