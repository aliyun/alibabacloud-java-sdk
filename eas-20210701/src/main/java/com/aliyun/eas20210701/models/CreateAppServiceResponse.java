// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAppServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppServiceResponseBody body;

    public static CreateAppServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppServiceResponse self = new CreateAppServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppServiceResponse setBody(CreateAppServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppServiceResponseBody getBody() {
        return this.body;
    }

}
