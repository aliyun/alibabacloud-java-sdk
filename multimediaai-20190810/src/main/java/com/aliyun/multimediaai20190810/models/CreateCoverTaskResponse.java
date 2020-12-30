// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateCoverTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCoverTaskResponseBody body;

    public static CreateCoverTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCoverTaskResponse self = new CreateCoverTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCoverTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCoverTaskResponse setBody(CreateCoverTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCoverTaskResponseBody getBody() {
        return this.body;
    }

}
