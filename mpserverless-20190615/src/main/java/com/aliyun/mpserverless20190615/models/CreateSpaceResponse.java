// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSpaceResponseBody body;

    public static CreateSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceResponse self = new CreateSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpaceResponse setBody(CreateSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpaceResponseBody getBody() {
        return this.body;
    }

}
