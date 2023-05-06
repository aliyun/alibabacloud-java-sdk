// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppVersionAdaptorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppVersionAdaptorResponseBody body;

    public static CreateAppVersionAdaptorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionAdaptorResponse self = new CreateAppVersionAdaptorResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionAdaptorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppVersionAdaptorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppVersionAdaptorResponse setBody(CreateAppVersionAdaptorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppVersionAdaptorResponseBody getBody() {
        return this.body;
    }

}
