// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListGroupRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupRepositoriesResponseBody body;

    public static ListGroupRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRepositoriesResponse self = new ListGroupRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupRepositoriesResponse setBody(ListGroupRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupRepositoriesResponseBody getBody() {
        return this.body;
    }

}
