// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBasicIpSetResponseBody body;

    public static CreateBasicIpSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicIpSetResponse self = new CreateBasicIpSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicIpSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicIpSetResponse setBody(CreateBasicIpSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicIpSetResponseBody getBody() {
        return this.body;
    }

}
