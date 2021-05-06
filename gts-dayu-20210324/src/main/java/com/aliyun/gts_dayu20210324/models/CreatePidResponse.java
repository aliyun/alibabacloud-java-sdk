// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class CreatePidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePidResponseBody body;

    public static CreatePidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePidResponse self = new CreatePidResponse();
        return TeaModel.build(map, self);
    }

    public CreatePidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePidResponse setBody(CreatePidResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePidResponseBody getBody() {
        return this.body;
    }

}
