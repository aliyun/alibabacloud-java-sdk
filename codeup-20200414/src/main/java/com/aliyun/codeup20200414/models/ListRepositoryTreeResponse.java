// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryTreeResponseBody body;

    public static ListRepositoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTreeResponse self = new ListRepositoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryTreeResponse setBody(ListRepositoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryTreeResponseBody getBody() {
        return this.body;
    }

}
