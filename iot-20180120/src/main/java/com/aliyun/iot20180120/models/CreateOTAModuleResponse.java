// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOTAModuleResponseBody body;

    public static CreateOTAModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAModuleResponse self = new CreateOTAModuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOTAModuleResponse setBody(CreateOTAModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOTAModuleResponseBody getBody() {
        return this.body;
    }

}
