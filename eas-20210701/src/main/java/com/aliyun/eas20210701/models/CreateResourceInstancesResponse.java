// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceInstancesResponseBody body;

    public static CreateResourceInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInstancesResponse self = new CreateResourceInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceInstancesResponse setBody(CreateResourceInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceInstancesResponseBody getBody() {
        return this.body;
    }

}
