// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourceLogResponseBody body;

    public static CreateResourceLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceLogResponse self = new CreateResourceLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourceLogResponse setBody(CreateResourceLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourceLogResponseBody getBody() {
        return this.body;
    }

}
