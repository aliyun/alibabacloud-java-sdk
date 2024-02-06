// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateOpenSingleDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpenSingleDataResponseBody body;

    public static CreateOpenSingleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSingleDataResponse self = new CreateOpenSingleDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenSingleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenSingleDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpenSingleDataResponse setBody(CreateOpenSingleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenSingleDataResponseBody getBody() {
        return this.body;
    }

}
