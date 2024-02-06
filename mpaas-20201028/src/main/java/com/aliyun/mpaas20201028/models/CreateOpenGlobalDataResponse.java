// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateOpenGlobalDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpenGlobalDataResponseBody body;

    public static CreateOpenGlobalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenGlobalDataResponse self = new CreateOpenGlobalDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenGlobalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenGlobalDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpenGlobalDataResponse setBody(CreateOpenGlobalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenGlobalDataResponseBody getBody() {
        return this.body;
    }

}
