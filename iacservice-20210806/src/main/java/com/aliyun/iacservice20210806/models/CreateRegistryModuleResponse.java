// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRegistryModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRegistryModuleResponseBody body;

    public static CreateRegistryModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryModuleResponse self = new CreateRegistryModuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRegistryModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRegistryModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRegistryModuleResponse setBody(CreateRegistryModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRegistryModuleResponseBody getBody() {
        return this.body;
    }

}
