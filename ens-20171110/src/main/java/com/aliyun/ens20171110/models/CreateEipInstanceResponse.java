// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEipInstanceResponseBody body;

    public static CreateEipInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEipInstanceResponse self = new CreateEipInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEipInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEipInstanceResponse setBody(CreateEipInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEipInstanceResponseBody getBody() {
        return this.body;
    }

}
