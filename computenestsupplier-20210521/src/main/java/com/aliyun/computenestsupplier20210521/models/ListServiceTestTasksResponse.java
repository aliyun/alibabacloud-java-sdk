// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServiceTestTasksResponseBody body;

    public static ListServiceTestTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestTasksResponse self = new ListServiceTestTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceTestTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceTestTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServiceTestTasksResponse setBody(ListServiceTestTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceTestTasksResponseBody getBody() {
        return this.body;
    }

}
