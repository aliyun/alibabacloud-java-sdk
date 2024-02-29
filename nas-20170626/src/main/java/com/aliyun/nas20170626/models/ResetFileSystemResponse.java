// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ResetFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetFileSystemResponseBody body;

    public static ResetFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetFileSystemResponse self = new ResetFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public ResetFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetFileSystemResponse setBody(ResetFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetFileSystemResponseBody getBody() {
        return this.body;
    }

}
