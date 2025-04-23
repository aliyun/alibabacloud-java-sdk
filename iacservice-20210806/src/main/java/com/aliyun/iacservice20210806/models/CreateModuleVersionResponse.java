// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateModuleVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModuleVersionResponseBody body;

    public static CreateModuleVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleVersionResponse self = new CreateModuleVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateModuleVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModuleVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModuleVersionResponse setBody(CreateModuleVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModuleVersionResponseBody getBody() {
        return this.body;
    }

}
