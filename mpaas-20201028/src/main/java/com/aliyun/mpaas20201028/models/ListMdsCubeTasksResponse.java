// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMdsCubeTasksResponseBody body;

    public static ListMdsCubeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeTasksResponse self = new ListMdsCubeTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMdsCubeTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMdsCubeTasksResponse setBody(ListMdsCubeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMdsCubeTasksResponseBody getBody() {
        return this.body;
    }

}
