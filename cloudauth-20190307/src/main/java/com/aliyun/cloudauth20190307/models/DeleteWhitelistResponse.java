// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWhitelistResponseBody body;

    public static DeleteWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistResponse self = new DeleteWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWhitelistResponse setBody(DeleteWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWhitelistResponseBody getBody() {
        return this.body;
    }

}
