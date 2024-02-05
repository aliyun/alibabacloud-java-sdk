// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRunningTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRunningTasksResponseBody body;

    public static GetRunningTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRunningTasksResponse self = new GetRunningTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetRunningTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRunningTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRunningTasksResponse setBody(GetRunningTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRunningTasksResponseBody getBody() {
        return this.body;
    }

}
