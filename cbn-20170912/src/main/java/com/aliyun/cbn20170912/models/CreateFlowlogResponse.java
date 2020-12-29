// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateFlowlogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowlogResponseBody body;

    public static CreateFlowlogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowlogResponse self = new CreateFlowlogResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowlogResponse setBody(CreateFlowlogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowlogResponseBody getBody() {
        return this.body;
    }

}
