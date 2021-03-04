// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateCostUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCostUnitResponseBody body;

    public static CreateCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCostUnitResponse self = new CreateCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public CreateCostUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCostUnitResponse setBody(CreateCostUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCostUnitResponseBody getBody() {
        return this.body;
    }

}
