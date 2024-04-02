// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageLibResponseBody body;

    public static CreateImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageLibResponse self = new CreateImageLibResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageLibResponse setBody(CreateImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageLibResponseBody getBody() {
        return this.body;
    }

}
