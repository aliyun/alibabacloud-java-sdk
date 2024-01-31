// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class FileModerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FileModerationResponseBody body;

    public static FileModerationResponse build(java.util.Map<String, ?> map) throws Exception {
        FileModerationResponse self = new FileModerationResponse();
        return TeaModel.build(map, self);
    }

    public FileModerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileModerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileModerationResponse setBody(FileModerationResponseBody body) {
        this.body = body;
        return this;
    }
    public FileModerationResponseBody getBody() {
        return this.body;
    }

}
