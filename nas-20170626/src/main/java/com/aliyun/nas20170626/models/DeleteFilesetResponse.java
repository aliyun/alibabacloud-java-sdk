// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFilesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFilesetResponseBody body;

    public static DeleteFilesetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesetResponse self = new DeleteFilesetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFilesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFilesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFilesetResponse setBody(DeleteFilesetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFilesetResponseBody getBody() {
        return this.body;
    }

}
