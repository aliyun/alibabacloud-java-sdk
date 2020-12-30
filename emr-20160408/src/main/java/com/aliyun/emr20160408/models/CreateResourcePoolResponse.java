// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourcePoolResponseBody body;

    public static CreateResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePoolResponse self = new CreateResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourcePoolResponse setBody(CreateResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourcePoolResponseBody getBody() {
        return this.body;
    }

}
