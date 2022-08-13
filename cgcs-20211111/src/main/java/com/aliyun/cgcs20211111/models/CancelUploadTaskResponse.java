// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CancelUploadTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelUploadTaskResponseBody body;

    public static CancelUploadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUploadTaskResponse self = new CancelUploadTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelUploadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUploadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelUploadTaskResponse setBody(CancelUploadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUploadTaskResponseBody getBody() {
        return this.body;
    }

}
