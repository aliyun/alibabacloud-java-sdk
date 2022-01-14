// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMcubeNebulaTasksResponseBody body;

    public static ListMcubeNebulaTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeNebulaTasksResponse self = new ListMcubeNebulaTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeNebulaTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeNebulaTasksResponse setBody(ListMcubeNebulaTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeNebulaTasksResponseBody getBody() {
        return this.body;
    }

}
