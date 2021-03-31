// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDemandResponseBody body;

    public static CreateDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandResponse self = new CreateDemandResponse();
        return TeaModel.build(map, self);
    }

    public CreateDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDemandResponse setBody(CreateDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDemandResponseBody getBody() {
        return this.body;
    }

}
