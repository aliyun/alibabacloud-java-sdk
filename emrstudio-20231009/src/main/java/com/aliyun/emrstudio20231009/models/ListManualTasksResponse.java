// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class ListManualTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManualTasksResponseBody body;

    public static ListManualTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManualTasksResponse self = new ListManualTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListManualTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManualTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManualTasksResponse setBody(ListManualTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManualTasksResponseBody getBody() {
        return this.body;
    }

}
