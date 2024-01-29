// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadMediaResponseBody body;

    public static CreateUploadMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaResponse self = new CreateUploadMediaResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadMediaResponse setBody(CreateUploadMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadMediaResponseBody getBody() {
        return this.body;
    }

}
