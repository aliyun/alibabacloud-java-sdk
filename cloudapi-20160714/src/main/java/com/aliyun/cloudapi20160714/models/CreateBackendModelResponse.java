// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBackendModelResponseBody body;

    public static CreateBackendModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendModelResponse self = new CreateBackendModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackendModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackendModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackendModelResponse setBody(CreateBackendModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackendModelResponseBody getBody() {
        return this.body;
    }

}
