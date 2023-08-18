// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectResponseBody body;

    public static ListProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponse self = new ListProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectResponse setBody(ListProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectResponseBody getBody() {
        return this.body;
    }

}
