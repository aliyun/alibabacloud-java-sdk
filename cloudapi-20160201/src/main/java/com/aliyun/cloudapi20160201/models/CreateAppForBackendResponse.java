// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateAppForBackendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppForBackendResponseBody body;

    public static CreateAppForBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppForBackendResponse self = new CreateAppForBackendResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppForBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppForBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppForBackendResponse setBody(CreateAppForBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppForBackendResponseBody getBody() {
        return this.body;
    }

}
