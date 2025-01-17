// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBindInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBindInfoResponseBody body;

    public static ListBindInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBindInfoResponse self = new ListBindInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListBindInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBindInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBindInfoResponse setBody(ListBindInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBindInfoResponseBody getBody() {
        return this.body;
    }

}
