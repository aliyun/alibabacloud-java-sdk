// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEdgeDriverResponseBody body;

    public static CreateEdgeDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeDriverResponse self = new CreateEdgeDriverResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeDriverResponse setBody(CreateEdgeDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeDriverResponseBody getBody() {
        return this.body;
    }

}
