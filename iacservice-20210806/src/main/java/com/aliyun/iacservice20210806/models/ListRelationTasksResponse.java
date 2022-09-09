// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRelationTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRelationTasksResponseBody body;

    public static ListRelationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRelationTasksResponse self = new ListRelationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListRelationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRelationTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRelationTasksResponse setBody(ListRelationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRelationTasksResponseBody getBody() {
        return this.body;
    }

}
