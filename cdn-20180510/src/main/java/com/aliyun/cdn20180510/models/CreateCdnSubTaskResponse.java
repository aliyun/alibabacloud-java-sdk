// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCdnSubTaskResponseBody body;

    public static CreateCdnSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnSubTaskResponse self = new CreateCdnSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdnSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdnSubTaskResponse setBody(CreateCdnSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdnSubTaskResponseBody getBody() {
        return this.body;
    }

}
