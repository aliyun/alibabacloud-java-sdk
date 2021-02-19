// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEaiAllResponseBody body;

    public static CreateEaiAllResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiAllResponse self = new CreateEaiAllResponse();
        return TeaModel.build(map, self);
    }

    public CreateEaiAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEaiAllResponse setBody(CreateEaiAllResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEaiAllResponseBody getBody() {
        return this.body;
    }

}
