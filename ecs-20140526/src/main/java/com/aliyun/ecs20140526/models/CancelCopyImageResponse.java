// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelCopyImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCopyImageResponseBody body;

    public static CancelCopyImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCopyImageResponse self = new CancelCopyImageResponse();
        return TeaModel.build(map, self);
    }

    public CancelCopyImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCopyImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCopyImageResponse setBody(CancelCopyImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCopyImageResponseBody getBody() {
        return this.body;
    }

}
