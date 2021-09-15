// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateModuleResponseBody body;

    public static CreateModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModuleResponse self = new CreateModuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModuleResponse setBody(CreateModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModuleResponseBody getBody() {
        return this.body;
    }

}
