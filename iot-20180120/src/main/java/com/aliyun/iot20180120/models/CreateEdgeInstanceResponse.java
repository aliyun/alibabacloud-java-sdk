// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEdgeInstanceResponseBody body;

    public static CreateEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceResponse self = new CreateEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeInstanceResponse setBody(CreateEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
