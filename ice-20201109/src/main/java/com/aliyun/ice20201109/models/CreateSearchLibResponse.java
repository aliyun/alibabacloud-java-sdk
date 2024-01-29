// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSearchLibResponseBody body;

    public static CreateSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchLibResponse self = new CreateSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public CreateSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSearchLibResponse setBody(CreateSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSearchLibResponseBody getBody() {
        return this.body;
    }

}
