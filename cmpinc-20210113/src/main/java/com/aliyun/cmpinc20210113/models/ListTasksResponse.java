// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class ListTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTasksResponseBody body;

    public static ListTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponse self = new ListTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTasksResponse setBody(ListTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTasksResponseBody getBody() {
        return this.body;
    }

}
