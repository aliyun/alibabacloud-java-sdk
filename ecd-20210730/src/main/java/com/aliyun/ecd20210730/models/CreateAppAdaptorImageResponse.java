// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppAdaptorImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppAdaptorImageResponseBody body;

    public static CreateAppAdaptorImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAdaptorImageResponse self = new CreateAppAdaptorImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppAdaptorImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppAdaptorImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppAdaptorImageResponse setBody(CreateAppAdaptorImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppAdaptorImageResponseBody getBody() {
        return this.body;
    }

}
