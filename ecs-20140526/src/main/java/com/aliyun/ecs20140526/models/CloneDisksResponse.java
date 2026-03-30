// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CloneDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneDisksResponseBody body;

    public static CloneDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneDisksResponse self = new CloneDisksResponse();
        return TeaModel.build(map, self);
    }

    public CloneDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneDisksResponse setBody(CloneDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneDisksResponseBody getBody() {
        return this.body;
    }

}
