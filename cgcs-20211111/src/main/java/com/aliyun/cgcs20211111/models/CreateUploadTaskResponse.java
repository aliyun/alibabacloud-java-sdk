// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateUploadTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUploadTaskResponseBody body;

    public static CreateUploadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadTaskResponse self = new CreateUploadTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadTaskResponse setBody(CreateUploadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadTaskResponseBody getBody() {
        return this.body;
    }

}
