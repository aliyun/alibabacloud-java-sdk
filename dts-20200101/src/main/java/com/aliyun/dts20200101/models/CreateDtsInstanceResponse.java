// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDtsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDtsInstanceResponseBody body;

    public static CreateDtsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDtsInstanceResponse self = new CreateDtsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDtsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDtsInstanceResponse setBody(CreateDtsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDtsInstanceResponseBody getBody() {
        return this.body;
    }

}
