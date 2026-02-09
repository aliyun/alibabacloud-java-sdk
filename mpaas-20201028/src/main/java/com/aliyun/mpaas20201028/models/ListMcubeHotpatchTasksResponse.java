// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMcubeHotpatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMcubeHotpatchTasksResponseBody body;

    public static ListMcubeHotpatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMcubeHotpatchTasksResponse self = new ListMcubeHotpatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMcubeHotpatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMcubeHotpatchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMcubeHotpatchTasksResponse setBody(ListMcubeHotpatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMcubeHotpatchTasksResponseBody getBody() {
        return this.body;
    }

}
