// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppConfigResponseBody body;

    public static CreateAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppConfigResponse self = new CreateAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppConfigResponse setBody(CreateAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppConfigResponseBody getBody() {
        return this.body;
    }

}
