// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGameVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGameVersionsResponseBody body;

    public static ListGameVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGameVersionsResponse self = new ListGameVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListGameVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGameVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGameVersionsResponse setBody(ListGameVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGameVersionsResponseBody getBody() {
        return this.body;
    }

}
