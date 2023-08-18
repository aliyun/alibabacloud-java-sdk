// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectUserResponseBody body;

    public static ListProjectUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectUserResponse self = new ListProjectUserResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectUserResponse setBody(ListProjectUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectUserResponseBody getBody() {
        return this.body;
    }

}
