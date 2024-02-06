// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeNebulaTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListMcubeNebulaTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeNebulaTasksResponse setBody(ListMcubeNebulaTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeNebulaTasksResponseBody getBody() {
        return this.body;
    }

}
