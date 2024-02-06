// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeMiniTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListMcubeMiniTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeMiniTasksResponse setBody(ListMcubeMiniTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeMiniTasksResponseBody getBody() {
        return this.body;
    }

}
