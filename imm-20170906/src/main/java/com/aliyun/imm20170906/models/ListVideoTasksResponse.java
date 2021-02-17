// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListVideoTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVideoTasksResponseBody body;

    public static ListVideoTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVideoTasksResponse self = new ListVideoTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListVideoTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVideoTasksResponse setBody(ListVideoTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVideoTasksResponseBody getBody() {
        return this.body;
    }

}
