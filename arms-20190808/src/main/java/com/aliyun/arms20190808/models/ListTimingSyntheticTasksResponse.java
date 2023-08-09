// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTimingSyntheticTasksResponseBody body;

    public static ListTimingSyntheticTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTimingSyntheticTasksResponse self = new ListTimingSyntheticTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTimingSyntheticTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTimingSyntheticTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTimingSyntheticTasksResponse setBody(ListTimingSyntheticTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTimingSyntheticTasksResponseBody getBody() {
        return this.body;
    }

}
