// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryResponseBody body;

    public static ListRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryResponse self = new ListRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryResponse setBody(ListRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryResponseBody getBody() {
        return this.body;
    }

}
