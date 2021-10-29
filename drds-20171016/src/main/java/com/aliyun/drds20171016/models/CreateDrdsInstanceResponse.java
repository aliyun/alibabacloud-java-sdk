// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDrdsInstanceResponseBody body;

    public static CreateDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsInstanceResponse self = new CreateDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrdsInstanceResponse setBody(CreateDrdsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrdsInstanceResponseBody getBody() {
        return this.body;
    }

}
