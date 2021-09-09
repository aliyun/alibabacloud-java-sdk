// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDataTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataTasksResponseBody body;

    public static ListDataTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataTasksResponse self = new ListDataTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListDataTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataTasksResponse setBody(ListDataTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataTasksResponseBody getBody() {
        return this.body;
    }

}
