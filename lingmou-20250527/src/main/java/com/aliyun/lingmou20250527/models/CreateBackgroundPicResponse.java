// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBackgroundPicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBackgroundPicResponseBody body;

    public static CreateBackgroundPicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackgroundPicResponse self = new CreateBackgroundPicResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackgroundPicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackgroundPicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackgroundPicResponse setBody(CreateBackgroundPicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackgroundPicResponseBody getBody() {
        return this.body;
    }

}
