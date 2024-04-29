// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDownloadResponseBody body;

    public static CreateDownloadResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadResponse self = new CreateDownloadResponse();
        return TeaModel.build(map, self);
    }

    public CreateDownloadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDownloadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDownloadResponse setBody(CreateDownloadResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDownloadResponseBody getBody() {
        return this.body;
    }

}
