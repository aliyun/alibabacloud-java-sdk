// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTagResourcesResponseBody body;

    public static CreateTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResourcesResponse self = new CreateTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagResourcesResponse setBody(CreateTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagResourcesResponseBody getBody() {
        return this.body;
    }

}
