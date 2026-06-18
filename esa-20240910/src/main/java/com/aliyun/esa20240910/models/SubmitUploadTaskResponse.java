// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SubmitUploadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitUploadTaskResponseBody body;

    public static SubmitUploadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitUploadTaskResponse self = new SubmitUploadTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitUploadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitUploadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitUploadTaskResponse setBody(SubmitUploadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitUploadTaskResponseBody getBody() {
        return this.body;
    }

}
