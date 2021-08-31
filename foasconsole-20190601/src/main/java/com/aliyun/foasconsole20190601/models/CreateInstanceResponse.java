// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class CreateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceResponseBody body;

    public static CreateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponse self = new CreateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceResponse setBody(CreateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceResponseBody getBody() {
        return this.body;
    }

}
