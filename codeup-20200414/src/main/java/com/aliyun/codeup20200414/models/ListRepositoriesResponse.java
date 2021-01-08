// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoriesResponseBody body;

    public static ListRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoriesResponse self = new ListRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoriesResponse setBody(ListRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoriesResponseBody getBody() {
        return this.body;
    }

}
