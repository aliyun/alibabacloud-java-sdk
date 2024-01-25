// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class AttachNasFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachNasFileSystemResponseBody body;

    public static AttachNasFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachNasFileSystemResponse self = new AttachNasFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public AttachNasFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachNasFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachNasFileSystemResponse setBody(AttachNasFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachNasFileSystemResponseBody getBody() {
        return this.body;
    }

}
