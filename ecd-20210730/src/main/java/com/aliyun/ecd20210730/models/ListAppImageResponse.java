// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppImageResponseBody body;

    public static ListAppImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppImageResponse self = new ListAppImageResponse();
        return TeaModel.build(map, self);
    }

    public ListAppImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppImageResponse setBody(ListAppImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppImageResponseBody getBody() {
        return this.body;
    }

}
