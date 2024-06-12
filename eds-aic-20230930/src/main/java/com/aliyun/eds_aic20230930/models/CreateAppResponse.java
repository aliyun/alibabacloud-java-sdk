// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppResponseBody body;

    public static CreateAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponse self = new CreateAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppResponse setBody(CreateAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppResponseBody getBody() {
        return this.body;
    }

}
