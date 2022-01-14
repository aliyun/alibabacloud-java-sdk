// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMcubeMiniTasksResponseBody body;

    public static ListMcubeMiniTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeMiniTasksResponse self = new ListMcubeMiniTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeMiniTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeMiniTasksResponse setBody(ListMcubeMiniTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeMiniTasksResponseBody getBody() {
        return this.body;
    }

}
