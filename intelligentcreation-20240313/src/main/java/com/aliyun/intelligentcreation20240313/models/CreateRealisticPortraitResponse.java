// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateRealisticPortraitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRealisticPortraitResponseBody body;

    public static CreateRealisticPortraitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealisticPortraitResponse self = new CreateRealisticPortraitResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealisticPortraitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRealisticPortraitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRealisticPortraitResponse setBody(CreateRealisticPortraitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRealisticPortraitResponseBody getBody() {
        return this.body;
    }

}
