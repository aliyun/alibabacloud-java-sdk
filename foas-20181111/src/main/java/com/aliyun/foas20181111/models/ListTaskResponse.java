// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTaskResponseBody body;

    public static ListTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResponse self = new ListTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskResponse setBody(ListTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskResponseBody getBody() {
        return this.body;
    }

}
