// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DetachNasFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachNasFileSystemResponseBody body;

    public static DetachNasFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachNasFileSystemResponse self = new DetachNasFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public DetachNasFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachNasFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachNasFileSystemResponse setBody(DetachNasFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachNasFileSystemResponseBody getBody() {
        return this.body;
    }

}
