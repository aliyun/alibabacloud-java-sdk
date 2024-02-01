// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePictureSearchAppResponseBody body;

    public static CreatePictureSearchAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchAppResponse self = new CreatePictureSearchAppResponse();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePictureSearchAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePictureSearchAppResponse setBody(CreatePictureSearchAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePictureSearchAppResponseBody getBody() {
        return this.body;
    }

}
