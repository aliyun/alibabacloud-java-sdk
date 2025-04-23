// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListExplorerTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExplorerTasksResponseBody body;

    public static ListExplorerTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExplorerTasksResponse self = new ListExplorerTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListExplorerTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExplorerTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExplorerTasksResponse setBody(ListExplorerTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExplorerTasksResponseBody getBody() {
        return this.body;
    }

}
