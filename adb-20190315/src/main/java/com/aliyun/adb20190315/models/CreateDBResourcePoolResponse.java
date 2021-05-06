// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBResourcePoolResponseBody body;

    public static CreateDBResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourcePoolResponse self = new CreateDBResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBResourcePoolResponse setBody(CreateDBResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBResourcePoolResponseBody getBody() {
        return this.body;
    }

}
