// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageResponseBody body;

    public static ListImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageResponse self = new ListImageResponse();
        return TeaModel.build(map, self);
    }

    public ListImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageResponse setBody(ListImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageResponseBody getBody() {
        return this.body;
    }

}
