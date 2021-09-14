// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateScreenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScreenResponseBody body;

    public static CreateScreenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenResponse self = new CreateScreenResponse();
        return TeaModel.build(map, self);
    }

    public CreateScreenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScreenResponse setBody(CreateScreenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScreenResponseBody getBody() {
        return this.body;
    }

}
