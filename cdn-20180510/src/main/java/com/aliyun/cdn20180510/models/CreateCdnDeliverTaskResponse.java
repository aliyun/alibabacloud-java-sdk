// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCdnDeliverTaskResponseBody body;

    public static CreateCdnDeliverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnDeliverTaskResponse self = new CreateCdnDeliverTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdnDeliverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdnDeliverTaskResponse setBody(CreateCdnDeliverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdnDeliverTaskResponseBody getBody() {
        return this.body;
    }

}
