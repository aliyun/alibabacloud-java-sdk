// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ResetFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ResetFileSystemResponse setBody(ResetFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetFileSystemResponseBody getBody() {
        return this.body;
    }

}
