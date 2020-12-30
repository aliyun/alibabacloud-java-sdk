// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateWhitelistResponseBody body;

    public static CreateWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistResponse self = new CreateWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWhitelistResponse setBody(CreateWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWhitelistResponseBody getBody() {
        return this.body;
    }

}
