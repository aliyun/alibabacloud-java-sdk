// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumUploadFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRumUploadFileUrlResponseBody body;

    public static CreateRumUploadFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRumUploadFileUrlResponse self = new CreateRumUploadFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateRumUploadFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRumUploadFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRumUploadFileUrlResponse setBody(CreateRumUploadFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRumUploadFileUrlResponseBody getBody() {
        return this.body;
    }

}
