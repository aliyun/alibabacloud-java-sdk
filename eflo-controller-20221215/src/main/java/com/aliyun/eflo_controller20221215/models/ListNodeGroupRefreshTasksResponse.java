// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListNodeGroupRefreshTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeGroupRefreshTasksResponseBody body;

    public static ListNodeGroupRefreshTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupRefreshTasksResponse self = new ListNodeGroupRefreshTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupRefreshTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeGroupRefreshTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeGroupRefreshTasksResponse setBody(ListNodeGroupRefreshTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeGroupRefreshTasksResponseBody getBody() {
        return this.body;
    }

}
