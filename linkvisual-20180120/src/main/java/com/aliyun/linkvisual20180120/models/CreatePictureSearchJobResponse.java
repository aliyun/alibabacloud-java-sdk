// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePictureSearchJobResponseBody body;

    public static CreatePictureSearchJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchJobResponse self = new CreatePictureSearchJobResponse();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePictureSearchJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePictureSearchJobResponse setBody(CreatePictureSearchJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePictureSearchJobResponseBody getBody() {
        return this.body;
    }

}
