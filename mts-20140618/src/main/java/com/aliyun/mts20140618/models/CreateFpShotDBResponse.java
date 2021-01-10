// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateFpShotDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFpShotDBResponseBody body;

    public static CreateFpShotDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFpShotDBResponse self = new CreateFpShotDBResponse();
        return TeaModel.build(map, self);
    }

    public CreateFpShotDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFpShotDBResponse setBody(CreateFpShotDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFpShotDBResponseBody getBody() {
        return this.body;
    }

}
