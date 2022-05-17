// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLabsResponseBody body;

    public static ListLabsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLabsResponse self = new ListLabsResponse();
        return TeaModel.build(map, self);
    }

    public ListLabsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLabsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLabsResponse setBody(ListLabsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLabsResponseBody getBody() {
        return this.body;
    }

}
