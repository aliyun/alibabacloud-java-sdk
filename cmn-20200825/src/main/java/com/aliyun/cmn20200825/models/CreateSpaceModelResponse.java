// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateSpaceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSpaceModelResponseBody body;

    public static CreateSpaceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceModelResponse self = new CreateSpaceModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpaceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpaceModelResponse setBody(CreateSpaceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpaceModelResponseBody getBody() {
        return this.body;
    }

}
