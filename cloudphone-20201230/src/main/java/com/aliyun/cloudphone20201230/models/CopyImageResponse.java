// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class CopyImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyImageResponseBody body;

    public static CopyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyImageResponse self = new CopyImageResponse();
        return TeaModel.build(map, self);
    }

    public CopyImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyImageResponse setBody(CopyImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyImageResponseBody getBody() {
        return this.body;
    }

}
