// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDesktopsResponseBody body;

    public static CreateDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsResponse self = new CreateDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDesktopsResponse setBody(CreateDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopsResponseBody getBody() {
        return this.body;
    }

}
