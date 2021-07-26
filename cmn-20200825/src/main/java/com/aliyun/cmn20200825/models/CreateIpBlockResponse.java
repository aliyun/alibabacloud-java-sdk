// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIpBlockResponseBody body;

    public static CreateIpBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockResponse self = new CreateIpBlockResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpBlockResponse setBody(CreateIpBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpBlockResponseBody getBody() {
        return this.body;
    }

}
