// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomEntityResponseBody body;

    public static CreateCustomEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEntityResponse self = new CreateCustomEntityResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomEntityResponse setBody(CreateCustomEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomEntityResponseBody getBody() {
        return this.body;
    }

}
