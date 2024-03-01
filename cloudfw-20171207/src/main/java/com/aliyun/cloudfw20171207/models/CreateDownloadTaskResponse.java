// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateDownloadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDownloadTaskResponseBody body;

    public static CreateDownloadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadTaskResponse self = new CreateDownloadTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDownloadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDownloadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDownloadTaskResponse setBody(CreateDownloadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDownloadTaskResponseBody getBody() {
        return this.body;
    }

}
