// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edsofficeservice20221125.models;

import com.aliyun.tea.*;

public class CreateDesktopPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDesktopPoolResponseBody body;

    public static CreateDesktopPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopPoolResponse self = new CreateDesktopPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateDesktopPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDesktopPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDesktopPoolResponse setBody(CreateDesktopPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopPoolResponseBody getBody() {
        return this.body;
    }

}
