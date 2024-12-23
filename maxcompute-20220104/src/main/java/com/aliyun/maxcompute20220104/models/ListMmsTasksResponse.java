// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsTasksResponseBody body;

    public static ListMmsTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTasksResponse self = new ListMmsTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsTasksResponse setBody(ListMmsTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsTasksResponseBody getBody() {
        return this.body;
    }

}
